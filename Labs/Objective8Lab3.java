public class Objective8Lab3 {
  public static void main (String[] args) {
    int counter = 1;

    for (int i = 1; i <= 20; i++) {
      if (counter % 2 == 1) {
        System.out.println(counter + " is odd");
      } else {
        System.out.println(counter + " is even");
      }
      counter++;
    }
  }
}
