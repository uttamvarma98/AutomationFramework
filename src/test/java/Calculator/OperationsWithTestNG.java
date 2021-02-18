package Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OperationsWithTestNG {
    String action;
    String result;

    OperationsWithTestNG(String action) {
        this.action = action;
    }
    @Test
    public String execute(int operand1, int operand2) {

        switch (action) {
            case "add":
                result = String.valueOf(operand1 + operand2);
                Assert.assertEquals(result,"30");
                break;
            case "sub":
                result = String.valueOf(operand1 - operand2);
                Assert.assertEquals(result,"-10");
                break;
            case "mul":
                result = String.valueOf(operand1 * operand2);
                Assert.assertEquals(result,"200");
                break;
            case "div":
                result = String.valueOf(operand1 / operand2);
                Assert.assertEquals(result,"0");
                break;
        }

        return result;
    }
}