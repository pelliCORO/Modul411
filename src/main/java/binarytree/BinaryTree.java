package binarytree;


import java.lang.reflect.Method;

public interface BinaryTree<T extends Comparable<T>> {

    /**
     * @return liefert den Wert true, falls der Baum leer ist
     */
    boolean isEmpty();

    /**
     * Liefert die Wurzel des Baumes.
     *
     * @return Liefert den Wert null, falls der Baum leer ist
     */
    Object getRoot();

    /**
     * Einfügend eines neuen Elementes in die Baumstruktur. Damit das Einfügen funktioniert
     * müssen die Eigenschaften eines BST (Binary Search Tree) erfüllt sein. Dies bedeutet,
     * dass der Baum zu jeder gegebenen Zeit sortiert vorliegt.
     *
     * @param element Einzufügendes Element
     * @return liefert den Wert true, wenn das Element eingefügt werden konnte.
     */
    boolean insert(T element);

    /**
     * Erstellt eine Baumstruktur mit den angegebenen Parameter.
     *
     * <b>Vorsicht:</b> Der rechte und linke Teilbaum wird nicht geklont!
     *
     * @param payload Wurzel der Baumstruktur
     * @param left    Linker Teilbaum
     * @param right   Rechter Teilbaum
     */
    void makeTree(T payload, Node<T> left, Node<T> right);

    /**
     * Löscht den linken Teilbaum.
     *
     * @return Gelöschter Teilbaum
     */
    BinaryTree<T> removeLeftSubtree();

    /**
     * Löscht den rechten Teilbaum.
     *
     * @return Gelöschter Teilbaum
     */
    BinaryTree<T> removeRightSubtree();

    void preOrder(Method visit);

    void inOrder(Method visit);

    void postOrder(Method visit);

    void levelOrder(Method visit);


    Node<T> search(T element);

    boolean find(T element);

}