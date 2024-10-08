package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        // Data3 클래스에 직접 . (Dot) 로 접근하는 방식처럼 보인다.
        // Class에서 가지고 있는 정적변수(static variable)인 count에
        // 접근할 수 있는 것이 static 변수이기 때문에 어떠한 클래스에서도
        // 접근 가능하게 된다.
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        // 하지만 Instance를 통해서도 접근이 가능하다
        Data3 data4 = new Data3("D");
        System.out.println("D count=" + data4.count);

        // 로직을 보자면 먼저 instance가 생성된 후 인스턴스의 count로 접근을 시도할 때
        // 이미 static변수가 있는 경우 접근 경로가 instance -> static 으로 넘겨주게되어
        // 결국 같은 static변수로 접근하게 되는 것

        // *중요:  인스턴스로 접근은 했지만,
        //        인스턴스가 가지는 값 X, static이 가진 값 O

        // 로직 순서
        // Instance instance = new Instance()
        // -> instance.count 인스턴스의 count 변수로 접근
        // -> instance내부 static한 count 발견
        // -> static count로 연결
        // -> instance.count === static count
        // -> static count 반환

        // 결론:
        // 둘 다 가능하지만 결과적으로 인지에 대한 요소가 중요하기 때문이다.
        // static 변수의 경우 Class 자체가 가진 변수로서 인지하기 좋은 방식은
        // 결국 Data3.count 이다.
        //
        // 그 이유는 만약 위처럼 instance에서 접근하게 된다면
        // 자칫 잘못하면 static 변수가 아닌 instance가 가진 변수로
        // 오해할 수 있기 때문에, 오해의 소지 자체를 만들지 않도록
        // Data3.count 로서 활용하는 것이 좋다.
    }
}
