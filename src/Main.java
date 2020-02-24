import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loopMaker = true;
        boolean searcher;
        Scanner in = new Scanner(System.in);
        String phrase = "";

        Operations oper = new Operations();
        RomeOperations romeOper = new RomeOperations();
        RomeNumbers romeNumbers = new RomeNumbers();
        try {
            while (loopMaker) {
                System.out.println("Input");

                phrase = in.nextLine();
                String[] stringsOfPhrase = phrase.split(" ");
                String stringA = stringsOfPhrase[0];
                String decimal = stringsOfPhrase[1];
                String stringB = stringsOfPhrase[2];

                searcher = romeNumbers.getRomeList().contains(stringA) && romeNumbers.getRomeList().contains(stringB);
                System.out.println("Output");
                if (searcher) {
                    System.out.println(romeOper.operateWithRome(stringA, stringB, decimal));
                } else {
                    System.out.println(oper.operateWithNormal(stringA, stringB, decimal));
                }
            }
        } catch (NumberFormatException numberException) {
            System.out.println("Please input INTEGER numbers with one format (ARABIC or ROME) " +
                    "and UPPER CASE if your choice is ROME ");
        } catch (ArrayIndexOutOfBoundsException arrayException) {
            System.out.println(" Please input with SPACE \" \" between members ");
        } catch (ArithmeticException mathException) {
            System.out.println("division by 0 is impossible");
        } catch (Exception wrongInputRange) {
           String mistake = wrongInputRange.toString();
            System.out.println(mistake);
        }
    }
}
