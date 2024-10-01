/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai18_String01 {
      public static void main(String[] args) {
        System.out.println("baitapstring");
          Scanner sc= new Scanner(System.in);
          //Vo Truong Giang
          System.out.println("Nhap Ho Va Ten");
           String hovaten;
          hovaten = sc.nextLine();
            System.out.println("Ho:" + hovaten.substring(0, 3));
             System.out.println("Ten lot:" + hovaten.substring(3, 9));
              System.out.println("Ten:" + hovaten.substring(10));
              System.out.println("Ten:" + hovaten.length());
}
}
