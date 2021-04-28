import javax.swing.Spring;

/**
 * Write a description of class calcuprogramer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calcuprogramer extends Calculator
{
    /**
     *  class calcuprogramer
     */
    /** Method untuk mengkonversi hexadesimal menggunakan loop */
    
    
   
    public String konversitoHex(int op1) 
    {
        //konversi ke hex  
        String hasilKonversi = Integer.toHexString(op1) ;
        return hasilKonversi;
    }
    
    // method konversiBilanganDesimaltoBiner
    public String konversitoBinner(int op1) 
    {
        // konversi ke hex 
        String hasilKonversi = Integer.toBinaryString(op1) ;
        return hasilKonversi;
    }
}

