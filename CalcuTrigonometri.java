
/**
 * Abstract class CalcuTrigonometri - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class CalcuTrigonometri extends Calculator
{
   protected double sudut;
   public abstract void konversi(double sudut);
   
   public double sin()
   {
       return Math.sin(this.sudut); 
   }
   
   public double cos()
   {
       return Math.cos(this.sudut);
    }
   // tan
   public double tan()
   {
       return Math.tan(this.sudut);
    }

}
