/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BTKT_De2_cau1 {

    public static void main(String[] args) {
        System.out.println("Chuong Trinh Day So fibonacci");
        Scanner sc = new Scanner(System.in);
            int so1 = 0, so2 = 1,tong, soluong;
             System.out.println("so luong:");
             soluong=sc.nextInt();
             for (int i =0; i <= soluong; i++){
                tong = so1 + so2;
                System.out.println(tong+" ");
             }
             
    }

}
