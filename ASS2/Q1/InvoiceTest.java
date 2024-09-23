
public class InvoiceTest {
    private String partNum;
    private String partDes;
    private int quantity;
    private double price;

    public InvoiceTest() {
        this("hi", "hello", 0, 0.0);
    }

    public InvoiceTest(String partNum, String partDes, int quantity, double price) {
        this.partNum = partNum;
        this.partDes = partDes;
        setQuantity(quantity);
        setPrice(price);
    }

    public double Invoiceamt() {
        return this.quantity * this.price;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartDes() {
        return partDes;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            this.quantity = 0;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            this.price = 0;
    }

    @Override
    public String toString() {
        return ("partnum::" + this.partNum + "PartDes::" + this.partDes + "Quantity::" + this.quantity + "Price::"
                + this.price + "Invoice::" + this.Invoiceamt());
    }
}
