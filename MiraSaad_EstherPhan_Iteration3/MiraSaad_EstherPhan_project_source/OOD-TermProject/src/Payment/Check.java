package Payment;

public class Check extends PaymentType {
	@SuppressWarnings("unused")
	private final String paymentType = "Check";
    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    private int checkNumber = -999;

    public String toString() {
        return "Check";
    }

}
