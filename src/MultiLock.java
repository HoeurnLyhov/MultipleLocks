import java.util.ArrayList;
import java.util.List;
public class MultiLock 
{
	ArrayList list=new ArrayList();
	public void addData()
	{
		list.add(190.4);
		list.add(1000);
		list.add('A');
		list.add("Hello");
		
		System.out.println(list.size());
	}
	public static void main(String[] args) 
	{
		new MultiLock().addData();

	}

}
