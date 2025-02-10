public class CalculatorForPolygonPerimeter {
    public void polygonPerimeter(String shape, double... sides){
        double perimeter=0;
        for (double side : sides) {
            perimeter += side;
        }
        System.out.println(shape+"perimeter "+ perimeter);
    }
}
