/*
 * Click nbfs://nbhost/SystemFileSystem/midlates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/midlates/Classes/Class.java to edit this midlate
 */
package pumoant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vishnuneem
 */
public class s7_8_Array_String {
    public static Scanner X = new Scanner(System.in);
    public static void tables(){
        int a,b;
        System.out.print("Enter the tables number : ");
        a=X.nextInt();
        System.out.print("Enter the count of "+a+" table to print : ");
        b=X.nextInt();
        for(int i=1;i<=b;i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
        main();
    }
    @SuppressWarnings("empty-statement")
    public static void copyArray(){
        int c;
        System.out.println("Enter the number of element to store : ");
        c=X.nextInt();
        int a[]=new int[c];
        for (int i = 0; i < c; i++) {
            System.out.print("Enter the "+(i+1)+" number : ");
            a[i]=X.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(i<a.length-1)
        System.out.print(a[i]+", ");
            else
        System.out.print(a[i]+".");
        }
        //copy the data
        int b[]=new int[a.length];
        for(int j=0;j<a.length;j++){
            b[j]=a[j];
        }
        System.out.println("");
        for (int i = 0; i < b.length; i++) {
            if(i<b.length-1)
        System.out.print(b[i]+", ");
            else
        System.out.print(b[i]+".");
        }
        System.out.println("\n"+Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        main();
    }
    public static void findAndFetch(){
        int a[]={12,13,14,4,32,342,2234,555,342,332,4},b,mid=0;
        System.out.print("Enter the number : ");
        b=X.nextInt();
        for (int i =0;i<a.length;i++){
            if(b==a[i]){
                System.out.println(b+" is in the array in the index of "+i);
                mid++;
            }
        }
        if(mid==0)
            System.out.println(b+", this number is not in array");
        main();
    }
    public static void matrix_1(){
        int i=3, a[][]=new int [i][i],b;
        System.out.print("Enter the number to sum in row and colum : ");
        b=X.nextInt();
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                System.out.println("Enter the "+j+" , "+k+"  value :");
                a[j][k]=X.nextInt();
            }
        }
        for(int x[]:a){
           for(int y:x){
               System.out.print(y);
           } System.out.println("");
        }
        main();
    }
    public static void main(){
        System.out.println("Enter the number\n1 -> tables\n2 -> copy the array\n3 -> find and fetch the selective number in array\n4 -> fill the 3*3 matrix 1 to 9 with the sum of 15");
        int num = X.nextInt();
        switch(num){
            case 1:
                tables();
                break;
            case 2:
                copyArray();
                break;
            case 3:
                findAndFetch();
                break;
            case 4:
                matrix_1();
                break;
            default:
                main();
        }
    }
    public static void main(String[] args) {
        main();
    }
}
