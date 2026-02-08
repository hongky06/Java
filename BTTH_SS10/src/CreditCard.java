public class CreditCard extends PaymentMethod implements Payable {

    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId,
                      String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    public void validate() {
        if (cardNumber.length() != 16) {
            System.out.println(" Số thẻ không hợp lệ (phải 16 chữ số)");
        } else {
            System.out.println(" Thẻ hợp lệ");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= creditLimit) {
            creditLimit -= amount;
            System.out.println(" Thanh toán " + amount + " bằng thẻ tín dụng");
            System.out.println("Hạn mức còn lại: " + creditLimit);
        } else {
            System.out.println(" Không đủ hạn mức");
        }
    }
}
