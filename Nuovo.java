import java.util.Scanner;

public class Nuovo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        String nome, descrizione, tipologia, allergeni, foto, variazioni; 
        Short calorie;
        Double prezzo;
        Boolean disponibile;

        System.out.println("Crea il tuo piatto");

        System.out.println("Nome:");
        nome=sc.nextLine();

        System.out.println("Descrizione:");
        descrizione=sc.nextLine();

        System.out.println("Tipologia:");
        tipologia=sc.nextLine();

        System.out.println("Allergeni:");
        allergeni=sc.nextLine();

        System.out.println("Foto:");
        foto=sc.nextLine();

        System.out.println("Variazioni:");
        variazioni=sc.nextLine();

        System.out.println("Quante calorie ha:");
        calorie=sc.nextShort();

        System.out.println("Prezzo:");
        prezzo=sc.nextDouble();

        System.out.println("Disponibile: (true o false)");
        disponibile=sc.nextBoolean();

        

        sc.close();

        System.out.println("Il libro che hai definito:");
        System.out.println("Nome:  " + nome);
        System.out.println("Descrizione:  " + descrizione);
        System.out.println("Tipologia:  " + tipologia);
        System.out.println("Allergeni:  " + allergeni);
        System.out.println("Foto:  " + foto);
        System.out.println("Variazioni:  " + variazioni);
        System.out.println("Calorie:  " + calorie);
        System.out.println("Prezzo:  " + prezzo);
        System.out.println("Disponibile:  " + disponibile);
        






    }
}
