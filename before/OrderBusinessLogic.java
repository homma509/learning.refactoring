import java.util.*;

// オーダーのビジネスロジッククラス
public class OrderBusinessLogic {
    
    // ビジネスロジックを実行するメソッド
    public void execute(List<Order> orders) {
        for (Order order : orders) {
            order.title = formatTitle(order);
        }
    }
    
    // オーダータイトルをフォーマットするメソッド
    private String formatTitle(Order order) {
        if (order.recordType == Order.RecordType.DrFulltime) {
            // 常勤の求人タイトル
            return "[好条件]オンコールなし!!常勤求人";
        } else if (order.recordType == Order.RecordType.DrParttime) {
            // 非常勤の求人タイトル
            return "[急募]高額!!非常勤求人";
        }
        
		// throw new ApplicationException("Unsupported Order Record Type: ", order.recordType);
        return "unsupported recordType: " + order.recordType;
    }
    
}