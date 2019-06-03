package les_06_oop_start;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        if((a>c+c)||(b>a+c)||(c>a+b)){
            System.out.println("Triangle is not correct");
            //throw new ArithmeticException("Triangle is not correct");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        double p=(double) this.getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public boolean isRight(){
        return a==b&&b==c;
    }

    public boolean isRB(){
        return (a==b)||(b==c)||(c==a);
    }
}
