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
public class Bai04 {
    public static void main(String[] args) {
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