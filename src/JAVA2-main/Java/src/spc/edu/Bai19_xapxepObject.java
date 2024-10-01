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
public class Bai19_xapxepObject {

    public static void main(String[] args) {
        String ten;
        double diem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        SinhVien sv[] = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            System.out.println("Nhap ten sinh vien");
            ten = sc.nextLine();
            sv[i].setTen(ten);
            System.out.println("Nhap Diem");
            diem = sc.nextDouble();
            sv[i].setDiem(diem);
            sc.nextLine();
        }
   
            for (int x = 0; x < n; x++) {
                for (int y = x + 1; y < n; y++) {
                    if (sv[x].getDiem() < sv[y].getDiem()) {
                        SinhVien tam = new SinhVien();
                        tam = sv[x];
                        sv[x] = sv[y];
                        sv[y] = tam;
                    }
                    for (int j = 0; j < n; j++) {
                        System.out.println("Ho va ten sinh vien:" + sv[j].getTen());
                        System.out.println("Diem" + sv[j].getDiem());
                        if (sv[j].getDiem() < 5) {
                            System.out.println("Hoc luc yeu");
                        } else if (sv[j].getDiem() <= 6) {
                            System.out.println("Hoc luc Trung Binh");
                        } else if (sv[j].getDiem() <= 8) {
                            System.out.println("Hoc luc kha");
                        } else if (sv[j].getDiem() > 8) {
                            System.out.println("Hoc luc gioi");
                        }
                    }
                }
            }
        }

    }

