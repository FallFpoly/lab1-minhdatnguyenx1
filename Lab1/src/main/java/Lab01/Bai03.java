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
public class Bai03 {
    public static void main(String[] args) {
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
