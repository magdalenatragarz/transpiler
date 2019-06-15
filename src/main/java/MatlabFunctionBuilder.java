import instructions.ClosingInstruction;
import instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class MatlabFunctionBuilder {

    private String functionName;
    private List<String> parameters;
    private List<Instruction> instructions;

    StringBuilder sb;

    public MatlabFunctionBuilder() {
        this.parameters = new ArrayList<>();
        this.instructions = new ArrayList<>();
        this.sb = new StringBuilder();
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void addParameter(String parameterName){
        parameters.add(parameterName);
    }

    public void addInstruction(Instruction instruction){
        instructions.add(instruction);
    }

    public void addClosing(){
        instructions.add(new ClosingInstruction());
    }

    public void buildMethodHeader(){
        sb.append("function out = ")
                .append(functionName)
                .append("(");
        for (String parameter : parameters){
            sb.append(parameter);
            if (!(parameters.lastIndexOf(parameter) == parameters.size()-1)){
                sb.append(",");
            }
        }
        sb.append(")\n");
    }

    public void buildInstructions(){
        for (Instruction instruction : instructions){
            sb.append(instruction.render());
        }
    }

    public String build(){
        buildMethodHeader();
        buildInstructions();
        return sb.toString();
    }


}
