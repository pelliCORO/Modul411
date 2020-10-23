package binarytree;

import java.lang.reflect.Method;

public class BinaryLinkedTree<T extends Comparable<T>> implements BinaryTree<T> {

    // root node
    private Node<T> root;

    // class data members
    private static Method visit;                               // visit method to use during a traversal
    private static final Object[] visitArgs = new Object[1];         // parameters of visit method
    private static int count;
    // counter
    @SuppressWarnings("rawtypes")
    private static final Class[] paramType = {Node.class}; // type of parameter for visit
    private static Method theAdd1;                             // method to increment count by 1
    static Method outputMethod;                        // method to output node element

    // method to initialize class data members
    static {
        try {
            @SuppressWarnings("rawtypes")
            Class<BinaryLinkedTree> treeClass = BinaryLinkedTree.class;
            theAdd1 = treeClass.getMethod("add1", paramType);
            outputMethod = treeClass.getMethod("output", paramType);
        } catch (Exception e) {
            // can't catch exceptionn here
        }
    }

    /**
     * visit method that outputs element
     */
    @SuppressWarnings("rawtypes")
    public static void output(Node treeNode) {
        System.out.print(treeNode.getPayload() + " ");
    }

    /**
     * Besuchsmethode zum Zählen von Knoten.
     */
    @SuppressWarnings("All")
    public static void add1(Node treeNode) {
        count++;
    }

    /**
     * @return Liefert den Wert true, falls der Baum leer ist
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Liefert die Wurzel des Baumes.
     *
     * @return Liefert den Wert null, falls der Baum leer ist
     */
    public Object getRoot() {
        return (isEmpty()) ? null : root.getPayload();
    }

    /**
     * Einfügend eines neuen Elementes in die Baumstruktur. Damit das Einfügen funktioniert
     * müssen die Eigenschaften eines BST (Binary Search Tree) erfüllt sein. Dies bedeutet,
     * dass der Baum zu jeder gegebenen Zeit sortiert vorliegt.
     *
     * @param element Einzufügendes Element
     * @return liefert den Wert true, wenn das Element eingefügt werden konnte.
     */
    @Override
    public boolean insert(T element) {

        Node<T> parent, child = root;

        do {
            int cmp = child.getPayload().compareTo(element);
            if (cmp == 0)
                return false;
            else {
                parent = child;
                child = (cmp > 0 ? child.getLeft() : child.getRight());
            }

        } while (child != null);

        Node<T> node = new Node<>(element, null, null);

        if (parent.getPayload().compareTo(element) > 0)
            parent.setLeft(node);
        else
            parent.setRight(node);

        return true;
    }


    /**
     * Erstellt eine Baumstruktur mit den angegebenen Parameter.
     *
     * <b>Vorsicht:</b> Der rechte und linke Teilbaum wird nicht geklont!
     *
     * @param payload Wurzel der Baumstruktur
     * @param left    Linker Teilbaum
     * @param right   Rechter Teilbaum
     */
    public void makeTree(T payload, Node<T> left, Node<T> right) {
        this.root = new Node<>(payload, left, right);
    }

    /**
     * Löscht den linken Teilbaum.
     *
     * @return Gelöschter Teilbaum
     * @throws IllegalArgumentException wenn der Teilbaum leer ist
     */
    public BinaryTree<T> removeLeftSubtree() {
        if (isEmpty())
            throw new IllegalArgumentException("tree is empty");

        // Linken Teilbaum trennen
        BinaryLinkedTree<T> leftSubtree = new BinaryLinkedTree<>();
        leftSubtree.root = root.getLeft();
        root.setLeft(null);

        return leftSubtree;
    }

    /**
     * Löscht den rechten Teilbaum.
     *
     * @return Gelöschter Teilbaum
     * @throws IllegalArgumentException wenn der Teilbaum leer ist
     */
    public BinaryTree<T> removeRightSubtree() {
        if (isEmpty())
            throw new IllegalArgumentException("tree is empty");

        // Rechten Teilbaum trennen
        BinaryLinkedTree<T> rightSubtree = new BinaryLinkedTree<>();
        rightSubtree.root = root.getRight();
        root.setRight(null);

        return rightSubtree;
    }

    /**
     * Preorder traversal
     *
     * @param visit Method to be used during visit
     */
    public void preOrder(Method visit) {
        BinaryLinkedTree.visit = visit;
        traversePreOrder(root);
    }

    /**
     * Actual preorder traversal method
     */
    @SuppressWarnings("ThrowablePrintedToSystemOut")
    private void traversePreOrder(Node<T> treeNode) {
        if (treeNode != null) {
            visitArgs[0] = treeNode;
            try {
                visit.invoke(null, visitArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
            traversePreOrder(treeNode.getLeft());
            traversePreOrder(treeNode.getRight());
        }
    }

    /**
     * Inorder traversal
     */
    public void inOrder(Method visit) {
        BinaryLinkedTree.visit = visit;
        traverseInOrder(root);
    }

    /**
     * actual inorder traversal method
     */
    @SuppressWarnings("ThrowablePrintedToSystemOut")
    private void traverseInOrder(Node<T> treeNode) {
        if (treeNode != null) {
            traverseInOrder(treeNode.getLeft());
            visitArgs[0] = treeNode;
            try {
                visit.invoke(null, visitArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
            traverseInOrder(treeNode.getRight());
        }
    }

    /**
     * Postorder traversal
     */
    public void postOrder(Method visit) {
        BinaryLinkedTree.visit = visit;
        traversePostOrder(root);
    }

    /**
     * Actual postorder traversal method
     */
    @SuppressWarnings("ThrowablePrintedToSystemOut")
    private void traversePostOrder(Node<T> treeNode) {
        if (treeNode != null) {
            traversePostOrder(treeNode.getLeft());
            traversePostOrder(treeNode.getRight());
            visitArgs[0] = treeNode;
            try {
                visit.invoke(null, visitArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /**
     * Level order traversal
     */
    @SuppressWarnings("ThrowablePrintedToSystemOut")
    public void levelOrder(Method visit) {
        ArrayQueue<Node<T>> queue = new ArrayQueue<>();
        Node<T> treeNode = root;
        while (treeNode != null) {
            visitArgs[0] = treeNode;
            try {
                visit.invoke(null, visitArgs);
            } catch (Exception e) {
                System.out.println(e);
            }

            // put t's children on queue
            if (treeNode.getLeft() != null)
                queue.put(treeNode.getLeft());
            if (treeNode.getRight() != null)
                queue.put(treeNode.getRight());

            // get next node to visit
            treeNode = queue.remove();
        }
    }

    /**
     * Liefert die Anzahl der Knoten im Baum.
     *
     * @return Anzahl Knoten im Baum
     */
    public int size() {
        count = 0;
        preOrder(theAdd1);
        return count;
    }

    /**
     * Liefert die Tiefe des Baumes beginnend mit dem Startknoten.
     *
     * @return Tiefe des Baumes
     */
    public int height() {
        return countHeight(root);
    }


    /**
     * Liefert die Tiefe des Baumes beginnend mit dem angegebenen Knoten.
     *
     * @param treeNode Von diesem Knoten soll die Tiefe berechnet werden
     * @return Tiefe des Baumes
     */
    private int countHeight(Node<T> treeNode) {
        if (treeNode == null)
            return 0;

        int leftHeight = countHeight(treeNode.getLeft());
        int rightHeight = countHeight(treeNode.getRight());

        return (leftHeight > rightHeight) ? ++leftHeight : ++rightHeight;
    }


}