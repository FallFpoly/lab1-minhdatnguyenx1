/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          Scanner sc=new Scanner(System.in);
        double a,b,c,delta,candelta;
        System.out.print("Nhap so a: ");
        a=sc.nextDouble();
        System.out.print("Nhap so b: ");
        b=sc.nextDouble();
        System.out.print("Nhap so c: ");
        c=sc.nextDouble();
        delta = Math.pow(b, 2) - 4*a*c;
        if(delta>0){
            candelta = Math.sqrt(delta);
            System.out.println("Delta: "+delta);
            System.out.println("Can Delta: "+candelta);
        }else{
            System.out.println("Delta: "+delta);
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
