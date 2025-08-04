package basic.access.b;

import basic.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // DefaultClass1 defaultClass1 = new DefaultClass1(); // 안됨
        // DefaultClass2 defaultClass2 = new DefaultClass2(); // 안됨
    }
}
