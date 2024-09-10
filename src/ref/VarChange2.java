package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        // 두 변수의 참조값이 같은 것을 확인할 수 있음
        System.out.println("dataA ref value = " + dataA);
        System.out.println("dataB ref value = " + dataB);
        System.out.println("dataA value = " + dataA.value);
        System.out.println("dataB value = " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("dataA value = " + dataA.value);
        System.out.println("dataB value = " + dataB.value);
    }
}
