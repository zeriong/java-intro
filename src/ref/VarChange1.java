package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        // 기본형이기 때문에 a가 가진 값(value)을 복사(참조값 x)해서 b변수에 값만을 할당해주어
        // 10, 10이 찍히게 된다
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 단순하게 a변수에 새로운 20을 담았기 때문에 20, 10이 순서대로 찍힘
        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
