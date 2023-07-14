/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumoant;
/**
 *
 * @author vishnuneem
 */

public class s_13_14_Constructor{
    s_13_14_Constructor(){
        
    }
    s_13_14_Constructor(boolean c){
        this.c=c;
    }
    s_13_14_Constructor(int id){
        this.id=id;
        }
    s_13_14_Constructor(String t){
        this.t=t;
        }
    int id;
    String t;
    boolean c;
    final static int num =10;
    public static void main(String[] args) {
        //num++;
        System.out.println(num);
    }
}

class child extends s_13_14_Constructor{
    child(int r){
        super.id=r;
        }
    child(String y){
        super.t=y;
    }
    int r;
    String y;
    boolean g;
    public static void main(String[] args) {
        child obj1 = new child(5);
        child obj4 = new child("tamil");
        //num++;
        System.out.println(num);
        
    }
}