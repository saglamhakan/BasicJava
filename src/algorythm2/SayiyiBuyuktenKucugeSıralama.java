package algorythm2;

import java.util.Scanner;

public class SayiyiBuyuktenKucugeSıralama {
    public static void main(String[] args) {
        int x,y,z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        x = scanner.nextInt();
        System.out.println("2.sayıyı giriniz");
        y = scanner.nextInt();
        System.out.println("3. sayıyı giriniz");
        z = scanner.nextInt();

        if ( x>y && x>z){
            if (y>z){
                System.out.println("x>y>z");
            }else {
                System.out.println("x>z>y");
            }
        }else if (y>x && y>z){
            if (x>z){
                System.out.println("y>x>z");
            }else {
                System.out.println("y>z>x");
            }
        } else if (z>x && z>y) {
            if (x>y){
                System.out.println("z>x>y");
            }else {
                System.out.println("z>y>x");
            }
        }
    }
}
