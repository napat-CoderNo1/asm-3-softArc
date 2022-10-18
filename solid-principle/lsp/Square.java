public class Square extends Shape {

    Square(int side) {
        this.setSide(side);
    }

    public void setWidth(int width) {
        this.setSide(width);
    }

    public void setHeight(int height) {
        this.setSide(height);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}
