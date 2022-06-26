package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("Hello");
//        list.add(5);
//        list.add(new StringBuilder("Bye"));
//        list.add(new Car());
        list.add("Hello");
        list.add("Bye");
        list.add("Hi");
        list.add("Good Bye");

        for (Object o:list){
            System.out.println(o+" Size="+((String)o).length());
        }

    }
}

class Car{}
