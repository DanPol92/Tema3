public class Student  extends Person{
    private int studyYear;
    private String studyStatus;

    public Student(String nume, int id, int studyYear,String studyStatus) {
        super(nume, id);
        this.studyYear = studyYear;
        this.studyStatus=studyStatus;
    }


    public int getStudyYear() {
        return studyYear;
    }

    public void getPaymentForStudy(){
        if(studyStatus.equalsIgnoreCase("budget")){
            System.out.println("Studentul "+getNume()+" nu apare in sistem cu datorii");
        }else if(studyStatus.equalsIgnoreCase("tax")){
            System.out.println("Studentul "+getNume()+" are de achitat taxa de 3500RON aferenta anului in curs");
        }
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                ", studyYear=" + studyYear +
                ", studyStatus='" + studyStatus + '\'' +
                '}';
    }
}
