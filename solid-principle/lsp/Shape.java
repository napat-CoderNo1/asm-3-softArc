public abstract class Shape {
    private int width;
    private int height;

    Shape(){

    }

    // Setter
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }

    // Getter
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    // method
    public int getArea(){
        return this.width*this.height;
    }
}
