package Calculator;

public class Calculator {

    public static void main(String[] args) {

        int operand1,operand2;
        String  action="sub";String result;
        Operations operations=new Operations(action);
        result=operations.execute(10,20);
        System.out.println("Result is"+result);
    }

}
