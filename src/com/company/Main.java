package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a int value to swap : ");
        int startValue = scanner.nextInt();

//        int startValue = 23256;
        int module,division  = 0;
        int swap = 0;

        while(startValue > 0){
            module = getModule(startValue); // 6

            division = getDivision(startValue); // 2325

            swap = swap * 10 + module;
//            System.out.println(swap);
            startValue = division;



        }
        System.out.print("Swap int value : " + swap);
        ;

    }

    private static int getDivision(int value) {
        int division = 0;
        division = value / 10;
        return division;
    }

    private static int getModule(int value) {
        int module = 0;
        module = value % 10;
        return module;

    }

}
