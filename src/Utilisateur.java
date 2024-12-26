public class Utilisateur extends Personne {
    private String email;
    private String mdPas;
     Role role;

    public Utilisateur(String id, String nom, String prenom, int age,Role role, String email, String mdPas) {
        super(id, nom, prenom, age);
        this.email = email;
        this.mdPas = mdPas;
        this.role=role;

    }

    @Override
    public String toString() {
        return "Utilisateur{" +'\n'+
                "id= " +id+'\n'+
                "nom = " +nom+'\n'+
                "prenom = " +prenom+'\n'+
                "age = " +age+'\n'+
                "email= " + email + "\n" +
                "mdPas= " + mdPas + '\n' +
                "role= " + role.getRoleNam()+ '\n'+
                '}';

    }
}
