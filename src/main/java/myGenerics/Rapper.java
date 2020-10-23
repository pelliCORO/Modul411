package myGenerics;

public class Rapper<T> {
    T obj;


    public String nation;

    public String toString(){
        return nation;
    }


    public T getObject(){
        return obj;
    }


    public Rapper(T ob, String nation){
        this.obj = ob;
        this.nation=nation;
    }

}
