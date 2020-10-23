package myGenerics;

public class TestRapper {

    public static void main(String[] args) {
        Rapper<DeutscheRapper> rapper1 = new Rapper<DeutscheRapper>(new DeutscheRapper("Reezy"),"DE");
        Rapper<ItalienischeRapper> rapper2 = new Rapper<ItalienischeRapper>(new ItalienischeRapper("Sfera Ebbasta"),"ITA");
        Rapper<EnglischeRapper> rapper3 = new Rapper<EnglischeRapper>(new EnglischeRapper("YoungBoy NBA"),"USA");
        System.out.println(rapper1.toString()+" "+ rapper2.toString()+" "+rapper3.toString());
        System.out.println((rapper1.getObject()).toString()+" ///   "+(rapper2.getObject()).toString()+" ///  "+ (rapper3.getObject()).toString());

    }

}
