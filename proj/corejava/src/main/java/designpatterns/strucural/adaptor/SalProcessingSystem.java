package designpatterns.strucural.adaptor;

import java.util.List;

public class SalProcessingSystem
{
    public void processSal(List<Emp> empList)
    {
        for(Emp eachObj:empList)
        {
            System.out.println(eachObj.getSal() +" is creadited for the employeer id:"+eachObj.getId() +" name :"+eachObj.getName());
        }
    }
}
