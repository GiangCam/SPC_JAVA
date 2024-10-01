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
public class BTKT_De2_cau2 {
       public static void main(String[] args) {
            System.out.println("chuong trinh tinh dien tich the tich hình cau");
        Scanner sc= new Scanner(System.in);
        double d, s, v;
            System.out.println(" Nhap ban kinh");
            d = sc.nextInt();
           double S = Math.PI*(d*d);
            System.out.println(" Dien Tich là: " + S);
           double V = (Math.PI*(d*d*d))/6;
             System.out.println(" The Tich+ là: " + S);
       }
}
