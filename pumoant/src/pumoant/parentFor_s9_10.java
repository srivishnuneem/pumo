/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumoant;
import java.util.Scanner;

/**
 *
 * @author vishnuneem
 */
public class parentFor_s9_10 {
    public static Scanner X =new Scanner(System.in);
    public void dummy(){
        System.out.println("parent");
}
    public int [] cgpa(){
        int temp=2,t=1;
        System.out.println("Enter the number of subjects");
        temp=X.nextInt();
        int a[]=new int [temp*2];
        for (int i = 0; i < temp*2; i+=2) {
            System.out.println("Enter the "+t+" subject mark in 0 to 10 :");
            a[i]=X.nextInt();
            System.out.println("Enter the "+t+" subject create :");
            a[i+1]=X.nextInt();
            t++;
        }
        return a;
    }
}
