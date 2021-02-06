package Calculator;

public class Operations {

    String action;String result;
    //int operand1,operand2;
    Operations(String action){
        this.action=action;
    }

    public String execute(int operand1,int operand2) {
        //this.operand1=operand1;this.operand2=operand2;//Initializing user given values
        switch(action) {
            case "add":
                result=String.valueOf(operand1+operand2);
                break;
            case "sub":
                result=String.valueOf(operand1-operand2);
                break;
            case "mul":
                result=String.valueOf(operand1*operand2);

                break;
            case "div":
                result=String.valueOf(operand1/operand2);
                break;
        }

        return result;

    }



}
