import it.store.utils.receipt.DetailReceipt;
import it.store.utils.receipt.Receipt;
import it.store.utils.receipt.SimpleReceipt;

public class TestReceipt {
    public static void main(String[] args) {
        //ใบเสร็จแบบง่าย
        Receipt simpleReceipt = new SimpleReceipt("สมรักษ์ ใจดี", 1500.00);
        simpleReceipt.printReceipt();
        //ใบเสร็จแบบละเอียด
        String[] items = {"WiFi-IP Camera", "Power Bank 6000 mAh", "Panasonic Battery ขนาด AAA", "Adapter DC 12V"};
        double[] prices = {1200.0, 550.0, 65.0, 120.0};
        Receipt detailReceipt = new DetailReceipt("สมหวัง ใจเลิศ", items, prices);
        detailReceipt.printReceipt();
    }
}
