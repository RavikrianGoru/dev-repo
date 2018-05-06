package designpatterns.strucural.adaptor;

import java.util.Arrays;
import java.util.List;

public class EmpAdaptor implements IEmpAdaptor
{
    SalProcessingSystem salObj=new SalProcessingSystem();
    @Override
    public void processSal(Emp[] empArray)
    {
        List<Emp> empList=Arrays.asList(empArray);
        salObj.processSal(empList);
    }

}
