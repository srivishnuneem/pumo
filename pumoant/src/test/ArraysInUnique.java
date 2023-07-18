/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author pumo
 */
public class ArraysInUnique {
    public static void main(String[] args) {
        int a[]={1,3,7,5,2,1,7,9,11,13,9,10,11};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]) {
                    count++;
                    a[j]=-1;
                }
            }
            if (count!=0||a[i]==-1) {
                a[i]=-1;
                count=0;
            }
            else
                System.out.print(a[i]+" ");
        }
    }
}
