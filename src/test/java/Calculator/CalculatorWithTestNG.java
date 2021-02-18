package Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorWithTestNG {
    @Test
    public static void main(String[] args) {
        int operand1,operand2;
        String  action="add";String result;
        OperationsWithTestNG operations=new OperationsWithTestNG(action);
        result= operations.execute(10,20);
        System.out.println("Result is"+result);
    }
}
