package Payment;

public class CreditCard extends PaymentType {
	@SuppressWarnings("unused")
	private final String paymentType = "CreditCard";

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    private int cardNumber = -999;
    private String expDate = null;

    public String toString() {
        return "Credit Card";
    }

}
