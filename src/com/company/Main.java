package com.company;

import java.util.Scanner;

public class Main {


    static void represent(long x){

        String powerName[] = {"","","հարյուր","հազար","","","միլիոն","","","միլիարդ"};
        String names10[] = {"","տասն","քսան","երեսուն","քառասուն","հիսուն","վաթսուն","յոթանասուն","ութսուն","իննսուն"};
        String digitName[] = {"","մեկ","երկու","երեք","չորս","հինգ","վեց","յոթ","ութ","ինն"};
        String s = String.valueOf(x);

        if(x==10)
        {
            System.out.println("տասը");
            return;
        }
        else if(x==0)
        {
            System.out.println("զրո");
            return;
        }
        int sum=0;
        for(int j=0;j<s.length();j++)
        {
            int i=s.length()-1-j;
            int digit = s.charAt(j)-'0';
            sum+=digit;
            if(digit!=0) {
                if (i % 3 == 1)
                    System.out.print(names10[digit]);
                else {
                    if (digit > 1 || i==0)
                        System.out.print(digitName[digit] + " ");
                    if(powerName[i%3].length()>0)
                        System.out.print(powerName[i % 3] + " ");
                }
            }
            if(i%3==0) {
                if(sum>0 && powerName[i].length()>0)
                    System.out.print(powerName[i] + " ");
                sum=0;
            }
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        represent(num);
    }
}
