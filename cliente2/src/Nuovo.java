import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Nuovo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        String nome, cognome, nTelefono, note, email, password, username;

        System.out.println("Inserisci il cliente");

        System.out.println("Nome:");
        nome=sc.nextLine();

        System.out.println("Cognome:");
        cognome=sc.nextLine();

        System.out.println("Data di nascita (gg/mm/aaaa):");
        String datanascitastr=sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate datanascita = LocalDate.parse(datanascitastr, formatter); 

        System.out.println("Numero di telefono:");
        nTelefono=sc.nextLine();

        System.out.println("Note:");
        note=sc.nextLine();

        System.out.println("Email:");
        email=sc.nextLine();

        System.out.println("Password:");
        password=sc.nextLine();

        System.out.println("Username:");
        username=sc.nextLine();

        System.out.println("Data e ora di iscrizione (gg/mm/aaaa hh:mm):");
        String dataiscrizionestr=sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataiscrizione = LocalDateTime.parse(dataiscrizionestr, dateTimeFormatter);


        sc.close();

        System.out.println("Il cliente che hai inserito:");
        System.out.println("Nome:  " + nome);
        System.out.println("Cognome:  " + cognome);
        System.out.println("Numero di telefono:  " + nTelefono);
        System.out.println("Note:  " + note);
        System.out.println("Email:  " + email);
        System.out.println("Password:  " + password);
        System.out.println("Username:  " + username);
        System.out.println("Data di nascita:  " + datanascitastr);
        System.out.println("Data di iscrizione:  " + dataiscrizionestr);
    }
}
