package kodlab.oop;

public class Constructor {

    int a;

    public Constructor() {
    }

    String b;

    public Constructor(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor(1,"hakkı");
        GetterSetter getterSetter = new GetterSetter();
        getterSetter.setAd("Hakkı");
        getterSetter.getAd();
        getterSetter.getDeger();

        System.out.println(getterSetter.getAd());

    }
}
