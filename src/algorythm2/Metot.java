package algorythm2;

public class Metot {
  static int power(int base, int exp){
      int result = 1;

      for (int i =1; i<=exp; i++){
             result *= base;
        }
      return result;
  }

    public static void main(String[] args) {

    int case1 = power(2,3);
        System.out.println(case1);

        int case2= power(3,4);
        System.out.println(case2);

        System.out.println(power(3,2));
    }

}
