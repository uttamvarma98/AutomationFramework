package mavenIsImp;

import org.testng.annotations.Test;

public class CalculatorWithTestNG {
    @Test
    public void calculatorMethod(){
        int operand1,operand2;
        String  action="sub";String result;
        OperationsWithTestNG operations=new OperationsWithTestNG(action);
        result= operations.execute(10,20);
        System.out.println("Result is"+result);
    }
}
