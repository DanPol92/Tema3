public class Person {

    private String nume;
    private int id;

    public Person(String nume, int id) {
        this.nume = nume;
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "nume='" + nume + '\'' +
                ", id=" + id ;
    }
}
