package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("매서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("매서드 호출 후: a = " + a);
    }

    // 두 print 모두 a를 log로 확인하기 때문에 실질적으로 매서드 호출과 관련없이
    // a의 할당된 값인 10이 출력된다.
    // 매서드 내부에서는 x = 20으로 변경을 해주었고 a는 변경시키지 않았기 때문에
    // 매서드의 매개변수인 x만 20이 되고 나머지는 a는 동일하게 10으로 유지된다.

    public static void changePrimitive(int x) {
        x = 20;
    }
}
