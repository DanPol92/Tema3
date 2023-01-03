public class Classes  {

        public  void setCourses(Person person){
           if (((Student)person).getStudyYear()==1){
                   System.out.println("Materiile din anul 1 sunt: Alegebra, Chimie, Fizica");
           }else if (((Student)person).getStudyYear()==2){
               System.out.println("Materiile din anul 2 sunt: Analiza matematica, Baze de date, Sport");
           }else if (((Student)person).getStudyYear()==3){
                System.out.println("Materiile din anul 3 sunt: Java, Baze de date, Mecanica");
            }else if (((Student)person).getStudyYear()==4){
                System.out.println("Materiile din anul 4 sunt: Mecatronica, JavaScript, Management");
            }
        }

}
