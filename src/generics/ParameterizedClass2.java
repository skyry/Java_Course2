package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<Integer, String> t = new Pair<>(1, "Hello");
        System.out.println("Value1 = " + t.getFirstValue() + " Value2= " + t.getSecondValue());

        OtherPair<String> op = new OtherPair<>("Hello","Goog bye");
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}
//If our need one type
class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
