package kodlab.ioIslemleri;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MetaDataOkuma {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/hakansaglam/Desktop/hakan");
        Path path = file.toPath(); //File dosyasını path dosyasına dönüştürdük

        boolean dosyaVarmi =  Files.exists(path);
        boolean dosyaVarmi2 = Files.isRegularFile(path);
        boolean dosyaVarmi3 = Files.isDirectory(path);
        boolean dosyaVarmi4 = Files.isHidden(path);
        boolean dosyaVarmi5 = Files.isReadable(path);
        boolean dosyaVarmi6 = Files.isWritable(path);
        boolean dosyaVarmi7 = Files.isExecutable(path);

        System.out.println(dosyaVarmi);
        System.out.println(dosyaVarmi2);
        System.out.println(dosyaVarmi3);
        System.out.println(dosyaVarmi4);
        System.out.println(dosyaVarmi5);
        System.out.println(dosyaVarmi6);
        System.out.println(dosyaVarmi7);
    }
}
