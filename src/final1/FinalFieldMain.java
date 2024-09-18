package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final field - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final field - field 에서 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        // 위 프로세스는 인스턴스를 생성하면 각 메모리에 인스턴스가 할당되는데
        // 그런 경우 인스턴스 내부에서 final로 선언한 value는 불변의 값임에도 불구하고
        // 재사용되지않고 매번 메모리에 새롭게 할당된다.

        // 하지만 아래의 경우 여러번 선언해도 CONST_VALUE는 static영역에서 한번 선언되어
        // 지속 존재하기 때문에 재사용이 가능해진다.

        // 상수
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);
    }
}
