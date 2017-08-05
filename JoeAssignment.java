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
public class JoeAssignment {
     public static void main(String args[]) {
         try (Scanner sc = new Scanner(System.in)) {
             System.out.println("number is:");
             int num1 = sc.nextInt();
             
             for(int i=1;i<=10;i++)
             {
                 System.out.println(num1+" * "+i+" = "+num1*i);
             }}
       
    } 
}
