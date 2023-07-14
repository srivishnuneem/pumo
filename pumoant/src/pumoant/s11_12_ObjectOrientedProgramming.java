/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumoant;

import java.util.Arrays;

/**
 *
 * @author vishnuneem
 */
public class s11_12_ObjectOrientedProgramming extends childFor_s11_12{
    public static void main(String[] args) {
        s11_12_ObjectOrientedProgramming obj = new s11_12_ObjectOrientedProgramming();
        obj.prime();
        obj.fibonacci();
        int t,m;
        System.out.println("palindrom\nEnter the number to check palindrom or not : ");
        t=X.nextInt();
        obj.palindrom(t);
        obj.fibonacciEven();
        s9_10_ObjectOrientedProgramming.factorial();
        s9_10_ObjectOrientedProgramming.factorial(t);
        obj.leanerSearch();
        obj.reverseString();
        obj.sum(6,86);
        obj.largestPrimeFactorial();
        X.nextLine();
        System.out.println("Reverse String");
        System.out.println("Enter the String : ");
        String s=X.nextLine(),a[]=s.split(""),d="";
        for (int i = a.length-1; i >=0; i--) {
            d+=a[i];
        }
        obj.palindrom(d,s);
    }
    private void palindrom(int i){
        int sum=0,temp=i,j;
        while(temp>0){
            j=temp%10;
            sum=sum*10+j;
            temp/=10;
        }
        if (i==sum) {
            System.out.println(i+" is palindrom "+"("+sum+")");
        }
        else
            System.out.println(i+" is not palindrom "+"("+sum+")");
    } 
    void leanerSearch(){
        int a[]={34,33,6,54,67,45,63,65,78,57,55,2,21,1},b,c=0;
        System.out.println(Arrays.toString(a)+"\nEnter the number to search in array by leaner method");
        b=childFor_s11_12.X.nextInt();
        for(int i=0;i<a.length;i++){
            if (a[i]==b) {
                System.out.println(b+" is present in the index value of "+i);
                c++;
            }
        }
        if (c==0) {
            System.out.println(b+" is not present in array");
        }
    }
    private void palindrom(String x,String y){
        if (x==y) {
            System.out.println(y+" is palindrom");
        }
        else{
            System.out.println(y+" is not palindrom");
        }
    } 

    private void sum(int i, int j) {
        System.out.println("a is "+i+"\nb is "+j+"\na+b is"+(i+j));
    }

    private void largestPrimeFactorial() {
        System.out.println("Largest Prime Factorial Range from (1 to 20) only");
        int x = X.nextInt(),a=0,b=1,c=0;
        for (int i = x; i > 0; i--) {
            for (int j = 2; j < x-1; j++) {
                if (i%j==0) {
                    c++;
                    System.out.println(c);
                    break;
                }
            }
            if (c==0) {
                a=i;
                break;
            }
            else{
                c=0;
            }
        }
        System.out.println(a);
        for (int i = a; i > 1; i--) {
            b*=i;
        }
        System.out.println("The Largest Prime Factorial is "+b);
    }
}
