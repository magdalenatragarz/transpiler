package instructions;

public class RelationalExpressionInstruction implements Instruction{
    private String expressionLeft;
    private String boolOperator;
    private String expressionRight;

    public String getExpressionLeft() {
        return expressionLeft;
    }

    public void setExpressionLeft(String expressionLeft) {
        this.expressionLeft = expressionLeft.replaceAll("!","~");
    }

    public String getBoolOperator() {
        return boolOperator;
    }

    public void setBoolOperator(String boolOperator) {
        this.boolOperator = boolOperator.replaceAll("!","~");
    }

    public String getExpressionRight() {
        return expressionRight;
    }

    public void setExpressionRight(String expressionRight) {
        this.expressionRight = expressionRight.replaceAll("!","~");
    }

    @Override
    public String render() {
        return null;
        }
}
