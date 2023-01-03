public class Professor extends Person{
    private String teachingLists;

    public Professor(String nume, int id, String teachingLists) {
        super(nume, id);
        this.teachingLists = teachingLists;
    }

    public String getTeachingLists() {
        return teachingLists;
    }

    @Override
    public String toString() {
        return "Professor{" +super.toString()+
                ", teachingLists='" + teachingLists + '\'' +
                '}';
    }
}
