package kodlab.oop;

public class GetterSetter {

    private int deger;
    private String ad;

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }

    public String getAd() {
        return ad;
    }

    public String setAd(String ad) {
        this.ad = ad;
        return ad;
    }



    public static void main(String[] args) {
        GetterSetter getterSetter = new GetterSetter();
        getterSetter.ad = "Hakkı";

    }
}
