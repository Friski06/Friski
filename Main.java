
/**
 *class Main 
 *
 * @author Friski
 * @version 0.1 up
 */
public class Main{
   
        public static void main (String args[]){
            kalkulator kalkul = new kalkulator();
            calcu kalkup = new calcu();
            
            kalkul.name = "operator ";
            
            System.out.println("nilai 1 = "+ kalkul.x);
            System.out.println("nilai 1 = "+ kalkul.y);
            
            System.out.println(kalkul.name + "penjumlahan 6 + 4 = "+ kalkul.penjumlahan);
            System.out.println(kalkul.name + "pengurangan 6 - 4 = "+ kalkul.pengurangan);
            System.out.println(kalkul.name + "perkalian 6 * 4 = "+ kalkul.perkalian);
            System.out.println(kalkul.name + "pembagian 6 / 4 = "+ kalkul.pembagian);
    
            System.out.println("");
       double hasil1 = kalkup.jumlah();
       double hasil2 = kalkup.jumlah(3.4, 5.4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);

       System.out.println("");
       double hasil3 = kalkup.kurang();
       double hasil4 = kalkup.kurang(10, 5);
       System.out.println("Hasil perkurangan method kurang tanpa parameter: "+ hasil3);
       System.out.println("Hasil perkurangan method kurang dengan parameter: "+ hasil4);
    
       System.out.println("");
       double hasil5 = kalkup.kali();
       double hasil6 = kalkup.kali(3, 5);
       System.out.println("Hasil perkalian method kali tanpa parameter: "+ hasil5);
       System.out.println("Hasil perkalian method kali dengan parameter: "+ hasil6);

       System.out.println("");
       double hasil7 = kalkup.bagi();
       double hasil8 = kalkup.bagi(10, 2);
       System.out.println("Hasil Pembagian method bagi tanpa parameter: "+ hasil7);
       System.out.println("Hasil Pembagian method bagi dengan parameter: "+ hasil8);
    
    
   }
   
   
       
    
}