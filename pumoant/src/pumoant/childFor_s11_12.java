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
abstract class abstration{
    public abstract void prime();
    public abstract void fibonacciEven();

}
public class childFor_s11_12 extends abstration {
public static Scanner X = new Scanner(System.in);
    public void prime(){
        int n,m=1;
        System.out.println("prime");
        System.out.println("Enter the number to check prime or not : ");
        n=X.nextInt();
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                m++;
                break;
            }
        }
        if (m==1) {
            System.out.println(n+ " is prime");
        }
        else
            System.out.println(n+" is not a prime");
    }
    public void fibonacci(){
        int n,m=0;
        System.out.println("fibonacci number");
        System.out.print("Enter the range : ");
        n=X.nextInt();
        int f=0,s=1;
        do{
            m=f+s;
            f=s;
            s=m;
            if (m>=n) {
                break;
            }
        } while(m<=n);
        System.out.println("the fibonacci number is "+m);
    }
    public void reverseString(){
        X.nextLine();
        System.out.println("Reverse String");
        System.out.println("Enter the String : ");
        String s=X.nextLine(),a[]=s.split(""),d="";
        for (int i = a.length-1; i >=0; i--) {
            d+=a[i];
        }
        System.out.println(d);
    }
    public void fibonacciEven(){
        int n,m=0,sum=0;
        System.out.println("fibonacci number");
        System.out.print("Enter the range : ");
        n=X.nextInt();
        int f=0,s=1;
        while(m<=n){
            m=f+s;
            f=s;
            s=m;
            if (m%2==0) {
                sum+=m;
            }
            if (m==n) {
                break;
            }
        }
        System.out.println("the even fibonacci sum number is "+sum);
    }
}
    

