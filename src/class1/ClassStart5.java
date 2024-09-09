package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John Doe";
        student1.age = 22;
        student1.grade = 50;

        Student student2 = new Student();
        student2.name = "John Doe";
        student2.age = 20;
        student2.grade = 97;

        // 이러한 방식으로 배열에 담아 줄 수 있다.
        Student[] students = {student1, student2};

        // 향상 for 문의 형태 (타입 변수 : 대상배열)
        // 템플릿 단축키: iter
        for(Student s : students) {
            // 템플릿 단축키: sout
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
