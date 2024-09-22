package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("this value =" + this.value); // this 생략 가능하지만 명확하게 구분할 때 좋다.
        System.out.println("super value =" + super.value); // super 는 extends(상속)된 클래스의 객체를 뜨함

        this.hello(); // 마찬가지, this 생략 가능
        super.hello();
    }
}
