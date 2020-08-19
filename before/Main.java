import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // オーダーリスト生成(SFだとトリガー経由で渡ってくる)
        Order orderDrFulltime = new Order(Order.RecordType.DrFulltime);
        Order orderDrParttime = new Order(Order.RecordType.DrParttime);
        List<Order>orders = new ArrayList<>();
        orders.add(orderDrFulltime);
        orders.add(orderDrParttime);
        
        // ビジネスロジックを実行
        OrderBusinessLogic logic = new OrderBusinessLogic();
        logic.execute(orders);

        // オーダータイトルを出力
        for (Order order : orders) {
            System.out.println(order.title);
        }
    }
}
