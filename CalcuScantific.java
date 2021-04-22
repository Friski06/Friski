
/**
 * Write a description of class CalcuScantific here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CalcuScantific extends calcu
{
 public double luas()
{
       double luas, phi=3.14;
       double r = 2;
      luas = phi*r*r; 
      return luas;
 }
 public int hasil(int op1){
     int hasil = 1;
     for(int i=op1; i>0; i--)
     hasil *= i;
     return  hasil;
}
public double bujur(int sisi){
 double luas;
        luas=sisi*sisi;
        
        return luas;   
}
}
