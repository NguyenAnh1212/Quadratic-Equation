import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation qua1 = new QuadraticEquation(a,b,c);
        if(qua1.getDiscriminant() > 0){
            System.out.println("The equation has two roots :" + qua1.getRoot1() + "and" + qua1.getRoot2() );
        }
        else if (qua1.getDiscriminant()== 0){
            System.out.println("The equation has one root :" + qua1.getRoot3());
        }
        else {
            System.out.println("The equation has no real roots!");
        }
    }
}
