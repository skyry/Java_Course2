package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(5);
        int a = GenMethod.getSecondElement(al);
        System.out.println(a);

        ArrayList<String> al1 =new ArrayList<>();
        al1.add("10");
        al1.add("20");
        al1.add("5");
        String a1 = GenMethod.getSecondElement(al1);
        System.out.println(a1);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
