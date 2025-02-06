public class CarCalculator {
    // instance variables
    double carPrice;
    int seat;
    double displacement;
    double price_necessary;
    double price_insurance;

    // constructor method
    public CarCalculator(double price, int seat, double displacement) {
        this.carPrice = price;
        this.seat = seat;
        this.displacement = displacement;

        System.out.println("net price is " + this.carPrice);
    }

    // instance method
    public double necessaryExpenses() {
        double purchase_tax = (this.carPrice / 1.13) * 0.1;
        double registration_fee = 500;
        double usage_tax;
        if (this.displacement < 1.0) {
            usage_tax = 300;
        } else if (this.displacement > 1.0 && this.displacement <= 1.6) {
            usage_tax = 420;
        } else if (this.displacement > 1.6 && this.displacement <= 2.0) {
            usage_tax = 480;
        } else if (this.displacement > 2.0 && this.displacement <= 2.5) {
            usage_tax = 900;
        } else {
            usage_tax = 1920;
        }

        double commercial_insurance = this.seat < 6 ? 950 : 1100;
        this.price_necessary = (int) (purchase_tax + registration_fee + usage_tax + commercial_insurance);
        System.out.println("necessary price is " + this.price_necessary);

        return this.price_necessary;
    }

    public double commercialInsurance() {
        double third_party_price = 1630;
        double lost_price = 459 + this.carPrice * 0.01088;
        double other_price = 3000;
        this.price_insurance = (int) (third_party_price + lost_price + other_price);

        System.out.println("the total insurance fee is " + this.price_insurance);
        return this.price_insurance;
    }

    public void totalPrice() {
        double totalPrice = this.carPrice + necessaryExpenses() + commercialInsurance();
        System.out.println("total price is " + totalPrice);
    }

}
