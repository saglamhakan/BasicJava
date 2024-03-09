package kodlab.ornekProje.bankacilik;

public class Hesap {

    private String hesapNo;
    private double bakiye;

    public Hesap(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public Hesap(String hesapNo, double bakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }
    public void paraYatir(double miktar){
        if (miktar>0){
            bakiye+=miktar;
            System.out.println("Güncel bakiye : " + bakiye);
        }else {
            System.out.println("Geçersiz miktar");
        }
    }
    public void paraCek(double miktar){
        if (miktar<=bakiye){
            bakiye-=miktar;
            System.out.println("Güncel bakiye : " + bakiye);

        }
    }
    public void bakiyeSorgula(){
        System.out.println("güncel bakiye : " + bakiye);
    }
}



