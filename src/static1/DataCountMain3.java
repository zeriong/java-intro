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
    }
}
