package kodlab.collections;

public class GenericClass<T,Z> {

    T nesne1;
    Z nesne2;

    public GenericClass(T nesne1, Z nesne2) {
        this.nesne1 = nesne1;
        this.nesne2 = nesne2;
    }

    public void ekranaYaz(){
        System.out.println(nesne1);
        System.out.println(nesne2);
    }

    public static void main(String[] args) {
        GenericClass<Integer, String> obj = new GenericClass<>(1997, "Hakan");
        obj.ekranaYaz();
    }
}
