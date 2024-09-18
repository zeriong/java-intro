package final1;

public class ConstructInit {
    // 멤버변수(필드 변수)의 경우 생성자를 통해서 값을 할당해주어야 함
    final int value;

    // 생성자를 통해 this.value에 매개변수로 할당해줌
    public ConstructInit(int value) {
        this.value = value;
    }
}
