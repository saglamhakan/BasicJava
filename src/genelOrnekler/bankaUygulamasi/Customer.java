package genelOrnekler.bankaUygulamasi;

public class Customer {

    private String name;
    private int age;
    private String job;

    private String tckn;

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public Customer(String tckn) {
        this.tckn = tckn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Customer(String tckn, String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.tckn=tckn;
    }
}
