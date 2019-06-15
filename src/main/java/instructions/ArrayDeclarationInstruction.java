package instructions;

public class ArrayDeclarationInstruction implements Instruction{

    private String name;
    private String initializationList;

    public void setName(String name) {
        this.name = name;
    }

    public void setInitializationList(String initializationList) {
        this.initializationList = initializationList.replace("{","[").replace("}","]");
    }

    @Override
    public String render() {
        return name + " = " + initializationList + "\n";
    }
}
