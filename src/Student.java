public class Student  extends Person{
    private int studyYear;
    private String studyStatus;
    private int amountToPay;

    public Student(String nume, int id, int studyYear,String studyStatus) {
        super(nume, id);
        this.studyYear = studyYear;
        this.studyStatus=studyStatus;
    }

    public int getAmountToPay() {
        return amountToPay;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void getPaymentForStudy(){
        if(studyStatus.equalsIgnoreCase("budget")){
            amountToPay=0;
            System.out.println("Studentul "+getNume()+" are de achitat taxa de: "+amountToPay+" RON");
        }else if(studyStatus.equalsIgnoreCase("tax")){
            amountToPay=3500;
            System.out.println("Studentul "+getNume()+" are de achitat taxa de: "+amountToPay+" RON");
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
