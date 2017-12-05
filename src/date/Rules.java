package date;

import java.util.ArrayList;
import java.util.List;

public class Rules {
    List<Record> argumentList=new ArrayList<>();
    Record result;

    public void showRule()
    {
        System.out.print("if ");
        for(Record z:argumentList)
        {
            System.out.print(z.getText()+" ");
        }
        System.out.println(" then "+ result.getText());
    }

    public List<Record> getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(List<Record> argumentList) {
        this.argumentList = argumentList;
    }

    public Record getResult() {
        return result;
    }

    public void setResult(Record result) {
        this.result = result;
    }
}
