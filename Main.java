
/**
 *class Main 
 *
 * @author Friski
 * @version 0.1 up
 */
public class Main{
   
        public static void main (String args[]){
           
            calcu kalkup = new calcu();
       /*   
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
    */
     calcuprogramer kalkup2 = new calcuprogramer();
    System.out.println("\n Kalkulator Programmer");
       System.out.println("Konversi Desimal 1604 ke Hexadesimal adalah = "+ kalkup2.konversitoHex(1604));
       System.out.println("Konversi Desimal 1604 ke Binner adalah = "+ kalkup2.konversitoBinner(1604)); 
       
       
       //Inisialisasi objek input dari class scanner
       CalcuScantific scan=new CalcuScantific();
       System.out.println("\n Kalkulator Programmer");
       System.out.println("luas lingkaran = "+scan.luas());
      
      System.out.println("\n Kalkulator Programmer");
      System.out.println("hasil dari !5 = "+scan.hasil(5));
      
      System.out.println("\n Kalkulator Programmer");
      System.out.println("hasil dari bujur = "+scan.bujur(6));
      
     
      System.out.println(" \n CalculatorTrigonometri ");
      System.out.println("Nilai dari sin 20 adalah"+ Math.sin(20));
      System.out.println("Nilai dari Cos 60 adalah"+ Math.cos(60));
      System.out.println("Nilai dari tan 16 adalah"+ Math.tan(16));
      System.out.println("Nilai dari derajat sudut untuk PI/4 adalah " + Math.toDegrees(Math.PI/4) + " derajat");  
      System.out.println("Nilai dari sudut radian untuk sudut 70 derajat adalah " + Math.toRadians(70));  
       
   }      
   }