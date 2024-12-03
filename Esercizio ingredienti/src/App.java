import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        String nome, descrizione, tipologia, allergeni, foto, modalitaconservazione; 
        Double prezzo;
        Boolean disponibile;

        System.out.println("Dettagli sull'ingrediente:");

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

        System.out.println("Modalità di conservazione:");
        modalitaconservazione=sc.nextLine();

        System.out.println("Disponibile: (true o false)");
        disponibile=sc.nextBoolean();

        System.out.println("Prezzo:");
        prezzo=sc.nextDouble();



        

        sc.close();

        System.out.println("L'ingediente che hai definito:");
        System.out.println("Nome:  " + nome);
        System.out.println("Descrizione:  " + descrizione);
        System.out.println("Tipologia:  " + tipologia);
        System.out.println("Allergeni:  " + allergeni);
        System.out.println("Foto:  " + foto);
        System.out.println("Prezzo:  " + prezzo);
        System.out.println("Disponibile:  " + disponibile);
        System.out.println("Modalità di conservazione:  " + modalitaconservazione);
        






    }
}

