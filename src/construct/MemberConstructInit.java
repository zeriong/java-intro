package construct;

public class MemberConstructInit {
    String name;
    int age;
    int grade;

    // 클래스명과 동일하게 매서드 형태로 만들어주면 생성자로서 매개변수를 통해 변수에 값을 할당하며
    // 생성할 수 있는 형태가 된다.
    MemberConstructInit(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
