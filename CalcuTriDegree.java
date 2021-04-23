
/**
 * Abstract class CalcuTriDegree - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class CalcuTriDegree extends CalcuTrigonometri
{
    public CalcuTriDegree()
    {
       
    }
    /**
     * konversi
     *
     * @param  double sudut
     * @return void
     */
    public void konversi(double sudut)
    {
        super.sudut = Math.toRadians(sudut);
    }
}
