/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fournumbers;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class FourNumbers {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        long res = (long) a * b * c * d;
        System.out.println(res);

    }
}
