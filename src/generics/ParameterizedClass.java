package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> t = new Info<>("Hello");
        System.out.println(t);
        String gt1 = t.getValue();
        Info<Integer> i = new Info<>(125);
        System.out.println(i);
        Integer gt2 = i.getValue();
        Info<Boolean> b = new Info<>(false);
        System.out.println(b);
        Boolean gt3 = b.getValue();
    }

}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
