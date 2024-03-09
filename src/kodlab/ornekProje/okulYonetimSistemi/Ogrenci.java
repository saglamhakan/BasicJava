package kodlab.ornekProje.okulYonetimSistemi;

public class Ogrenci extends Kisi{

    private int studentNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Ogrenci(String name, String surname, Long identityNumber, int studentNumber) {
        super(name, surname, identityNumber);
        this.studentNumber=studentNumber;
    }
}
