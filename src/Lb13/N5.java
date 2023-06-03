package Lb13;
import java.util.concurrent.*;

public class N5 {


        public static int findMax(int[] array) {
            int processors = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(processors);
            int[] results = new int[processors];

            int chunkSize = array.length / processors;
            int startIndex = 0;
            int endIndex = chunkSize;

            for (int i = 0; i < processors; i++) {
                int finalStartIndex = startIndex;
                int finalEndIndex = endIndex;
                int finalI = i;
                executor.execute(() -> {
                    int max = Integer.MIN_VALUE;
                    for (int j = finalStartIndex; j < finalEndIndex; j++) {
                        if (array[j] > max) {
                            max = array[j];
                        }
                    }
                    results[finalI] = max;
                });

                startIndex = endIndex;
                endIndex += chunkSize;
            }

            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int max = Integer.MIN_VALUE;
            for (int result : results) {
                if (result > max) {
                    max = result;
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] array = {4, 8, 2, 10, 6, 1, 9, 3, 7, 5};
            int max = findMax(array);
            System.out.println("Max element: " + max);
        }
    }

