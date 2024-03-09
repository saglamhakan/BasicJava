package algorythm2;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

    String name ="hakan saglam hakkı";
    int num;
    num = name.indexOf(" ");
    String s1,s2;

    s1 = name.substring(0, num);
    s2 = name.substring(num+1);
    name = s2 + " " + s1;
    name = name.toUpperCase();

        System.out.println(num);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(name);
    }
}