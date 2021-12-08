package atm;

public class DefaultBill implements Bill{
    private int billAmount;
    private Bill next;

    public DefaultBill(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill next) {
        this.next = next;
    }

    @Override
    public void process(int amount) {
        int newAmount = amount % billAmount;
        if (next != null) {
            next.process(newAmount);
        } else if (newAmount != 0) {
            throw new IllegalArgumentException("Invalid amount of money entered!");
        }
        System.out.println("Please receive " + amount / billAmount + " of " + billAmount + " UAH bills");
    }
}
