package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;

        // data에 null이 할당되어 있기 때문에 pointer(가리키는 곳)가 길을 잃어서
        // idea 에서 예외처리를 발생시키는 것
        data.value = 10; // NullPointerException 예외처리 발생

        // 위에서 예외처리가 발생했기 때문에 당연히 아래 out print 코드는 실행되지 않는다.
        System.out.println("data = " + data.value);
    }
}
