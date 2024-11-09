/* class First{
    public static void main(String args[]){
        System.out.print("Hello World\n");
        String name = "tony stark";
        int age = 48;
        double price= 20.53;

        age = 55;
        System.out.println(name + ", Age: "+age);

        int sum = age+16;
        System.out.println(sum);//comments
        
    }
} */

//package com.apnacollege;

import java.util.*;

public class First {
    public static void main(String[] args){
        /* //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nsxtInt()
        //nextFloat()
        System.out.println(name); */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);

    }
}