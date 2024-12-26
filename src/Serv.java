import java.util.ArrayList;
import java.util.Scanner;

public class Serv {
    ArrayList<Utilisateur> users = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void Ajoutter() {

        System.out.println("entrer l'id : ");
        String id = scanner.nextLine();
        System.out.println("entrer le nom :");
        String nom = scanner.nextLine();
        System.out.println("entrer le prenome : ");
        String prenom = scanner.nextLine();
        System.out.println("entre l'age : ");
        int age = scanner.nextInt();
        System.out.println("entre votre email : ");
        String email= scanner.nextLine();
        scanner.nextLine();
        System.out.println("entrer le mdPas : ");
        String mdPas =scanner.nextLine();
        System.out.println("entrer le role : \n 1.administrateur \n 2.Client \n 3.Employé\n ");
        String role = scanner.nextLine();
        Role roleNam = new Role(role);
        users.add(new Utilisateur(id,nom,prenom,age,roleNam,email,mdPas));
    }
    void Afficher() {
        for (Utilisateur information : users) {
            System.out.println(information);
        }

    }
    void Rechercher() {
        System.out.println("entrer l'id :");
        String id=scanner.nextLine();
        for(Utilisateur user : users){
            if(user.getId().equals(id)) {
                System.out.println(user);
                return;
            }
        }
        System.out.println("utilisateur non trouvé");

    }
}

