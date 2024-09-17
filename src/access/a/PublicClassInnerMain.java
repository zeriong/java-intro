package access.a;

public class PublicClassInnerMain {
    // 이전 PublicClass 클래스에서 default로 선언한 두가지 class 모두 같은 패키지에 존재하기 때문에
    // 선언하여 활용 가능하다.
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass class1 = new DefaultClass();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
