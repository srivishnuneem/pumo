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
public class s1_2_IntroductionToJAVA {
    static Scanner X = new Scanner(System.in);
    public static void main(String [] args){
        main();
    }
    public static void main(){
        System.out.println("Enter number\n1 -> Get input\n2 -> Min and Max limit of data type\n3 -> Range of data types\n4 -> Sum of two number\n5 -> Size of data type\n");
        int a=X.nextInt();
        switch (a){
            case 1:
                getInput();
                break;
            case 2:
                minAndMaxLimitOfDataType();
                break;
            case 3:
                rangeOfDataTypes();
                break;
            case 4:
                sum();
                break;
            case 5:
                sizeOfDataType();
                break;
            default:
                System.out.println("Enter the correct value\n");
                main();
        }
    }
    public static void getInput(){
        System.out.println("Enter the char : ");
        char c = X.next().charAt(0);
        System.out.println(c);
        System.out.println("Enter the Int : ");
        int i = X.nextInt();
        System.out.println(i);
        System.out.println("Enter the float : ");
        float f = X.nextFloat();
        System.out.println(f);
        System.out.println("Enter the short : ");
        short s = X.nextShort();
        System.out.println(s);
        System.out.println("Enter the double : ");
        double d = X.nextDouble();
        System.out.println(d);
        System.out.println("Enter the long : ");
        long l = X.nextLong();
        System.out.println(l);
        System.out.println("Enter the boolean : ");
        boolean b = X.nextBoolean();
        System.out.println(b);
        System.out.println("Enter the string : ");
        String S = X.nextLine();
        System.out.println(s);
        main();
    }
    public static void minAndMaxLimitOfDataType(){
        System.out.println("The max  value of int  : "+Integer.MAX_VALUE);
        System.out.println("The min  value of int  : "+Integer.MIN_VALUE);
        System.out.println("The max  value of char  : "+Character.MAX_VALUE);
        System.out.println("The min  value of char  : "+Character.MIN_VALUE);
        System.out.println("The max  value of float  : "+Float.MAX_VALUE);
        System.out.println("The min  value of folat  : "+Float.MIN_VALUE);
        System.out.println("The max  value of Short  : "+Short.MAX_VALUE);
        System.out.println("The min  value of Short  : "+Short.MIN_VALUE);
        System.out.println("The max  value of long  : "+Long.MAX_VALUE);
        System.out.println("The min  value of long  : "+Long.MIN_VALUE);
        System.out.println("The max  value of Double  : "+Double.MAX_VALUE);
        System.out.println("The min  value of Double  : "+Double.MIN_VALUE);
        main();
    }
    public static void rangeOfDataTypes(){
        System.out.println("Range of Int is from "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("Range of char is from "+Character.MIN_VALUE+" to "+Character.MAX_VALUE);
        System.out.println("Range of float is from "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("Range of double is from "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        System.out.println("Range of long is from "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("Range of short is from "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        main();
    }
    public static void sum(){
        System.out.println("Enter the 1st number");
        int a = X.nextInt();
        System.out.println("Enter the 2nd number");
        int b = X.nextInt();
        System.out.println("The sum of two number is "+(a+b));
        main();
    }
    public static void sizeOfDataType(){
        System.out.println("The size of int  : "+Integer.SIZE);
        System.out.println("The size of char  : "+Character.SIZE);
        System.out.println("The size of float  : "+Float.SIZE);
        System.out.println("The size of Short  : "+Short.SIZE);
        System.out.println("The size of long  : "+Long.SIZE);
        System.out.println("The size of Double  : "+Double.SIZE);
        main();
    }
}
