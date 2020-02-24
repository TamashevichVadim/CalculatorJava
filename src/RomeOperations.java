class RomeOperations {
    private RomeNumbers operator = new RomeNumbers();

    String operateWithRome(String a, String b, String decimal) throws Exception {

        int numberA = 0;
        int numberB = 0;
        String result = "";

        if (Integer.parseInt(a) < 11 && Integer.parseInt(b) < 11 ) {

            for (int i = 0; i < operator.getRomeArray().length; i++) {
                if (operator.getRomeArray()[i].equals(a)) {
                    numberA = i;
                }
                if (operator.getRomeArray()[i].equals(b)) {
                    numberB = i;
                }
            }
        } else throw new Exception("Input integers from range 1....10");

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


