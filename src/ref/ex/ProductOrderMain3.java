package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    static int total = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명: ");
            String productName = scanner.nextLine();

            System.out.println("가격: ");
            int price = scanner.nextInt();

            System.out.println("수량: ");
            int quantity = scanner.nextInt();

            scanner.nextLine(); // 입력 버퍼를 띄우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);
        System.out.println("총 "+ total + "원");
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        total += order.price * order.quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
}
