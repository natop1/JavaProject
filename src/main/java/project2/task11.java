package project2;

 interface Shape {
    void calculateArea();

    void calculatePerimeter();


    class Circle implements Shape{
    @Override
    public void calculateArea(){
        System.out.println("Area is 25");

    }
public void calculatePerimeter(){
    System.out.println("Perimeter is 54 ");

}
}

class Square implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("Area is 25");

    }

    public void calculatePerimeter() {
        System.out.println("Perimeter is 54 ");

    }

}}
   class ShapeTester{
       public static void main(String[] args) {
           Shape s=new Shape.Circle();
           s.calculateArea();
           s.calculatePerimeter();




  }}