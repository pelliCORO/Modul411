package beispiele;


import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {
        LinkedList<String> tiere =  new LinkedList<String>();
        tiere.addFirst("Kuh");
        tiere.add("Hund");
        tiere.addLast("Katze");
        tiere.add(0,"Schaf");
        tiere.set(0,"Pferd");

        System.out.println(tiere);

        //tiere.remove("Kuh");
       // tiere.remove(1);
        //tiere.removeLast();
        //tiere.removeFirst();

    }



}
