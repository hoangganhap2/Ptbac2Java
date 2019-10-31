public class Accout {
    double a , b, c;

    public Accout(){
    }

    public Accout(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return b * b - (4 * a * c);
    }
    public double getRoot1(){
        return (-b + Math.pow(getDiscriminant(),0.5))/ (2 * a) ;
    }

    public double getRoot2(){
        return (-b - Math.pow(getDiscriminant(),0.5))/ (2 * a) ;
    }
}
