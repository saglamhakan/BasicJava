package kodlab.ornekProje.okulYonetimSistemi;

public class Ogretmen extends Kisi{

    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Ogretmen(String name, String surname, Long identityNumber, String branch) {
        super(name, surname, identityNumber);
        this.branch=branch;
    }
}
