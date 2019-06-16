package instructions;

public class WhileInstruction implements Instruction {

    private String key;
    private String relationalExpression;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRelationalExpression() {
        return relationalExpression;
    }

    public void setRelationalExpression(String relationalExpression) {
        this.relationalExpression = relationalExpression;
    }


    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        if (relationalExpression != null){
            sb.append(key).append(" ").append(relationalExpression).append("\n");
            return sb.toString();
        }else{
            sb.append(key).append("\n");
        }
        return sb.toString();

    }
}
