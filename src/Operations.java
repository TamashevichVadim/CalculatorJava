class Operations {

    String operateWithNormal(String a, String b, String decimal) throws Exception {

        int numberA;
        int numberB;
        String result = "";

        if (Integer.parseInt(a) < 11 && Integer.parseInt(b) < 11 ) {
            numberA = Integer.parseInt(a);
            numberB = Integer.parseInt(b);
        } else throw new Exception("Input integers from range 1....10");

        switch (decimal) {
            case "+":
                result = String.valueOf(numberA + numberB);
                break;
            case "-":
                result = String.valueOf(numberA - numberB);
                break;
            case "*":
                result = String.valueOf(numberA * numberB);
                break;
            case "/":
                result = String.valueOf(numberA / numberB);
                break;
            default:
                System.out.println("Wrong type of operation, choose one of [- + * /]");
        }
        return result;
    }
}

