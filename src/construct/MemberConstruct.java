package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자에 오버로딩(같은 매서드를 여러개 정의하는 것)이 가능하다
    // 모두 같아도 매개변수가 다르다면, 전달 받는 매개변수에 따라 다른 기능을 수행할 수 있다.
    // 즉, 여러 유형에 대응 가능하도록 클래스를 구성할 수 있다는 뜻
    MemberConstruct(String name, int age) {
        // 생성자 내부 this의 규칙으로 this 이전에 다른 코드가 실행되면 컴파일 에러가 발생한다.
        // 때문에 this를 활용한 코드 작성이 끝난 후 로직을 추가해야 함
        // System.out.println("Hello");

        // 생성자 내부에서 this를 활용해서 코드를 최적화할 수 있다.
        this(name, age, 45);

        // 위 this()를 통해 아래 코드와 동일한 기능이 적용된다.
        // this.name = name;
        // this.age = age;
        // this.grade = 45;

        System.out.println("case 1 : grade를 넘겨받지 않은 생성자 매서드 호출");
        System.out.println("name : " + this.name + "\n");
    }

    // 클래스명과 동일하게 매서드 형태로 만들어주면 생성자로서 매개변수를 통해 변수에 값을 할당하며
    // 생성할 수 있는 형태가 된다.
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("case 2 : grade를 전달받은 생성자 매서드 호출");
        System.out.println("name : " + this.name + "\n");
    }
}
