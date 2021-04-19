
/**
 *class Main 
 *
 * @author Friski
 * @version 0.1
 */
public class Main{
   
        public static void main (string args[]){
            calculator kalkul = new calculator();
            
            kalkul.name = "oprator ";
            
            system.out.println("nilai 1 = "+kalkul.x);
            system.out.println("nilai 1 = "+kalkul.y);
            
            system.out.println("perjumlahan dari 6 + 4 = "+ kalkul.tambah);
            system.out.println("perkalian dari 6 * 4 = "+ kalkul.kali);
        }
    }