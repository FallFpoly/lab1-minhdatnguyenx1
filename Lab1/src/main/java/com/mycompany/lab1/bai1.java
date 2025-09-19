/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        // sinh viên code ở đây
        Scanner sc=new Scanner(System.in);
        double diemtb;
        String hoten;
        System.out.print("Ho ten: ");
        hoten=sc.next();
        System.out.print("Diem TB: ");
        diemtb=sc.nextDouble();
        System.out.println("\n===== Thong tin =====");
        System.out.println("Ho ten: " + hoten);
        System.out.println("Diem TB: " + diemtb);
    }
}
