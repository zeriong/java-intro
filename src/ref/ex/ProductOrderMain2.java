package ref.ex;

public class ProductOrderMain2 {
    static int total = 0;

    public static void main(String[] args) {
        ProductOrder[] orders = {
                createOrder("두부", 2000, 2),
                createOrder("김치", 5000, 1),
                createOrder("콜라", 1500, 2)
        };
        for (ProductOrder order : orders) {
            printOrders(order);
        }
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

    static void printOrders(ProductOrder order) {
        System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
    }
}
