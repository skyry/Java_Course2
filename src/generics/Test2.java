package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        X x = new Y();
//        List<X> list1 = new ArrayList<Y>(); //nok
//        List<X> list1 = new ArrayList<X>(); //ok
    }
}

class X {
}

class Y extends X {

}