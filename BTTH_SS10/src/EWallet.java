public class EWallet extends PaymentMethod implements Payable {

    private String phoneNumber;
    private double balance;

    public EWallet(String accountName, String paymentId,
                   String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    @Override
    public void validate() {
        if (phoneNumber.length() < 10) {
            System.out.println("Số điện thoại không hợp lệ");
        } else {
            System.out.println("Ví điện tử hợp lệ");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Thanh toán " + amount + " bằng ví điện tử");
            System.out.println("Số dư còn lại: " + balance);
        } else {
            System.out.println(" Không đủ số dư");
        }
    }
}
