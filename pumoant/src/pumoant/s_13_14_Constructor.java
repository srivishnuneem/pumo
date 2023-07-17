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

public class s_13_14_Constructor{
    s_13_14_Constructor(){
        
    }
    s_13_14_Constructor(boolean c){
        this.c=c;
    }
    s_13_14_Constructor(int id){
        this.id=id;
        }
    s_13_14_Constructor(String t){
        this.t=t;
        }
    int id;
    String t;
    boolean c;
    public static Scanner X = new Scanner(System.in);
    final static float taxPer = 18;
    public static void tax_cal(){
        System.out.print("Enter the number amount to find tax : ");
        float amount = X.nextInt();
        float temp = amount*taxPer/100;
        System.out.println("The tax amount is "+temp);
    }
    
}

class child extends s_13_14_Constructor{
    private static int tax=18;
    public void setTax(int tax){
        this.tax=tax;
    }
    
    public int getTax(){
        return tax;
    }
    child(int r){
        super.id=r;
        }
    child(String y){
        super.t=y;
    }
    int r;
    String y;
    boolean g;
    public static void main(String[] args) {
        child obj1 = new child(5);
        child obj4 = new child("tamil");
        child obj = new child();
        System.out.println("tax persentage is "+tax);
        obj.setTax(20);
        int w = obj.getTax();
        System.out.println("tax persentage is "+w);
        obj.mounth();
    }
    String m31[]={"jan","mar","may","jul","aug","oct","dec"};
    String m30[]={"apr","jun","set","nov"};
    String m29 = "feb";
    public void mounth(){
        X.nextLine();
        System.out.print("Enter the first three leters of month to find the number of days in it : ");
        String temp = X.nextLine();
        int k = 0;
            for (int j = 0; j < m31.length; j++) {
                if (temp.toLowerCase().equals(m31[j])) {
                    System.out.println("This month has 31 days");
                    k++;
                    break;
                }
            }
            if (k==0) {
                for (int j = 0; j < m30.length; j++) {
                    if (temp.toLowerCase().equals(m30[j])) {
                    System.out.println("This month has 30 days");
                    k++;
                    break;
                }
                }
            }
            if (k==0) {
                if (temp.toLowerCase().equals(m29)){
                System.out.println("This month has 28 days in non-leapyear and 29 days in leapyear");
                k++;
                }
            }
            if (k==0) {
                System.out.println("invalid input");
        }
        System.out.print("Enter the number to find postive or negative : ");
        int r = X.nextInt();
        if (r>0) {
            System.out.println("positive");
        }
        else if (r<0) {
            System.out.println("negative");
        }
        else
            System.out.println("it is zero and nuteral");
    }
    private child() {
        tax_cal();
    }
}
