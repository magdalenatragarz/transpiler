package instructions;

public class FieldDeclarationInstruction implements Instruction {

    private String name;
    private String declarator;


    public void setDeclarator(String declarator) {
        this.declarator = declarator;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name + " = " + declarator + "\n";
    }


}
