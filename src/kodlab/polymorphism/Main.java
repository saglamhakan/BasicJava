package kodlab.polymorphism;

public class Main {
    public static void main(String[] args) {
        Canli c = new Canli();
        Insan i = new Insan();
        Hayvan h = new Hayvan();
        Bitki b = new Bitki();


        Polimorfizm.nesneAl(c);
        Polimorfizm.nesneAl(i);
        Polimorfizm.nesneAl(h);
        Polimorfizm.nesneAl(b);
    }
}
