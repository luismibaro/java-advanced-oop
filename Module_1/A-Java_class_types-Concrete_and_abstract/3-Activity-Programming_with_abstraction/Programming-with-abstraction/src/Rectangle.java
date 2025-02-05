public class Rectangle extends Shape{
    private float width;
    private float height;

    Rectangle(float w, float h){
        this.width = w;
        this.height = h;
    }

    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width= " + this.width + " height " + this.height);
    }

    @Override
    public String lineColor(String Color) {
        return "";
    }

    @Override
    public float perimeter() {
        float perimeterFloat = this.width+this.width+this.height+this.height;
        return perimeterFloat;
    }
}