
/**
 *class Main 
 *
 * @author Friski
 * @version 0.1
 */
public class Main{
   
        public static void main (String args[]){
            kalkulator kalkul = new kalkulator();
            
            kalkul.name = "operator ";
            
            System.out.println("nilai 1 = "+ kalkul.x);
            System.out.println("nilai 1 = "+ kalkul.y);
            
            System.out.println(kalkul.name + "tambah 6 + 4 = "+ kalkul.tambah);
            System.out.println(kalkul.name + "kurang 6 - 4 = "+ kalkul.kurang);
            System.out.println(kalkul.name + "kali 6 * 4 = "+ kalkul.kali);
            System.out.println(kalkul.name + "bagi 6 / 4 = "+ kalkul.bagi);
        }
    }