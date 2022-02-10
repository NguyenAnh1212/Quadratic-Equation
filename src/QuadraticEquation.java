public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
       return Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.pow((Math.pow(b,2)-4*a*c),0.5))/2*a;
    }
    public double getRoot2(){
        return (-b - Math.pow((Math.pow(b,2)-4*a*c),0.5))/2*a;
    }
    public double getRoot3(){
        return -b/2*a;
    }
}
