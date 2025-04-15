public class BasicOperations {

    public static int basicMath(String op, int v1, int v2) {
        int result = 0;

        if (op.equals("+")){
            result = v1 + v2;
        }else if (op.equals("-")){
            result = v1 - v2;
        }else if (op.equals("*")){
            result = v1 * v2;
        }else if (op.equals("/")) {
            result = v1 / v2;
        }else{
            System.out.println("Please enter one of these 4 math ops: + - * /");
        }

        return result;
    }
}