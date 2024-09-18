package construct;

public class MemberConstructInitMain {
    public static void main(String[] args) {
        // 생성자를 활용하면 new 를 통해 생성자로 만들어 줄 때 매개변수에 필요 data를 넣어
        // 생성하며 해당 instance 변수의 값을 가진 채 만들어진다.
        MemberConstructInit member1 = new MemberConstructInit("Jane", 100, 12);
        MemberConstructInit member2 = new MemberConstructInit("Pole", 70, 23);

        MemberConstructInit[] members = {member1, member2};

        for (MemberConstructInit m : members) {
            System.out.println("이름: " + m.name + ", 나이: " + m.age + ", 성적: " + m.grade);
        }
    }
}
