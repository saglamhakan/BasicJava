package kodlab.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetClass {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();  //Matematikteki küme gibi düşünebiliriz. Küme içinde dağınık şekilde bulunurlar. Aynı elemandan sadece 1 tane bulunur.

        hset.add("Hakan");
        hset.add("Mehmet");
        hset.add("Hasan");
        hset.add("Ahmet");
        hset.add("Ahmet");

        for (String item: hset) {
            System.out.println(item);

        }

        Iterator<String> i = hset.iterator();  //burayı foreach gibi düşünebilirsin
        while (i.hasNext()){
            System.out.println(i.next());

        }

        LinkedHashSet<String> list = new LinkedHashSet<>(); //Bu setin özelliği ise verileri sıralı vermektir

        list.add("Hakan");
        list.add("Suna");
        list.add("Ahmet");

        Iterator<String> l = list.iterator();
        while (l.hasNext()){
            System.out.println(l.next());
        }




    }

}
