package kodlab.ornekProje.okulYonetimSistemi;

public class Kisi {

    private String name;
    private String surname;

    private Long identityNumber;

    public Kisi(String name, String surname, Long identityNumber) {
        this.name = name;
        this.surname = surname;
        this.identityNumber = identityNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }
}
