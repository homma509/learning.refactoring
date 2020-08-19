public interface OrderFormatter {
	public abstract String format(Order order);
	public abstract Boolean supports(Order order);
}