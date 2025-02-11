public class Person {
    private String name = "léo";
    private int age = 10;
    private String address = "flemme";

    public void printName() {
        System.out.println(name);
    }

    private void editName(String name) {
        this.name = name; 
    }

    protected void displayAge() {
        System.out.println(age);
    }

    void displayAddress() {
        System.out.println(address);
    }

}
