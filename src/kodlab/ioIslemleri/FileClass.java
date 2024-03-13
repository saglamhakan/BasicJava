package kodlab.ioIslemleri;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/hakansaglam/Desktop/ornekDosya1.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName()); //Dosyanın ismi
        System.out.println(file.getAbsolutePath()); //Dosya yolu


        //Klasör oluşturma
        File f = new File("/Users/hakansaglam/Desktop/mete");
        File f1 = new File("/Users/hakansaglam/Desktop/hakkı");
        f.renameTo(f1); //Oluşturulan klasörün ismini değiştirir
        f.mkdir(); //Klasör Oluşturur


        File n = new File("/Users/hakansaglam/Desktop/hakkı");
        if (n.exists()){
            System.out.println("Dosya adi : " + n.getName());
            System.out.println("Dosya yolu : " + n.getAbsolutePath());
            System.out.println("Dosya boyutu : " + n.getTotalSpace());
            System.out.println("Dosya okunabilir mi : " + n.canRead());
        }

        //Path sınıfı file sınıfına benzer ve daha gelişmiş bir sınıftır.
       Path path = Paths.get("/Users/hakansaglam/Desktop").resolve("memet");
       Files.createFile(path);


       //Dizin oluşturma
        File m = new File("/Users/hakansaglam/Desktop/hasan");
        boolean sonuc = m.mkdir();
        System.out.println(sonuc);

        try {
            Path p = Paths.get("/Users/hakansaglam/Desktop/hasan1");
            Path yeniPath = Files.createDirectory(p);
            System.out.println(yeniPath);

        }catch (IOException e){
            e.printStackTrace();
        }
        //Dosya silme
        Files.delete(path);
    }

}
