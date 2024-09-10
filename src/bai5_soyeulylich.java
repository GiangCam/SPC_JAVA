
import java.awt.BorderLayout;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class bai5_soyeulylich {
    public static void main(String[] args) {
        System.out.println("Chuong trinh QUAY LY SINH VIEN");
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ho va ten");
        String hoten = sc.nextLine();
        System.out.println("Nhap nam sịnh cua ban:");
        int namsinh = sc.nextInt();
        System.out.println("Chao ban" + hoten);
        int tuoi = 2024 - namsinh;
        System.out.println("tuoi cua ban la" + tuoi);
                
    }
}
