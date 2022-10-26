
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int bilangan;
        System.out.println("genap");
        System.out.println("ganjil");
        System.out.println("masukkan bilangan");
        bilangan= input.nextInt();
        
        if(bilangan%2==0){
            System.out.println("bilangan"+bilangan+"adalah bilangan genap");
        }
        else{
            System.out.println("bilangan"+bilangan+"adalah bilangan ganjil"); 
        
    } 
    }
    
}
