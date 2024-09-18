package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // grade를 넘겨준 생성자
        MemberConstruct member1 = new MemberConstruct("Jane", 100, 12);
        // grade를 넘겨주지 않은 생성자
        MemberConstruct member2 = new MemberConstruct("Pole", 70);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println("이름: " + m.name + ", 나이: " + m.age + ", 성적: " + m.grade);
        }
    }
}
