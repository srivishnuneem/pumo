/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumoant;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vishnuneem
 */
public class s9_10_ObjectOrientedProgramming extends childFor_s9_10 {
    public static Scanner X = new Scanner(System.in);
    public static void main(String[]args){
        s9_10_ObjectOrientedProgramming obj = new s9_10_ObjectOrientedProgramming();
        int num;
        System.out.println("Enter the number of range for factorial ");
        num = X.nextInt();
        factorial(num);
        factorial();
        System.out.println("Enter the unit of current or electricity used ");
        int eb = X.nextInt();
        electricityBill();
        System.out.println("the eletricity bill for "+eb+" unit is "+electricityBill(eb));
        int a[]=obj.cgpa();
        obj.cgpa(a);
    }
    public static void electricityBill(){
        System.out.println("electricity bill");
    }
    public static int electricityBill(int x){
        int y=0;
        if (x<=50) {
            y=x*2;
        }
        else if (x<=100) {
            y=x*3;
        }
        else if (x<=150) {
            y=x*4;
        }
        else
            y=x*5;
        return y;
    }
    public static void factorial(int x){
        int f=1;
        for (int i = x; i > 0; i--) {
            f*=i;
        }
            System.out.println(f);
    }
    public static void factorial(){
        System.out.println("factorial");
    }
}
