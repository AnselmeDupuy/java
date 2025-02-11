public class Exo5 {
    public class Voiture{
        private String marque;
        
        public void setMarque(String marque) {
            this.marque = marque;
        }

        public String getMarque(){
            return marque;
        }
    }

    public static void main(String[] args) {
        Exo5 e = new Exo5();
        Voiture lexus = e.new Voiture();

        lexus.setMarque("Lexus");

        System.out.println(lexus.getMarque());

    }

}
