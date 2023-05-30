package com.javarush.test.level22.lesson18.big01;

import java.awt.event.KeyEvent;

public class Tetris {

    private Field field;                //Поле с клетками
    private Figure figure;              //Фигурка

    private boolean isGameOver;         //Игра Окончена?

    public Tetris(int width, int height)
    {
        field = new Field(width, height);
        figure = null;
    }
    /**
     * Геттер переменной field.
     */
    public Field getField()
    {
        return field;
    }
    /**
     * Геттер переменной figure.
     */
    public Figure getFigure()
    {
        return figure;
    }
    /**
     *  Основной цикл программы.
     *  Тут происходят все важные действия
     */
    public void run() throws Exception
    {
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();


        isGameOver = false;
        //создаем первую фигурку посередине сверху: x - половина ширины, y - 0.
        figure = FigureFactory.createRandomFigure(field.getWidth() / 2, 0);

        //пока игра не окончена
        while (!isGameOver)
        {
            if (keyboardObserver.hasKeyEvents())
            {
                KeyEvent event = keyboardObserver.getEventFromTop();
                if (event.getKeyChar() == 'q') return;
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    figure.left();
                else if (event.getKeyCode() ==  KeyEvent.VK_RIGHT)
                    figure.right();
                else if (event.getKeyCode() ==  12)
                    figure.rotate();
                    //Если "пробел" - фигурка падает вниз на максимум
                else if (event.getKeyCode() ==  KeyEvent.VK_SPACE)
                    figure.downMaximum();
            }

            step();
            field.print();
            Thread.sleep(300);
        }


        System.out.println("Game Over");
    }

    public void step()
    { //опускам фигурку вниз
        figure.down();


        if (!figure.isCurrentPositionAvailable())
        {
            figure.up();
            figure.landed();

            isGameOver = figure.getY() <= 1;

            field.removeFullLines();

            figure = FigureFactory.createRandomFigure(field.getWidth() / 2, 0);

        }}


    public void setFigure(Figure figure)
    {
        this.figure = figure;
    }

    public void setField(Field field)
    {
        this.field = field;
    }

    public static Tetris game;
    public static void main(String[] args) throws Exception
    {
        game = new Tetris(10, 20);
        game.run();
    }

}
