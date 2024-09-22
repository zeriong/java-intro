package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계이기 떄문에 호출 가능
        //defaultValue = 1; // 서로 다른 패키지에 있기 때문에 접근 불가
        //privateValue = 1; // 접근 불가능

        publicMethod();
        protectedMethod(); // 상속관계 or 같은 패키지 접근 가능
        //defaultMethod(); // 서로 다른 패키지에 있기 때문에 접근 불가
        //privateMethod(); // 접근 불가능

        printParent();
    }
}
