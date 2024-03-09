package kodlab.Interface;

public class Isci implements Calisan{

    double ucretSabiti;
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
