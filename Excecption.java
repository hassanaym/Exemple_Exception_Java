import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecption {
    public static int saisie(int max) throws Exception{
        int nb=1;
        int i;
        Scanner sc ;
        do{
            System.out.println("Veuillez donner un entier: ");
            try{
                sc = new Scanner(System.in);
                i = sc.nextInt();
                sc.close();
                return i;
            }catch(InputMismatchException e){
                System.out.println("Il faut un nombre entier!!");
                ++nb;
            }
        }while(nb<=max);
        throw new Exception("Saisie incorrecte");
    }
    public static void main(String[] args){
        try{
            System.out.println(saisie(3));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
