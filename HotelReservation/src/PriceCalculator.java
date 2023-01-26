public class PriceCalculator {
    private final Double pricePerDay;
    private final Integer numberOfDays;
    private final Season season;
    private final DiscountType discountType;

    public PriceCalculator(Double pricePerDay, Integer numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculateReservation(){
        return pricePerDay * numberOfDays * season.getMultiplier() * (1 - discountType.getPercent() / 100.0);
    }
}
