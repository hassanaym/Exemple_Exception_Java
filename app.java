import java.util.InputMismatchException;
import java.util.Scanner;
public class app{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Donner un entier:");
            int annee = sc.nextInt();
            System.out.print(annee);
        }catch(InputMismatchException e){
            System.out.println("Le date de naissance est incorrecte");
        }
        System.out.println("hello");
    }
}