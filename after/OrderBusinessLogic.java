import java.util.*;

// オーダーのビジネスロジッククラス
public class OrderBusinessLogic {

    // レゾルバ
    private FormatterResolver formatterResolver;

    // コンストラクタ
    public OrderBusinessLogic(FormatterResolver formatterResolver) {
       this.formatterResolver = formatterResolver; 
    }
    
    // ビジネスロジックを実行するメソッド
    public void execute(List<Order> orders) {
        for (Order order : orders) {
            order.title = formatTitle(order);
        }
    }
    
    // オーダータイトルをフォーマットするメソッド
    private String formatTitle(Order order) {
        OrderFormatter formatter = this.formatterResolver.resolve(order);
        return formatter.format(order);
    }
    
}