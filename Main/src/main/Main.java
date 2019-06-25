/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Kevin Garcia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            BigInteger b = BigInteger.ONE;
            for (long i = 1; i <= a; i++) {
                b = b.multiply(BigInteger.valueOf(i));
            }
            System.out.println(a + "!");
            System.out.println(b);
        }
    }

}
