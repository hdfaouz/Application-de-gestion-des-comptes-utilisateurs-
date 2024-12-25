public class Utilisateur extends Personne {
    private String email;
    private String mdPas;
    private Role role;

    public Utilisateur(String id, String nom, String prenom, int age, String role, String email, String mdPas) {
        super(id, nom, prenom, age, role);
        this.email = email;
        this.mdPas = mdPas;

    }
}
