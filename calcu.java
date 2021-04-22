
/**
 *class calcu up.
 *
 * @author Friski
 * @version 0.1 up
 */
public class calcu 
{
     // op1
    public double op1=0;
    public double op2=0;
    public static final String info = "Kalkulatorku";
    public static int jumlahobject = 0;

    
      /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  double hasil penjumlahan op1 + op2
     */
    public double jumlah() 
    {
        return this.op1 + this.op2;
    }
    
     /**
     * jumlah dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public double jumlah(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return jumlah();
    }
    
    /**
     * kurang tanpa parameter
     *
     * @param  
     * @return  double hasil perkurangan op1 + op2
     */
    public double kurang() 
    {
        return this.op1 - this.op2;
    }
    
     /**
     * kurang dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil perkurangan op1 - op2
     */
    public double kurang(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return kurang();
    }
    
    /**
     * kali tanpa parameter
     *
     * @param  
     * @return  double hasil Perkalian op1 * op2
     */
    public double kali() 
    {
        return this.op1 * this.op2;
    }
    
     /**
     * kali dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil Perkalian op1 * op2
     */
    public double kali(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return kali();
    }
    
    /**
     * bagi tanpa parameter
     *
     * @param  
     * @return  double hasil Pembagian op1 / op2
     */
    public double bagi() 
    {
        return this.op1 / this.op2;
    }
    
     /**
     * bagi dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil Pembagian op1 * op2
     */
    public double bagi(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return bagi();
    }
}
