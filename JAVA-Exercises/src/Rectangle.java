public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {

        this.height = height * 2;
        String str = "height is " + this.height;
        System.out.println(str);
    }

    @Override
    public String toString(){
        return String.format("Area is " + this.getHeight() * this.getWidth());
    }
}
