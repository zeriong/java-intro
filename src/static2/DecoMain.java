package static2;

// 정적 매서드를 활용할 때 아래처럼 import 해서 사용할 수 있다.
// 아래서 * 은 개발 어디서나 통하는 모든 것(경로 등)을 뜻함
import static static2.DecoData.*;

public class DecoMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        // 아래에서 처럼 즉시 활용 가능 (react에서 활용하는 import와 비슷한 사례)
        // 물론 static 매서드만 활용 가능하다.
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();
    }
}
