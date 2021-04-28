
/**
 * Write a description of interface SimpanOprasiKeMemoryReverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpanOprasiKeMemoryReverse implements SimpanCalculator
{
    private String[] dataMemori = new String[10];
    private int pointer = 0;
    private String tampilMemori;

    /**
     * Constructor for objects of class SimpanOperasiKeMemoryReverse
     */
    public  SimpanOprasiKeMemoryReverse()
    {
        
    }

    /**
     * simpanOperasi
     *
     * @param  String data
     * @return void
     */
    public void simpanOprasi(String data)
    {
        this.dataMemori[pointer] = data;
        this.pointer = this.pointer + 1;
        if (this.pointer > 9) this.pointer = 0;
        //this.pointer = this.pointer > 9 ? 0 : this.pointer; 
       
    }
    
    /**
     * bacaOperasi
     *
     * @param  void
     * @return StringArray
     */
    public String bacaOprasi()
    {
        dataMemoriKeTampil();
        return this.tampilMemori;
       
    }
    
     /**
     * dataMemoriKeTampil
     *
     * @param  void
     * @return void
     */
    public void dataMemoriKeTampil()
    {
        this.tampilMemori = "";
        for(int i=0; i<this.pointer; i++)
        {
            this.tampilMemori = this.tampilMemori + " " + this.dataMemori[i] + "\n" ;
        }
       
    }
    
}
