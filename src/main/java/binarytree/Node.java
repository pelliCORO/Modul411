package binarytree;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

/**
 * Repräsentiert einen Knoten in unseren Datenstrukturen
 */
@Getter
@Setter
public class Node<T extends Comparable<T>> implements Comparable<T> {

    private T payload;

    private Node<T> left;
    private Node<T> right;

    /**
     * Konstruktor ohne Argumente.
     */
    public Node() {
    }

    /**
     * Erstellt einen Knotenpunkt mit den gegebenen Daten.
     *
     * @param payload Zu speichernde Daten im Knoten
     */
    public Node(T payload) {

        this.payload = payload;
    }

    /**
     * Erstellt einen Knotenpunkt mit den gegebenen Daten.
     *
     * @param payload Zu speichernde Daten im Knoten
     * @param left linker Ast
     * @param right rechter Ast
     */
    public Node(T payload, Node<T> left, Node<T> right) {
        this.payload = payload;
        this.left = left;
        this.right = right;
    }

    /**
     * Vergleicht dieses Objekt mit dem angegebenen Objekt. Liefert eine
     * negative ganze Zahl, null oder eine positive Zahl, wenn dieses Objekt
     * kleiner, gleich oder grösser als das angegebene Objekt ist.
     */

    public int compareTo(@NotNull T object) {

        return payload.compareTo(object);
    }

    public int compareToForFind(@NotNull T object) {
        //ich will aus der var obj ein  integer machen(doppelt casten)
        /*
        aus object ein node
        (Node)object
        rufe getPaylod um T zu bekommen
        ((Node)object).getpayload
        ich mache aus T ein Integer
        (Integer)((Node)object).getpayload
        weise den integer einer variable zu
        Integer myInt =(Integer)((Node)object).getPayload();
         */
        Integer param =(Integer)((Node)object).getPayload();
        return ((Integer)(payload)).compareTo(param);
    }

}