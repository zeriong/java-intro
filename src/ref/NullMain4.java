package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // bigData.count = int로 초기화값인 0이 할당되어있고
        // bigData.data = 참조형으로 초기화값인 null이 할당되어있다.

        // 이후 아래 print에서 처럼 value에 접근할 수 있도록 추가적으로 data에
        // 동일 형태로 참조 가능한 인스턴스를 추가적으로 할당해주면 된다.
        bigData.data = new Data();

        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value=" + bigData.data.value);

        // 결과적으로 모두 NullPointerException을 회피할 수 있게 되었다.

        // bigData.data 에는 null 초기화되어있었지만 new Data() 를 통해
        // 참조형 인스턴스를 할당해주어 해당 인스턴스의 id(고유번호)로 할당되었고

        // Data Class는 int value 가 지정되어있어 bigData.data.value로 접근하게 되면
        // 초기화 값인 0이 할당되어있기 때문에 제대로 접근한 케이스가 된다.
    }
}
