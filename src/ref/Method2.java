package ref;

// 매서드를 활용하여 이전 class1 package에 있는 ClassStart3 의 학습 예제를 최적화
public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 20, 90);
        Student student2 = createStudent("학생1", 18, 70);

        printStudent(student1);
        printStudent(student2);
    }

    // create 매서드를 생성하여 매서드 내부에서 직접 생성자로 인스턴스를 만들어주어
    // 생성된 인스턴스를 반환함으로서 main 실행 매서드내부에서도 변수에 할당하여 매서드에서 만들어진
    // 참조형 인스턴스를 할당할 수 있게 된다.
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent (Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
