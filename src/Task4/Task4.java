package Task4;

public class Task4 {
    public static void main(final String[] args) {
        for (int i = 1; i < 101; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) System.out.print(" FizzBuzz ");
            else if ((i % 3) == 0) System.out.print(" Fizz ");
            else if ((i % 5) == 0) System.out.print(" Buzz ");
            else System.out.print(i+" ");

        }
    }
}
