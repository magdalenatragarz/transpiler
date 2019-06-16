package instructions;

public class AssignmentInstruction implements Instruction {

    private String name;
    private String declarator;


    public void setDeclarator(String declarator) {
        if (declarator.equals("null")){
            this.declarator = "NaN";

        }
        else{
            this.declarator = declarator;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name + " = " + declarator + "\n";
    }
}
