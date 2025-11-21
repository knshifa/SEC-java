class Rectangle {
    int length,width;
    
    Rectangle() {
        this(5,5);
    }
    Rectangle(int I,int W) {
        length=I;
        width=W;
    }
    void area() {
        System.out.println("Area:"+(length*width));
    }
}
public class Rectangle2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.area();
    }
    
}
