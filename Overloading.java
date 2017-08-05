/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwonumbers;

/**
 *
 * @author pratik-pc
 */
public class Overloading {
    public void sum()
    {
    int sum=2+3;
     System.out.println("Sum is: "+sum);
    }
    
    public void sum(int num1,int num2)
    {
    int sum=num1+num2;
     System.out.println("Sum is: "+sum);
    }
    
     public static void main(String args[]) {
     
     Overloading overloading=new Overloading();
     overloading.sum();// will call public void sum()
     overloading.sum(1, 2);//will call public void sum(int num1,int num2)
     }
}
