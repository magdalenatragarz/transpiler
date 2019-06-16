package instructions;

public class ReturnInstruction implements Instruction {
    private String name="out";
    private String declarator;

    public void setDeclarator(String declarator) {
        if (declarator.equals("null")){
            this.declarator = "NaN";

        }
        else{
            this.declarator = declarator;
        }

    }
    @Override
    public String render() {
        return name + " = " + declarator + "\n";
    }
}
