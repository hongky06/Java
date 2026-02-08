public class Main {
    public static void main(String[] args) {

        CreditCard card = new CreditCard(
                "Nguyen Van A",
                "CC01",
                "1234567812345678",
                "123",
                5000
        );

        card.validate();
        card.pay(1000);

        System.out.println("----------------");

        // EWallet
        EWallet wallet = new EWallet(
                "Tran Thi B",
                "EW01",
                "0987654321",
                2000
        );

        wallet.validate();
        wallet.pay(500);

        System.out.println("----------------");

        // Anonymous Class - Reward Points
        Payable rewardPay = new Payable() {
            @Override
            public void pay(double amount) {
                int points = (int) (amount * 10);
                System.out.println("Thanh toán " + amount + " bằng điểm thưởng");
                System.out.println("Sử dụng " + points + " điểm");
            }
        };

        rewardPay.pay(100);
    }
}
