/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumoant;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vishnuneem
 */
public class s5_6_ControlStatement {
    static Scanner X = new Scanner(System.in);
    public static void main(String[] args) {
        main();
    }
    public static void main(){
        System.out.println("Enter the number\n1 -> Count the Letters, Number, Spaces, and Special Characters\n2 -> Range of Sum of prime numbers\n3 -> Sum two numbers without + operator");
        int num = X.nextInt();
        switch(num){
            case 1:
                count();
                break;
            case 2:
                sumOfPrime();
                break;
            case 3:
                sumWithoutOperator();
                break;
            default:
                main();
        }
    }
    //f37a21
    public static void count(){
        String s;
        ArrayList count = new ArrayList();
        int c = 1;
        X.nextLine();
        System.out.print("Enter the string : ");
        s=X.nextLine();
        String[] temp = s.split("");
        for (int i = 0;i<temp.length;i++){
            for(int j=i+1;j <temp.length;j++){
            if(temp[i].equals(temp[j])){
                c++;
                temp[j]="node";
            }
        }
            if(!"node".equals(temp[i]))
            count.add(temp[i]+" = "+c);
            c=1;
        }
        System.out.println(count);
        main();
    }

    public static void sumOfPrime() {
        int a,sum=0,temp=0;
        System.out.println("Enter the number of range");
        a=X.nextInt();
        for (int i=2;i<=a;i++){
            int j=i-1;
            while (j>1){
                if((float)i%j==0){
                    temp++;
                    break;
                }
            j--;
            }
            if(temp==0){
                sum+=i;
            }
                temp=0;
        }
        System.out.println(sum);
        main();
    }
    public static void sumWithoutOperator(){
        int a,b,c;
        System.out.print("Enter the first number : ");
        a=X.nextInt();
        System.out.print("Enter the 2nd number : ");
        b=X.nextInt();
        c=Math.addExact(a, b);
        System.out.println(c);
        main();
    }
}
