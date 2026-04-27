public class convercao1 {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);

    double myDouble2 = 9.70;
    int myInt2 = (int) myDouble2; // Explicit casting: double to int

    System.out.println(myDouble2);
    System.out.println(myInt2);
  }
}