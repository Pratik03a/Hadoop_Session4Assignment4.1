/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwonumbers;

import java.util.Scanner;

/**
 *
 * @author pratik-pc
 */
public class Addtwonum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " & " + num2 + " = " + sum);
        sc.close();
    }
}
