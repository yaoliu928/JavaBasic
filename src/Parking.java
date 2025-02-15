public class Parking {
    private String parkingNumber;
    private String carNumber;

    public String getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Parking() {
    }

    public Parking(String parkingNumber, String carNumber) {
        this.parkingNumber = parkingNumber;
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parkingNumber='" + parkingNumber + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
