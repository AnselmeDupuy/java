public class Exo3 {

    public class Animal {
        protected String nom;
    }

    public class Chien extends Animal {

        public void setName(String name) {
            this.nom = name;
        }
    }

    public static void main(String[] args) {
        Exo3 e = new Exo3();
        Animal animal = e.new Animal();
        Chien dog = e.new Chien();
        dog.setName("test");
        System.out.println(dog.nom);
    }

    
}
