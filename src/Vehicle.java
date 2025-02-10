public class Vehicle {

    private String category;
    private  double speed;

    public Vehicle() {
    }

    public Vehicle(String category, double speed) {
        this.category = category;
        this.speed = speed;
    }

    public void setCategory(String category){
        if(category != null && !category.isEmpty() && category.length()<=50){
            this.category=category;
        }else{
            System.out.println("category Error, default to car");
            this.category="car";
        }
    }

    public void setSpeed(double speed){
        if(speed>0){
            this.speed=speed;
        }else{
            System.out.println("speed Error, default to 100");
            this.speed=100;
        }

    }

    public String getCategory() {
        return category;
    }

    public double getSpeed() {
        return speed;
    }
}
