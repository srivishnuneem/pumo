/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author pumo
 */
public class Anagram {
    public static void main(String[]args){
        String x,y;
        Scanner X = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        x=X.nextLine();
        System.out.print("Enter the second String : ");
        y=X.nextLine();
        String[] t=x.split("");
        String []o=y.split("");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (t[i].equals(o[j])) {
                    t[i]="stop";
                    o[j]="stop";
                }
            }
        }
        int c=0;
        for (int i = 0; i < t.length; i++) {
            if (!t[i].equals("stop")) {
                c++;
            }
        }
        for (int i = 0; i < o.length; i++) {
            if (!o[i].equals("stop")) {
                c++;
            }
        }
        System.out.println(c==0?"anagram":"not anagram");
    }
}
