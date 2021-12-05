import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecption {
    public static int saisie(int max) throws Exception{
        int nb=1;
 
        Scanner sc ;
        do{
            System.out.println("Veuillez donner un entier: ");
            try{
                sc = new Scanner(System.in);
                int i = sc.nextInt();
                sc.close();
                return i;
            }catch(InputMismatchException e){
                System.out.println("Il faut un nombre entier!!");
                ++nb;
            }
        }while(nb<=max);

        throw new Exception("Saisie incorrecte");
    }

    public static int cube() throws Exception{
        int c = saisie(2);
        c = c * c * c;
        if(c>8){
            throw new ArithmeticException("Wa bzaf");
        }
        return c;
    }

    public static void main(String[] args){
            
        try  {
            System.out.println((cube()));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
