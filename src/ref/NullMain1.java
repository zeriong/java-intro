package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // null의 개념은 자바스크립트와 같다.
        // 변수가 초기화 대상이 될 수 있는 상태고 실질적인 값은 없다 (스코프에 있으며 가비지 컬렉터 대상인 상태)
        // null을 할당한 변수에는 언제든 선언한 클래스의 타입(참조형)을 할당할 수 있는 상태다.
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
