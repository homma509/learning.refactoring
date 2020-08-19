import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // オーダーリスト生成(SFだとトリガー経由で渡ってくる)
        Order orderDrFulltime = new Order(Order.RecordType.DrFulltime);
        Order orderDrParttime = new Order(Order.RecordType.DrParttime);
        List<Order>orders = new ArrayList<>();
        orders.add(orderDrFulltime);
        orders.add(orderDrParttime);

        // レゾルバの生成
        OrderFormatter formatterDrFulltime = new OrderDrFulltime(); 
        OrderFormatter formatterDrParttime = new OrderDrParttime(); 
        FormatterResolver formatterResolver = new FormatterResolver();
        formatterResolver.add(formatterDrFulltime);
        formatterResolver.add(formatterDrParttime);
        
        // ビジネスロジックを実行
        OrderBusinessLogic logic = new OrderBusinessLogic(formatterResolver);
        logic.execute(orders);
        
        // オーダータイトルを出力
        for (Order order : orders) {
            System.out.println(order.title);
        }
    }
}
