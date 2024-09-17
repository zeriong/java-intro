package access.a;

// 클래스 레벨에서 접근제어자는 Default(아무 제어자도 선언하지 않거나 직접 default를 적는 경우)와
// public만 존재한다. 단, public의 경우 파일 이름과 클래스명이 반드시 같아야 함.
public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass class1 = new DefaultClass();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// 아래 두 클래스처럼 default class의 경우 반드시 같은 패키지(경로)에서만 활용 가능하다
// (위 존재하는 PublicClass 에서 활용한 예시)
class DefaultClass {

}

class DefaultClass2 {

}
