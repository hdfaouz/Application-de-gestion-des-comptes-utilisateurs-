import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix;
        Serv pers =new Serv();

        do {
            System.out.println("************************Menu********************");
            System.out.println("1-Ajoutter un utilisateur : ");
            System.out.println("2-Rechercher un utilisateur : ");
            System.out.println("3-Modifier les informations d'un utilisateur :");
            System.out.println("4-Supprimer un utilisateur :");
            System.out.println("5-Afficher tous les roles d'utulisateurs :");
            System.out.println("6-quitter :");
            System.out.println("entrer un choix entre 1 et 6 : ");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    pers.Ajoutter();
                    break;
                case 2:
                    //pers.rechercher();
                    break;
                case 3:
                    //Personne.modifier();
                    break;
                case 4:
                    //Personne.afficher();
                    break;
                case 5:
                    //Personne.afficher();
                    break;
                case 6:
                    System.out.println("tu finis le programme :");
                    break;
                default:
                    System.out.println("tu as fini le programme ");
            }







        }
        while (choix !=6);
    }
}
