public class Order {
    
    public enum RecordType {
        DrFulltime,
        DrParttime
    }
    
    public RecordType recordType;
    
    public String title;
    
    public Order(RecordType recordType) {
        this.recordType = recordType;
    }
    
}