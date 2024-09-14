package ref;

// 매서드를 활용하여 이전 class1 package에 있는 ClassStart3 의 학습 예제를 최적화
public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        initStudent(student1, "학생1", 20, 90);
        initStudent(student2, "학생2", 16, 70);

        printStudent(student1);
        printStudent(student2);
    }

    static void printStudent (Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }

    static void initStudent (Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
