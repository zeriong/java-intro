package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        // super 대신 this를 통해 아래의 두번째 생성자에 접근해 생성자 정의가 가능하다.
        //
        // 하지만 상속의 구조상 super() 기본 생성자는 숨겨져 있을 뿐이기 때문에
        // 상속을 하게 되면 자식, 부모 두 인스턴스를 모두 생성해야 하기 때문에
        // super() 생성자는 지정한 생정자 내부에서 반드시 한번 이상 호출이 되어야 정상 작동된다.
        this(a, 0); // 기본 생성자, 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        // 위 주석에 서술한대로 super() 생성자를 통해 부모 인스턴스도 존재해야하기 때문에
        // 위 생성자 매서드에서 이미 super 생성자가 없기 때문에 아래의 매서드도 this를 사용할 수 없다.
        //this(a);
        super(); // 기본생성자, 생략 가능
        System.out.println("ClassB 생성자 a=" + a + ", b=" + b);
    }
}
