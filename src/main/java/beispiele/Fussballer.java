package beispiele;

public class Fussballer<T> implements Comparable<T> {

    public String verein;
    public String name;
    public String vorname;
    public int id;

    public Fussballer(String verein,String name, String vorname,int id){
        this.verein = verein;
        this.name = name;
        this.vorname = vorname;
        this.id = id;
    }

    public String getVerein() {
        return verein;
    }

    public void setVerein(String verein) {
        this.verein = verein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){

        return this.id+", "+this.verein+", "+this.vorname+" "+this.name;
    }

    @Override
    public int compareTo(Object o) {
        Fussballer f = (Fussballer) o;
        if (this.id > f.getId())
            return 1;

        else if (this.id < f.getId()) {
            return -1;
        } else return 0;
    }
}
