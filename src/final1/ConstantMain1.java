package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        // 아래 처럼 상수(변하지 않는 값)를 활용할 때 final static 변수를 활용하면 좋다.
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 1999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        if (currentUserCount >= Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}

