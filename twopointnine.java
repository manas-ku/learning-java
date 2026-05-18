import java.util.Scanner;

public class twopointnine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        double miles = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the number of galloons used: ");
        double gas = sc.nextDouble();
        double milage = miles/gas;
        System.out.println("The mileage is "+milage);
    }
}
