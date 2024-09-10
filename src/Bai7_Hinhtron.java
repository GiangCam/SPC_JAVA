/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai7_Hinhtron {
    public static void main(String[] args) {
        System.out.println("chuong trinh hinh tron");
        Scanner sc = new Scanner(System.in);
        double bankinh, Chuvi, DienTich;
        
        System.out.println("Nhap bankinh");
        bankinh = sc.nextDouble();
        
        Chuvi = 2 * (Math.PI + bankinh);
        DienTich = Math.PI * (bankinh * 2);
        System.out.println("Chu Vi: "+ Chuvi);
        System.out.println("Dien Tich: "+ DienTich);
    }
}
