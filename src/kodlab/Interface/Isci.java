package kodlab.Interface;

public class Isci implements Calisan{

    String name;
    double ucretSabiti;

    public Isci(String name, double ucretSabiti) {
        this.name = name;
        this.ucretSabiti = ucretSabiti;
    }

    @Override
    public double ucret() {
        return ucretSabiti*oran;
    }

    @Override
    public void calisanBolumu() {
        System.out.println("Ücretli çalışan");

    }

    @Override
    public void ucretBelirle(double ucretSabiti) {
        this.ucretSabiti=ucretSabiti;
    }
}
