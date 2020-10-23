package myGenerics;

public class ItalienischeRapper {
    String name;

    public ItalienischeRapper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return this.name;
    }


}
