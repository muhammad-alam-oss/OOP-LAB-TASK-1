class Payment {
    void pay(double amount) {
        System.out.println("Paying " + amount);
    }
}
class CashPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid =" + amount + " in cash");
    }
    }
    class CardPayment extends Payment {
        void pay(double amount) {
            System.out.println("Paid =" + amount + " by card");
        }
}
        class OnlinePayment extends Payment {
            void pay(double amount) {
                System.out.println("Paid =" + amount + " online"); }
            }
            public class paymentMethods {
                public static void main(String[] args) {
                    Payment p;
                    p = new CashPayment();
                    p.pay(500);
                    p = new CardPayment();
                    p.pay(1500);
                    p = new OnlinePayment();
                    p.pay(5500);
                }
            }
