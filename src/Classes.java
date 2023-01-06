public class Classes {

    private String[] courses = new String[4];

    public void setCoursesForEachYear() {

        courses[0] = "Algebra, Chimie, Fizica";
        courses[1] = "Analiza matematica, Baze de date, Mecanica";
        courses[2] = "Java, Matematici speciale,Ingineria Sistemelor ";
        courses[3] = "Mecatronica, JavaScript, Management";
    }

    public void coursesPerYear(int i) {
        setCoursesForEachYear();
            System.out.println("Materiile din anul "+i+" sunt: " + courses[i-1]);

    }

    public void setCourses(Person person) {
        for (int i = 1; i <= 4; i++) {
            if (((Student) person).getStudyYear() == i) {
                System.out.print("Salut, "+person.getNume()+", ");
                coursesPerYear(i);
            }
        }
    }

    public void checkForProfessors(Person person){
        int year=0;
        for(int i=1;i<=4;i++){
            if(courses[i-1].contains(((Professor)person).getTeachingLists())){
                year=i;
                System.out.println("Materia "+((Professor) person).getTeachingLists()+" din anul "+year+" va fi predata de: "+person.getNume());
            }
    }
    }
}
