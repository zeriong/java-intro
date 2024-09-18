package extends1.ex2;

// extends 상속의 개념
// 클래스에 extends를 통해 부모클래스를 상속시키면
// 단지 ElectricCar(현재 클래스를 예시로) class만 instance로서 생성되는 것이 아니라
// 부모인 Car class도 같이 생성이 되어진다.
//
// 따라서 ElectricCar를 할당한 변수에는 하나의 참조 주소가 할당되지만
// 해당 주소 메모리를 보면 ElectricCar와 상속된 부모 class인 Car class도
// 같이 생성되어있고 심지어 분리까지 되어있다.
//
// 만약 생성된 ElectricCar에서 매서드를 호출하거나 변수에 접근한다고 가정하면
// 반드시 선언 시 지정된 자료형(Data Type)인 ElectricCar class에 먼저 접근하여
// 접근한 매서드나 변수가 있는지를 우선적으로 체크하게 된다.
//
// 그리고 없다면 이어서 상속된 부모 class인 Car에서 해당 변수 또는 매서드를 찾게된다.
// 마지막으로 부모 class에서 해당 접근요소를 찾을 수 없는 경우는 더 상위 class를 찾게되는데
// 더 이상 없기 때문에 이 때 컴파일에러가 발생한다.
//
//
// 결론
// 1. instance로 생성된 상속된 class는 특정 변수에 할당 되면 하나의 참조값을 갖는다.
// 2. 이런 경우 하나의 class만 생성되는 것이 아닌, 부모 class까지 같이 생성, 분리되어 존재한다.
// 3. 접근자를 통해 매서드, 변수로 접근하게 되면 선언된 자료형인 class를 우선 탐색한다.
//
public class ElectricCar extends Car {

    public void charge() {
        System.out.println("차를 충전");
    }
}
