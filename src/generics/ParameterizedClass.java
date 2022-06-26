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

        Info<Bus> bus = new Info<>(new Bus());
        System.out.println(bus);
        Bus bus1 = bus.getValue();


    }

}

//if you want make Info<T> any subclass class number, then extends Number -> class Info<T extends Number>
//if you want add Interface I1,I2, then -> class Info<T extends Number&I1&I2>
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

class Bus {
}

interface I1 {
}

interface I2 {
}
