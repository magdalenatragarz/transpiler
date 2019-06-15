package instructions;

public class ClosingInstruction implements Instruction {

    @Override
    public String render() {
        return "end\n";
    }
}
