public class Exo4 {

    public class Compte{
        public static int nombreDeCompte = 0;

        public Compte(){
            nombreDeCompte++;
        }
    
    }

    public static void main(String[] args) {
        Exo4 e = new Exo4();
        Compte first = e.new Compte();
        Compte second = e.new Compte();

        System.out.println(second.nombreDeCompte);

        Compte third = e.new Compte();

        System.out.println(third.nombreDeCompte);

    }

    
}
