package genelOrnekler.bankaUygulamasi;


import java.util.HashMap;

public class AccountMovement {

        HashMap<String, Customer> customers = new HashMap<>();

        public void musteriEkle(String tckn, Customer customer){
            customers.put(tckn,customer);
        }

        public void musteriBul(String tckn){
            customers.get(tckn);
        }


    BankAccount bankAccount = new BankAccount();
      public void paraYatir(double miktar){
          if (miktar>0){
              double yeniBakiye = bankAccount.getBudget() + miktar;
              bankAccount.setBudget(yeniBakiye);
              System.out.println("güncel Bakiye: " + yeniBakiye);
          }else
              System.out.println("Geçersiz bir miktar girdiniz");
      }


      public void paraCek(double miktar){
          if (bankAccount.getBudget()<=0 || bankAccount.getBudget()<miktar){
             double yeniBakiye = bankAccount.getBudget()-miktar;
             bankAccount.setBudget(yeniBakiye);
             System.out.println(miktar + "miktarında para çekildi. Kalan bakiye " + yeniBakiye);
          }

     }
     public void bakiyeSorgulama(){
         System.out.println("Bakiyeniz : " + bankAccount.getBudget());

     }


    }



