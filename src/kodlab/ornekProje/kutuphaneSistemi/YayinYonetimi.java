package kodlab.ornekProje.kutuphaneSistemi;

import java.util.ArrayList;
import java.util.List;

public class YayinYonetimi {
    private List<Yayin> yayinList = new ArrayList<>();

    public void yayinEkle(Yayin yayin){
        yayinList.add(yayin);
    }
    public void yayinSil(Yayin yayin){
        yayinList.remove(yayin);
    }
    public void yayinListele(){
        for (Yayin yayin: yayinList) {
            yayin.bilgileriYazdir();
        }
    }
}
