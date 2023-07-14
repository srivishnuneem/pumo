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
public class interviewQuestions {
    public static Scanner X=new Scanner(System.in);
    public static void main(String[] args) {
        main();
    }
    public static void main(){
        System.out.println("Enter the number\n1 -> linear search\n2 -> Ascending order and Descending order\n3 -> Largers, 2nd largest, smallest, and 2nd Smallest\n4 -> swap\n***STRING ARRAY**\n5 -> finding duplicates    "
                + "");
        int num = X.nextInt();
        switch(num){
            case 1:
                linearSearch();
                break;
            case 2:
                ascendingAndDescendingOrder();
                break;
            case 3:
                largestSmallest();
                break;
            case 4:
                swap();
            default:
                main();
        }
    }
    public static void swap(){
        int a[]={2,4,3,6,7,5,8,9,1,34,54,66,77,543,656,775,432,0,89};
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the 1st number to swap by index : ");
        int c=X.nextInt();
        System.out.println("Enter the 2st number to swap by index : ");
        int d=X.nextInt();
        a[c]+=a[d];
        a[d]=a[c]-a[d];
        a[c]=a[c]-a[d];
        System.out.println(Arrays.toString(a));
        main();
    }
    public static void largestSmallest(){
        int a[]={2,4,3,6,7,5,8,9,1,34,54,66,77,543,656,775,432,0,89};
        System.out.println("Enter the number\n1 -> Largest number in array\n2 ->2nd largest number in array\n3 -> Smallest number in Array\n4 -> 2nd smallest");
        int c=X.nextInt(),temp=a[0],temp1=a[0];
        switch(c){
            case 1:
                for (int i = 1; i < a.length; i++) {
                    if(temp<a[i]){
                        temp=a[i];
                    }
                }
                System.out.println("Largest number in the array is "+temp);
                main();
                break;
            case 2:
                for (int i = 1; i < a.length; i++) {
                    if(temp<a[i]){
                        temp1=temp;
                        temp=a[i];
                    }
                }
                System.out.println("2nd largest number is : "+temp1);
                main();
                break;
            case 3:
                for (int i = 1; i < a.length; i++) {
                    if(temp>a[i]){
                        temp=a[i];
                    }
                }
                System.out.println("Smallest number in the array is "+temp);
                main();
                break;
            case 4:
                for (int i = 1; i < a.length; i++) {
                    if(temp>a[i]){
                        temp1=temp;
                        temp=a[i];
                    }
                }
                System.out.println("2nd smallest number is : "+temp1);
                main();
                break;
            default:
                main();
        }
    }
    public static void ascendingAndDescendingOrder(){
        int a[]={2,4,3,6,7,5,8,9,1,34,54,66,77,543,656,775,432,0,89};
        System.out.println("Enter the number\n1 -> Ascending order\n2 -> Descending order");
        int c=X.nextByte();
        switch(c){
        case 1:
            for (int i = 0; i < a.length-1; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[i]>a[j]) {
                    a[i]+=a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                    }
                }
            }
            System.out.println("Ascending order : "+Arrays.toString(a));
            main();
            break;
        case 2:
            for (int i = 0; i < a.length-1; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[i]<a[j]) {
                    a[i]+=a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                    }
                }
            }
            System.out.println("Descending order : "+Arrays.toString(a));
            main();
            break;
        default:
                ascendingAndDescendingOrder();
        }
    }
    public static void linearSearch(){
        int a[]={2,4,3,6,7,5,8,9,1,34,54,66,77,543,656,775,432};
        System.out.print("enter the number to find in array : ");
        int c = X.nextInt(),temp=0;
        for (int i = 0; i < a.length; i++) {
            if (c==a[i]) {
                System.out.println(c+" is in the index of "+ i);
                temp++;
            }
        }
        if (temp==0) {
            System.out.println(c+" is not in this array");
        }
        main();
    }
}
