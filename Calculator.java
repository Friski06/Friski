
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator{
    // op1
    public double op1=0;
    public double op2=0;
    
    public static final String info = "Kalkulatorku";
    public static int jumlahobject = 0;
    private SimpanCalculator soc;
   
          
    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        
    }
    
    public Calculator(SimpanCalculator soc){
        // initialise instance variables
        this.soc = soc;
    }
    
    /**
     * set soc
     *
     * @param  SimpanOperasiCalculator   
     * @return  void
     */
    public void setSimpanOprasi(SimpanCalculator soc)
    {
        this.soc = soc;
    }
     
    /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  double hasil penjumlahan op1 + op2
     */
    public double jumlah(){
         simpanOprasi(String.valueOf(this.op1) +" + "+ String.valueOf(this.op2));
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
    
     /*
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
    public void simpanOprasi(String data) 
    {
        //simpan operasi
        this.soc.simpanOprasi(data);
    }
    
    /**
     * bacaOperasi
     *
     * @param  void
     *      
     * @return String
     */
    public String bacaOprasi() 
    {
        //baca operasi
        return this.soc.bacaOprasi();
    }
}
