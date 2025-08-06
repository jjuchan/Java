package basic.extends1.access.child;

import basic.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 10; // public 접근 가능
        protectedValue = 20; // protected 접근 가능
        // defaultValue = 30; // default 접근 불가 (같은 패키지가

    }
}
