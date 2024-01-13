package project2;


abstract class Marks {

    abstract double getPercentage();
}
class A extends Marks {

    private double s1, s2, s3;
    public A(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double getPercentage() {

        return (s1 + s2 + s3) / 3;
    }
}

class B extends Marks {

    private double s1, s2, s3, s4;


    public B(double s1, double s2, double s3, double s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }


    @Override
    double getPercentage() {

        return (s1 + s2 + s3 + s4) / 4;
    }
}
class MarksTester{

    public static void main(String[] args) {

        A a = new A(10,20,30);

        B b = new B(20,30,40,50);

        System.out.println(" percentage of student A  is " + a.getPercentage());
        System.out.println( "percentage of student B is " + b.getPercentage());

}}