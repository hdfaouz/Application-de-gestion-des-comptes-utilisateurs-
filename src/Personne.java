public class Personne {

        private String id;
        private String nom;
        private String prenom;
        private int age;


        public Personne(String id,String nom,String prenom,int age,String role) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;

        }

        public String getId(){
            return id;}
        public void setId(String id){
            this.id=id;}

        public String getNom(){
            return nom;}
        public void setNom(String nom){
            this.nom=nom;}

        public String getPrenom(){
            return prenom;
        }
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public Integer getAge(){
            return age;}
        public void setAge(int age) {
            this.age = age;
        }






    }



