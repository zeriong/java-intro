package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John Doe";
        student1.age = 22;
        student1.grade = 50;

        Student student2 = new Student();
        student2.name = "John Doe";
        student2.age = 22;
        student2.grade = 50;

        // 해당 클래스의 정보를 확인할 수 있다 ( 경로@참조값 ) 형태
        System.out.println(student1); // class1.Student@b4c966a
        System.out.println(student2); // class1.Student@2f4d3709

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
