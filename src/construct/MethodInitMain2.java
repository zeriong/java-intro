package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "Jack", 18, 100);

        MemberInit member2 = new MemberInit();
        initMember(member2, "Pole", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println("이름: " +  m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
