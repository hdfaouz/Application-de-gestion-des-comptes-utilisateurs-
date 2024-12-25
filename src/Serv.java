import java.util.ArrayList;
import java.util.Scanner;

public class Serv {
    ArrayList<Personne> users = new ArrayList<Personne>();
    Scanner scanner = new Scanner(System.in);

    void Ajoutter() {

        System.out.println("entrer l'id : ");
        String id = scanner.nextLine();
        System.out.println("entrer le nom :");
        String nom = scanner.nextLine();
        System.out.println("entrer le prenome : ");
        String prenom = scanner.nextLine();
        System.out.println("entre l'age :");
        int age = scanner.nextInt();
        System.out.println("entrer le role : ");
        String role = scanner.nextLine();
        System.out.println("entre votre email");
        String email= scanner.nextLine();
        System.out.println("entrer le mdPas");
        String mdPas =scanner.nextLine();
        users.add(new Utilisateur(id,nom,prenom,age,role,email,mdPas));
    }


}

