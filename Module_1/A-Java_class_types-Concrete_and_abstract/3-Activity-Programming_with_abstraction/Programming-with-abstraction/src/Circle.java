public class Circle extends Shape{
    private float radius;

    Circle(float r){
        this.radius = r;
    }

    @Override
    public float calculateArea() {
        float area = (float)Math.PI*this.radius*this.radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle width radius= "+this.radius);
    }

    @Override
    public String lineColor(String Color) {
        return "";
    }

    @Override
    public float perimeter() {
        float perimeterFloat = 2*(float)Math.PI*this.radius;
        return perimeterFloat;
    }
}