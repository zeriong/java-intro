package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        // 생성자를 만들 때 결국 모든구조는 스택으로 되어있기 때문에
        // 실행구조상 가장 안쪽에서 참조되어 있는 최상위클래스에서부터
        // 실행가능한 매서드(클래스 등)는 순서대로 실행된다.
        ClassC classC = new ClassC();

        // 즉, 위 클래스가 instance화 되며
        // ClassA, ClassB, ClassC
        // 순서로 작동하게 된다.
    }
}
