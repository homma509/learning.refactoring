// フォーマッターレゾルバークラス
public class FormatterResolver {

	private List<OrderFormatter> formatters;

	// フォーマッターを登録
	public void add(OrderFormatter formatter) {
		if (this.formatters == null) {
			this.formatters = new ArrayList();
		}
		this.formatters.add(formatter);
	}

	// オーダーのフォーマッターを取得
	public OrderFormatter resolve(Order order) {
		for (OrderFormatter formatter : this.formatters) {
			if (formatter.supports(order)) {
				return formatter;
			}
		}
		// throw new ApplicationException("Unsupported Order Record Type: ", order.recordType);
		return null;
	}

}