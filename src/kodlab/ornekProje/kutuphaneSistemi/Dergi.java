package kodlab.ornekProje.kutuphaneSistemi;

public class Dergi extends Yayin{

    private String editor;

    public Dergi(String baslik, String yayinTarihi, String editor) {
        super(baslik, yayinTarihi);
        this.editor=editor;
    }


    @Override
    public void bilgileriYazdir() {
        System.out.println("Dergi: " + baslik + ", Editör : " + editor + ", Yayın Tarihi: " + yayinTarihi);

    }
}
