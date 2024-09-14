package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // bigData.count = int로 초기화값인 0이 할당되어있고
        // bigData.data = 참조형으로 초기화값인 null이 할당되어있다.
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        // 하지만 아래 print 를 확인하면 bigData.data.value로 지정되어있다.
        // 위 주석에서 처럼 bigData.data에는 null이 할당되어있는데
        // 그렇게 되면 null에서 . (Dot)를 찍어버려서 Null Pointer
        // 가 되어버리기 때문에 NullPointerException 예외처리가 발생해버린다.

        //NullPointerException
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
