import java.util.ArrayList;

public class Storilocations {
    ArrayList<Storelocation> storeloc = new ArrayList<>();

    public Storilocations() {
        storeloc.add(new Storelocation("Магазин 1", "Советская"));
        storeloc.add(new Storelocation("Магазин 2", "Ворошилова"));

    }
    public Storelocation getStoreloc (int indx){
        return storeloc.get(indx);
    }
}
