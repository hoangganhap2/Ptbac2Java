import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        double a = input.nextDouble();
        System.out.println("Enter number b");
        double b = input.nextDouble();
        System.out.println("Enter number c");
        double c = input.nextDouble();

        Accout pt = new Accout(a,b,c);

        if(pt.getDiscriminant()>0){
            System.out.println("Nghiem 1 cua phuong trinh la : "+pt.getRoot1());
            System.out.println("Nghiem 2 cua phuong trinh la : "+pt.getRoot2());
        }else if (pt.getDiscriminant()==0){
            System.out.println("Phuong trinh co 2 nghiem kep : "+ pt.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
