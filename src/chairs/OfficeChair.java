package chairs;

public class OfficeChair extends Chair{

    private boolean isAllowAdjustments;
    private boolean isSpinning;
    private boolean hasDiscount;
    private int discountAmount;


    public OfficeChair(String model, int numberOfLegs, double price, boolean isAllowAdjustments, boolean isSpinning, boolean hasDiscount, int discountAmount) {
        super(model, numberOfLegs, price);
        this.isAllowAdjustments = isAllowAdjustments;
        this.isSpinning = isSpinning;
        this.hasDiscount = hasDiscount;
        this.discountAmount = discountAmount;
    }

    public boolean isAllowAdjustments() {
        return isAllowAdjustments;
    }

    public void setAllowAdjustments(boolean allowAdjustments) {
        isAllowAdjustments = allowAdjustments;
    }

    public boolean isSpinning() {
        return isSpinning;
    }

    public void setSpinning(boolean spinning) {
        isSpinning = spinning;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public void printChair() {
        System.out.println("This office chair has " + this.getNumberOfLegs() + " legs, model " + this.getModel() + " and it costs " + this.getPrice() +
        ". Additional setting adjustment = " + isAllowAdjustments + ", spinning = " + isSpinning + ", discount amount = " + discountAmount);
    }

    @Override
    public double calculatePrice(int numberOfChairs) {
        double original = super.calculatePrice(numberOfChairs);
        return hasDiscount ? original - original / 100 * this.discountAmount : original;
    }
}
