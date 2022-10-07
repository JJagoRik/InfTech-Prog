package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        int b = 0;
        vivod(b);
        vivod(++b);
    }
    static void vivod(int a){
        System.out.println(a);
    }

}