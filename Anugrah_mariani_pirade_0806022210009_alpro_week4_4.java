
package anugrah_mariani_pirade_0806022210009_alpro_week4_4;

import java.util.Scanner;
public class Anugrah_mariani_pirade_0806022210009_alpro_week4_4 {

    public static void main(String[] args) {
      
        Scanner user_input=new Scanner(System.in);
       double fah,cel,reamur,kel;
      
       System.out.println("masukkan nilai temperatur dalam celcius");
       cel=user_input.nextDouble();
      
       fah=(1.8*cel)+32;
       System.out.println("Farenheit :"+ fah);
      
       reamur=(0.8*cel);
       System.out.println("Reamur:"+ reamur);
      
       kel=(273.15+cel);
       System.out.println("Kelvin:"+kel);
    }
    
}
