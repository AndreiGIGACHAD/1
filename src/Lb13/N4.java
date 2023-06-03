package Lb13;

public class N4 {
    public static class N implements Runnable {
        private int threadNumber;

        public N(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            System.out.println("Thread " + threadNumber + " is running.");
        }

        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                N thread = new N(i);
                Thread t = new Thread(thread);
                t.start();
            }
        }
    }

}
