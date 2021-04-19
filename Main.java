
/**
 *class Main 
 *
 * @author Friski
 * @version 0.1
 */
public class Main{
   
        public static void main (string args[]){
            kalkulator kalkul = new calculator();
            
            kalkul.name = "operator ";
            
            system.out.println("nilai 1 = "+ kalkul.x);
            system.out.println("nilai 1 = "+ kalkul.y);
            
            system.out.println(kalkul.name + "tambah 6 + 4 = "+ kalkul.tambah);
            system.out.println(kalkul.name + "kurang 6 - 4 = "+ kalkul.kurang);
            system.out.println(kalkul.name + "kali 6 * 4 = "+ kalkul.kali);
            system.out.println(kalkul.name + "bagi 6 / 4 = "+ kalkul.bagi);
        }
    }