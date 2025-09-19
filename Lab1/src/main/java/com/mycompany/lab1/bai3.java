/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          Scanner sc=new Scanner(System.in);
        double canh,thetich1,thetich2;
        System.out.print("Nhap canh: ");
        canh=sc.nextDouble();
        thetich1 = canh*canh*canh;
        thetich2 = Math.pow(canh,3);
        System.out.println("The tich cach 1: "+thetich1);
        System.out.println("The tich cach 2: "+thetich2);
    }
}
