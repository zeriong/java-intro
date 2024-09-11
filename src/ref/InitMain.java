package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        // value1은 int형으로 선언만 했지만 0이 할당되어 있음 (선언 시 0으로 초기화되는 것을 알 수 있음)
        // value2는 할당(초기화)을 10으로 해주었기 때문에 당연히 10이다
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
        System.out.println("value3 = " + data.value3);
    }
}
