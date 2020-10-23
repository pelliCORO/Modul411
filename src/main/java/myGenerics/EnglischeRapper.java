package myGenerics;

public class EnglischeRapper {
    String name;

    public EnglischeRapper(String name) {
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
