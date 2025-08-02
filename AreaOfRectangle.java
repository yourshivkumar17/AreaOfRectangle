import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length = sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth = sc.nextInt();
        int areaofrectangle = length*breadth;
        System.out.println(areaofrectangle);
    }
}
