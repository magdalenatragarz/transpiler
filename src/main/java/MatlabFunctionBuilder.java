import java.util.ArrayList;
import java.util.List;

public class MatlabFunctionBuilder {

    String functionName;
    List<String> parameters;
    List<String> instructions;

    public MatlabFunctionBuilder() {
        parameters = new ArrayList<>();
        instructions = new ArrayList<>();
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void addParameter(String parameterName){
        parameters.add(parameterName);
    }

    public void addInstruction(String instruction){
        instructions.add(instruction);
    }

    public void addClosing(){
        instructions.add("end\n");
    }

    public String build(){
        StringBuilder sb = new StringBuilder();
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
        return sb.toString();
    }
}
