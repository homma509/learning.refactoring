// 常勤のビジネスロジッククラス
public class OrderDrFulltime implements OrderFormatter {

	public String format(Order order) {
		// 常勤の求人タイトル
		return "[好条件]オンコールなし!!常勤求人";
	}

	public Boolean supports(Order order) {
        return order.recordType == Order.RecordType.DrFulltime;
	}

}