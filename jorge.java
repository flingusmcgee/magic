import java.util.Scanner;

public class jorge {
    public static void main(String[] args) {
      System.out.println("Fix me!");
      try (Scanner scan = new Scanner(System.in)) {
        String george = scan.nextLine();
        System.out.println(exclaim(george));
      }
    }
    public static String exclaim(String input) {
      return input.concat("!");
  }
}
