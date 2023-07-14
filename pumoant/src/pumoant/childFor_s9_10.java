/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumoant;

/**
 *
 * @author vishnuneem
 */
public class childFor_s9_10 extends parentFor_s9_10 {
    public void dummy(){
        System.out.println("child");
}
    public static void factorial(int x){
        System.out.println("child");
    }
    public void cgpa(int b[]){
        int nu=0,den=0;
        double cgpapar;
        for (int i = 0; i < b.length; i+=2) {
            nu=nu+(b[i]*b[i+1]);
                den+=b[i+1];
        }
        cgpapar = nu/den;
        System.out.println("CGPA = "+cgpapar);
    }
    public static void main(String[] args) {
        childFor_s9_10 c = new childFor_s9_10();
        c.dummy();
    }
    
}