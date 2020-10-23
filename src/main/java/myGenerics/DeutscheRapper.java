package myGenerics;

public class DeutscheRapper {
    String name;

    public DeutscheRapper(String name) {
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
