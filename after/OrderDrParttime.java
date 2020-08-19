// 非常勤のビジネスロジッククラス
public class OrderDrParttime implements OrderFormatter {

	public String format(Order order) {
		// 非常勤の求人タイトル
		return "[急募]高額!!非常勤求人";
	}

	public Boolean supports(Order order) {
        return order.recordType == Order.RecordType.DrParttime;
	}

}