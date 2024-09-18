package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수 case 1
        final int data1; // final로 선언한 변수는 최초 한번만 할당 가능함
        data1 = 10; // 최초 할당 (더 이상 변경 불가)
        // data1 = 20; // 이미 최초할당이 끝났기 때문에 컴파일 에러 발생

        // final 지역 변수 case 2
        final int data2 = 10; // 초기화 + 할당 (최초 할당이 끝남)
        // data2 = 100; // 초기화와 동시에 최초 할당이 인정되어 컴파일에러 발생
    }

    static void method(final int parameter) {
        // 컴파일러는 매서드실행 시 매개변수로 받는 값이 존재한다고 가정하기 때문에
        // 이미 매개변수에 최초 할당되었다고 가정하여 컴파일 에러 발생
        // parameter = 10;
    }
}
