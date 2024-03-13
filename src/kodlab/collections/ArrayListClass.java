package kodlab.collections;

import kodlab.Interface.Isci;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hakkı");
        list.add("Sağlam");
        for (String item:list) {
            System.out.println(item);
        }

        List<Object> list1 = new ArrayList<>();
        list1.add("Hakan");
        list1.add(1997);
        list1.add(new Isci("Hakan", 1997));
        System.out.println(list1.size());
        System.out.println(list1.contains(1997));
        list1.clear();

            for (Object item:list1) {
                System.out.println(item);
            }
        }

    }

