/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai01 {
    public static void main(String[] args) {
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