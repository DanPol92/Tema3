import java.util.Arrays;

public class Classroom {
    private static Person[] persons = new Person[6];
    private Classes classes=new Classes();
    private int index;


    private void addInClass(Person person) {
        persons[index] = person;
        index++;

    }

    private void showClass() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                System.out.println(persons[i]);
            }
            if (persons[i] instanceof Professor) {
                System.out.println(persons[i]);
            }
        }
        System.out.println("--".repeat(35));
    }

    private void StudentsCourses() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                if (((Student) persons[i]).getStudyYear() == 1) {
                    classes.setCourses(persons[i]);
                } else if (((Student) persons[i]).getStudyYear() == 2) {
                    classes.setCourses(persons[i]);
                } else if (((Student) persons[i]).getStudyYear() == 3) {
                    classes.setCourses(persons[i]);
                } else if (((Student) persons[i]).getStudyYear() == 4) {
                    classes.setCourses(persons[i]);
                }
            }
        }
    }
    public void checkTaxes() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).getPaymentForStudy();
            }
        }
    }

        public static void main (String[] args){
            Classroom cs = new Classroom();
            cs.addInClass(new Student("Dan", 1234, 4, "budget"));
            cs.addInClass(new Student("Mihai", 5678, 1, "tax"));
            cs.addInClass(new Student("Ionut", 4321, 2, "budget"));
            cs.addInClass(new Student("Florin", 8765, 3, "tax"));
            cs.addInClass(new Professor("George", 1111, "Mecatronica"));
            cs.addInClass(new Professor("Ion", 2222, "Chimie"));
            cs.showClass();
            cs.StudentsCourses();
            cs.checkTaxes();


        }


    }
