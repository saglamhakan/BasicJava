package genelOrnekler.bankaUygulamasi;

public class BankAccount {

    private Long IBAN;

    private double budget;

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Long getMoney() {
        return IBAN;
    }

    public void setMoney(Long money) {
        this.budget = money;
    }

    public BankAccount(Long IBAN, Long money) {
        this.IBAN = IBAN;
        this.budget = money;
    }
    public BankAccount(){

    }

    public BankAccount(Long IBAN) {
        this.IBAN = IBAN;
    }

    public Long getIBAN() {
        return IBAN;
    }

    public void setIBAN(Long IBAN) {
        this.IBAN = IBAN;
    }
}
