package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    // static method는 반드시 static으로 이루어진 변수, 매서드만 접근이 가능하다.
    //
    // 그 이유는 instance 변수에는 instance가 생성자로 생성되어야만 접근이 가능하기 때문이다.
    // instance는 생성이 될 수도, 안될 수도 있는 동적(dynamic) 객체이고,
    // 클래스 내부의 static 변수나 매서드는 java 실행 시 정적으로 클래스가 생성될 때
    // 함께 생성이 되어있는 정적(static)인 객체이다.
    //
    // 때문에 항상 존재할 수 있다는 확신이 있는 static 변수와 매서드만 접근이 가능한 것이다.
    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근 = 컴파일 에러
        //instanceMethod(); // 인스턴스 매서드 접근 = 컴파일 에러

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 매서드 접근
    }

    // 반면 instance method는 모두 접근이 가능하다.
    // instance가 생성되었다는 가정에서 모두 접근이 가능하기 때문이다.
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 매서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 매서드 접근
    }


    private void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }
}
