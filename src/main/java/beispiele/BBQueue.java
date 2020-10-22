package beispiele;

import java.util.LinkedList;
import java.util.Queue;

public class BBQueue {


    public static void main(String[] args) {
        Queue<String> bbq = new LinkedList<String>();
        bbq.add("Steak");
        bbq.add("Wurst");
        bbq.add("Zaziki");
        bbq.add("Salat");
        bbq.add("Gemüse");


        System.out.println(bbq);
        System.out.println(bbq.poll());
        System.out.println(bbq);
        System.out.println(bbq.peek());
        System.out.println(bbq);
        System.out.println(bbq.contains("Salat"));
        System.out.println(bbq.toArray()[1]);
    }

    }
