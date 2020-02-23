class Operations {

    public String operateWithNormal(String a, String b, String decimal) {
        int numberA = 0;
        int numberB = 0;
        String result = "";

        numberA = Integer.parseInt(a);
        numberB = Integer.parseInt(b);

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

