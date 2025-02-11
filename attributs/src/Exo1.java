public class Exo1 {
    public class Livre {
        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public static void main(String[] args) {
            Exo1 e = new Exo1();
            Livre book = e.new Livre();
            book.setTitle("A");

            book.getTitle();
        }
    }
}