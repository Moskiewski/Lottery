package io.lottery;

public class NumberDisplayer {
    public void displayUserNumber(int[] userNumber) {
        System.out.println("Your numbers are:");
        for (int i : userNumber) {
            System.out.print(i + " ");
        }
    }
}