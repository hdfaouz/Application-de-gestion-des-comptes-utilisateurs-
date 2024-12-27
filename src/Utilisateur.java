public class Utilisateur extends Personne {
    private String email;
    private String mdPas;
     Role role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdPas() {
        return mdPas;
    }

    public void setMdPas(String mdPas) {
        this.mdPas = mdPas;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Utilisateur(String id, String nom, String prenom, int age, Role role, String email, String mdPas) {
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
