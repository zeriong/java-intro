package final1;

public class ConstructInit {
    // final으로 선언한 멤버변수(필드 변수)의 경우 생성자를 통해서 값을 할당해주어야 함
    // 그렇지 않으면 초기화가 되지 않았다는 컴파일 에러 발생으로 활용 불가능하다.
    //
    // 즉, instance class 내부 변수에 final을 활용하게 되었을 때
    // 사용하기 위해선 반드시 내부에서 값을 할당해주어야 한다.
    final int value;

    // 생성자를 통해 this.value에 매개변수로 할당해줌
    // 해당 케이스는 인스턴트 생성 시 초기값을 할당 가능하다.
    public ConstructInit(int value) {
        this.value = value;
    }
}
