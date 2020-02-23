public class RomeOperations {
    private RomeNumbers list = new RomeNumbers();

    public String operateWithRome(String a, String b, String decimal) {
        int numberA = 0;
        int numberB = 0;
        String result = "";
        for (int i = 0; i < list.getRomeList().length; i++) {
            if (list.getRomeList()[i].equals(a)) {
                numberA = i;
            }
            if (list.getRomeList()[i].equals(b)) {
                numberB = i;
            }
        }
        switch (decimal) {
            case "+":
                result = list.getRomeList()[(numberA + numberB)];
                break;
            case "-":
                result = list.getRomeList()[(numberA - numberB)];
                break;
            case "*":
                result = list.getRomeList()[(numberA * numberB)];
                break;
            case "/":
                result = list.getRomeList()[(numberA / numberB)];
                break;
            default:
                System.out.println("Wrong type of operations, choose one of [- + * /]");
        }
        return result;
    }
}


