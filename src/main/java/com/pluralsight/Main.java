package com.pluralsight;


public class Main {
    public static void main(String[] args)throws InterruptedException {
        Dice dice = new Dice();

        int roll1;
        int roll2;

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int x = 0; x < 101; x++){
            roll1 = dice.roll();
            roll2 = dice.roll();Thread.sleep(200);
            int sum = roll1 + roll2;
            System.out.printf("Role %d:   %d  -  %d    sum:  %d\n",x,roll1,roll2,sum);

            if (sum == 2){count2++;}
            if (sum == 4){count4++;}
            if (sum == 6){count6++;}
            if (sum == 7){count7++;}

        }
        System.out.println();
        System.out.printf("Counter 2: %d\n", count2);
        System.out.printf("Counter 4: %d\n", count4);
        System.out.printf("Counter 6: %d\n", count6);
        System.out.printf("Counter 7: %d\n", count7);
    }
}