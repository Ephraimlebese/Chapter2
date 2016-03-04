package Chapter2TestDrivenDevelopment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/04.
 */
public class ChapterExecises
{
    public float returnFloat(float floatNum1, float floatNum2)
    {
        return floatNum1 * floatNum2;
    }

    public String returnNull()
    {
        return null;
    }

    public String returnObject()
    {
        return "obj1";
    }

    public List<String> returnList()
    {
        List list = new ArrayList();

        list.add("Thabo");

        return list;
    }


}
