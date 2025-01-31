import java.util.Scanner;

public class HexagonArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the side: ");
    double side = input.nextDouble();

    double area = 6 * side * side / Math.tan(Math.PI / 6) / 4;

    System.out.printf("The area of the hexagon is %.2f\n", area);

    input.close();
  }
}