

public class FibonacciSeries {
    public static void main(String[] args) {
        int numTerms = 11;
        int firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= numTerms; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
