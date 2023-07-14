/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumoant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author vishnuneem
 */
public class s3_4_JAVABasicOpreator {
    static Scanner X = new Scanner(System.in);
    public static void main(String[]args){
        main();
    }
    public static void main(){
        System.out.println("Enter number\n1 -> sum,multiple,subtract,divide, and remainder of two number\n2 -> swap the variable\n3 -> Decimal to Binary\n4 -> Binary to Decimal\n5 -> To find ASCII Value\n6 -> To find odd or even");
        int num = X.nextInt();
        switch(num){
            case 1:
                arithmeticOperator();
                break;
            case 2:
                swap();
                break;
            case 3:
                decimatToBinary();
                break;
            case 4:
                binaryToDecimal();
                break;
            case 5:
                ASCII();
                break;
            case 6:
                oddOrEven();
            default:
                main();
        }
    }
    public static void arithmeticOperator(){
        int a,b;
        System.out.print("Enter the first number : ");
        a = X.nextInt();
        System.out.print("Enter the 2nd number : ");
        b= X.nextInt();
        System.out.println("The sum of two number is "+(a+b));
        System.out.println("The different of two number is "+(a>b?a-b:b-a));
        System.out.println("The mutiple of two number is "+(a*b));
        System.out.println("The divide of two number is "+(a/b));
        System.out.println("The remainder of two number is "+(a%b));
        main();
    }
    public static void swap(){
        int a,b;
        System.out.print("Enter the first number : ");
        a = X.nextInt();
        System.out.print("Enter the 2nd number : ");
        b= X.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("The first number : "+a);
        System.out.print("The 2nd number : "+b);
        main();
    }
    @SuppressWarnings("empty-statement")
    public static void decimatToBinary(){
        int a;
        int v []=new int [100];
        System.out.println("Enter the value : ");
        a=X.nextInt();
            int temp = a,j=0;
        while(temp>0){
            v[j] = temp%2;
            temp/=2;
            j++;
        }
        System.out.print("The binary number for "+a+" is ");
        for(int i =j;i>=0;i--){
            System.out.print(v[i]);
        }
        System.out.println("");
        main();
    }
    public static void binaryToDecimal(){
        int a,temp,b=0,i=1;
        System.out.println("Enter the value : ");
        a=X.nextInt();
        temp=a;
        while(temp>0){
            b=b+((temp%10)*i);
            i*=2;
            temp/=10;
        }
        System.out.println("The decimal is "+b);
        main();
    }
    public static void ASCII(){
        char a;
        System.out.println("Enter the value : ");
        a=X.next().charAt(0);
        int b=a;
        System.out.println("The ASCII key value is "+b);
        main();
    }
    public static void oddOrEven(){
        int a;
        System.out.println("Enter the value : ");
        a=X.nextInt();
        System.out.println(a%2==0?"The number is Even":"The number is Odd");
        System.out.println("");
    }
}