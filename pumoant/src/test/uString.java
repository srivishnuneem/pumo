/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author pumo
 */
public class uString {
    public static void main(String[] args) {
        String g = "javahelloworld";
        String k[]= g.split("");
        int count =0 ;
        for (int i = 0; i < k.length; i++) {
            for (int j = i+1; j < k.length; j++) {
                if (k[i].equals(k[j])) {
                    count++;
                    k[j]="stop";
                }
            }
            if (count!=0||k[i].equals("stop")) {
                k[i]="stop";
                count=0;
            }
            else
                System.out.print(k[i]);
        }
    }
}
