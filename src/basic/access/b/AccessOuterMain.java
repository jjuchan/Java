package basic.access.b;

import basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        accessData.publicfield = 1;
        accessData.publicMethod();

//        accessData.defaultfield = 2; // default 접근 불가
//        accessData.defaultMethod();

//        accessData.privatefield = 3; // private 접근 불가
        // accessData.privateMethod(); // private 접근 불가

        accessData.innerAccess();

    }
}

