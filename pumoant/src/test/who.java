/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author pumo
 */
public class who {
    public static void main(String[] args) {
        int v =0;
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            int m=(v*2)+1;
            for (int j = 0; j < m; j++) {
                if (j==0||j==m-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
            v++;
        }
        v=10;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i-1; j < v; j++) {
                if (j==i-1||j==v-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            v--;
            System.out.println();
        }
    }
}
