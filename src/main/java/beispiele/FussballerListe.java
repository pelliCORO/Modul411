package beispiele;

import java.util.Collections;
import java.util.LinkedList;

public class FussballerListe {
    public static void main(String[] args) {

        LinkedList<Fussballer> fussballers = new LinkedList<Fussballer>();


        fussballers.add(new Fussballer("RB Leipzig", "Nkunku", "Christoper", 1));
        fussballers.add(new Fussballer("Juventus Turin", "Ronaldo", "Christiano", 5));
        fussballers.add(new Fussballer("Fc Bayern München", "Neuer", "Manuel", 6));
        fussballers.add(new Fussballer("Real Madrid", "Hazard", "Eden", 4));
        fussballers.add(new Fussballer("Fc Barcelona", "Messi", "Lionel", 2));
        fussballers.add(new Fussballer("Paris Saint Germain", "Mbappe", "Lotain", 7));
        fussballers.add(new Fussballer("Fc Tottenham", "Kane", "Harry", 3));

        System.out.println(fussballers.toString());
        Collections.sort(fussballers);
        System.out.println(fussballers.toString());

    }
}
