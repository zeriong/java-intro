package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        // 이미 ClassB에서 기본 생성자가 아닌 생성자를 직접 정의해주었기 때문에
        // ClassB에서 정의한 것 과 같은 형태로 매개변수에 직접 값을 넣어 인스턴스를 생성해줘야 한다.
        //super()

        // 직접적으로 인스턴스를 실행해주지 않는다면 컴파일에러 발생
        // 즉 인스턴스를 직접 생성해야 하는 클래스를 상속시킬 경우
        // 반드시 super 생성자를 통해 생성하는 것을 선행해야 한다.
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
