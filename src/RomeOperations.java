class RomeOperations {
    private RomeNumbers operator = new RomeNumbers();
    private int numberA = 0;
    private int numberB = 0;
    private String result = "";

    int getNumberA() { return numberA; }
    int getNumberB() { return numberB; }

    void setNumberA(int numberA) { this.numberA = numberA; }
    void setNumberB(int numberB) { this.numberB = numberB; }

    void findRome (String a, String b) {

        for (int i = 1; i < operator.getRomeArray().length - 90; i++) {
            if (operator.getRomeArray()[i].equals(a)) {
                numberA = i;
            }
            if (operator.getRomeArray()[i].equals(b)) {
                numberB = i;
            }
        }
    }

    String operateWithRome (String decimal) {
        switch (decimal) {
            case "+":
                result = operator.getRomeArray()[(numberA + numberB)];
                break;
            case "-":
                result = operator.getRomeArray()[(numberA - numberB)];
                break;
            case "*":
                result = operator.getRomeArray()[(numberA * numberB)];
                break;
            case "/":
                result = operator.getRomeArray()[(numberA / numberB)];
                break;
            default:
                System.out.println("Wrong type of operations, choose one of [- + * /]");
        }
        return result;
    }
}


