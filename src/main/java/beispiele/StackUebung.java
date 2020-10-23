package beispiele;
import java.util.Stack;

public class StackUebung {
    public static void main(String[] args) {
        Stack tiere = new Stack();

        tiere.add("Gans");
        tiere.add("Fuchs");
        tiere.push("Löwe");
        tiere.add("Kamel");
        tiere.push("Wolf");

        System.out.println(tiere.get(1));

        System.out.println(tiere);
        tiere.pop();
        System.out.println(tiere);
        tiere.peek();
        System.out.println(tiere);

    }
}
