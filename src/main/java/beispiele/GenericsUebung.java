package beispiele;

public class GenericsUebung<K,V> {

    K key;
    V val;

    public GenericsUebung(K k,V v){
        this.key = k;
        this.val = v;

    }
    public String showValueType(){
        return val.getClass().getName();
    }
}
