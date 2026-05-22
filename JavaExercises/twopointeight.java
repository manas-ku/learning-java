import java.util.Scanner;

public class twopointeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cookies: ");
        int cookies = sc.nextInt();
        int calories = cookies*10;
        System.out.println("You consumed "+calories+" calories");
        sc.close();
    }
}
