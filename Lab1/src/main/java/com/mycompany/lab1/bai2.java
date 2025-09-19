/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          Scanner sc=new Scanner(System.in);
        double chieudai,chieurong,chuvi,dientich,canhnn;
        System.out.print("Nhap chieu dai: ");
        chieudai=sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieurong=sc.nextDouble();
        chuvi = (chieudai+chieurong)*2;
        dientich = chieudai*chieurong;
        canhnn = Math.min(chieudai,chieurong);
        System.out.println("chu vi hinh chu nhat la: "+chuvi);
        System.out.println("dien tich hinh chu nhat la: "+dientich);
        System.out.println("canh nho nhat la: "+canhnn);
    }
}
