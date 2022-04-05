public class Box {
        double length;
        double width;
        double height;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getLength(){
        return this.length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double getVolume(){
        return this.height * this.length * this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {

    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String toString(){
        return "width: " + this.width + " length: " + length + " height: " + height;
    }

}
