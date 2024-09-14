package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("매서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("매서드 호출 후: dataA.value = " + dataA.value);
    }

    // 매서드의 매개변수에 넣어준 변수가 참조형으로 할당된 메모리 주소가 복사가 되고
    // 내부 매서드에서 value에 접근하여 20을 직접 할당해주었기 때문에
    // 동일한 메모리 주소를 참조하게 되어 dataA의 값이 직접 바뀌게 된다(오염)
    // 결과는 10, 20으로 log에 찍히게 된다.

    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
