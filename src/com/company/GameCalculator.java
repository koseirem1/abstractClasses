package com.company;

public abstract class GameCalculator {
  //abstract classes must be implemented in all inherited classes
    public abstract void calculate();

    //can not override. It is used the same in all inherited classes
    public final void gameOver() {
        System.out.println("Game Over");
    }
}
