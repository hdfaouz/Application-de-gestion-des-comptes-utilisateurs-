import java.sql.SQLOutput;
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
        String email = scanner.nextLine();
        scanner.nextLine();
        System.out.println("entrer le mdPas : ");
        String mdPas = scanner.nextLine();
        System.out.println("entrer le role : \n 1.administrateur \n 2.Client \n 3.Employé ");
        String role = scanner.nextLine();
        Role roleNam = new Role(role);
        users.add(new Utilisateur(id, nom, prenom, age, roleNam, email, mdPas));
    }

    void Afficher() {
        for (Utilisateur information : users) {
            System.out.println(information);
        }

    }

    void Rechercher() {
        System.out.println("entrer l'id :");
        String id = scanner.nextLine();
        for (Utilisateur user : users) {
            if (user.getId().equals(id)) {
                System.out.println(user);
                return;
            }
        }
        System.out.println("utilisateur non trouvé");

    }

    void supprimer() {

        Scanner input = new Scanner(System.in);
        System.out.println("Entrer l'ID qui tu veux supprimer :");
        String id = input.nextLine();

        for (Utilisateur user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
                System.out.println("le Personne à été supprimé!" + user);
                return;
            }
        }
        System.out.println("Aucun personne.");
    }


    void Modifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Entrer id de tache qui veux modifier");
        String id = scanner.nextLine();
        for (Utilisateur   user : users) {
            if (user.getId().equals(id)) {
                System.out.println("entrer le nouveau id : ");
                user.setId(scanner.nextLine());

                System.out.println("entrer le nouveau nom : ");
                user.setNom(scanner.nextLine());

                System.out.println("entrer le nouveau prenome : ");
                user.setPrenom(scanner.nextLine());

                System.out.println("modifier l'age :");
                user.setAge(scanner.nextInt());

                System.out.println("entrer le nouveau email :");
               user.setEmail(scanner.nextLine());
               scanner.nextLine();

                System.out.println("entrer le nouveau mod passe : ");
                user.setMdPas(scanner.nextLine());

                System.out.println("entrer le nouveau role : ");
                user.setRole(new Role(scanner.next()));



            }
        }
    }
}



















