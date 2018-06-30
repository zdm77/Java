import actions.Product;
import dictonaries.Storilocations;
import dictonaries.Users;

public class Main {
    public static void main(String[] args){

      Users u1  = new Users();
      u1.printUsers();
      Storilocations st = new Storilocations();

      Product p1 = new Product("Товар 1", 25.05, st.getStoreloc(0));
      System.out.println(p1.getName()+"   " +p1.getStoreloc().getName());

    }

}

