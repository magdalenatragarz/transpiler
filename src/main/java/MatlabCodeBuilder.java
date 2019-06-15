import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MatlabCodeBuilder {


    private List<MatlabFunctionBuilder> functions;


    public void setFunctions(List<MatlabFunctionBuilder> functions) {
        this.functions = functions;
    }

    public String render(){
        StringBuilder sb = new StringBuilder();

        for (MatlabFunctionBuilder function : functions){
            sb.append(function.build());
        }

        return sb.toString();
    }

}
