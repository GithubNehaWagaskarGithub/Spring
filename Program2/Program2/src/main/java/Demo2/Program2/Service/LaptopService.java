package Demo2.Program2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Demo2.Program2.Model.LaptopModel;

@Component
@Service
public class LaptopService {
	@Autowired
	private LaptopModel laptopModel;
	
	List<LaptopModel> lapList=new ArrayList<>();
	
	{
		LaptopModel l1=new LaptopModel(101,"Lenovo",45999.99);
		LaptopModel l2=new LaptopModel(102,"Hp",35999.99);
		LaptopModel l3=new LaptopModel(103,"Dell",40999.99);
		lapList.add(l1);
		lapList.add(l2);
		lapList.add(l3);
	}
	//--------------------------------------------------------------------
	public List<LaptopModel> displayAllData()
	{
		return lapList;
	}
	//-------------------------------------------------------------------
	public LaptopModel displayDataById(int id)
	{
		LaptopModel temp=null;
		for(LaptopModel l:lapList)
		{
			if(l.getLapId()==id)
			{
				temp=l;
				break;
			}
		}
		return temp;
	}
	//-----------------------------------------------------------------------
	public LaptopModel displatDataByName(String name)
	{
		LaptopModel temp=null;
		for(LaptopModel l:lapList)
		{
			if(l.getLapName().equalsIgnoreCase(name))
			{
				temp=l;
				break;
			}
		}
		return temp;
	}
	//-------------------------------------------------------------------------
	public String addDataByEndUser(LaptopModel l)
	{
		if(lapList.add(l))
		{
			return "Data Added Successfully";
		}
		else
		{
			return "Data Not Added";
		}
	}
	//--------------------------------------------------------------------------
	public String updateData(int id,double price)
	{
		boolean status=false;
		for(LaptopModel l:lapList)
		{
			if(l.getLapId()==id)
			{
				l.setLapPrice(price);
				status=true;
				break;
			}
		}
		if(status=true)
		{
			return "Data Updated Successfully";
		}
		else
		{
			return "Data Not Updated";
		}
	}
	//------------------------------------------------------------------------------
	
	public String deleteData(int id)
	{
		boolean status=false;
		for(LaptopModel l:lapList)
		{
			if(l.getLapId()==id)
			{
				lapList.remove(l);
				status=true;
				break;
			}
		}
		if(status=true)
		{
			return "Data Deleted Successfully";
		}
		else
		{
			return "Data Not Deleted";
		}
	}
	//------------------------------------------------------------------------------
	
	public String updateDataByName(String name,double Price)
	{
		boolean status=false;
		for(LaptopModel l:lapList)
		{
			if(l.getLapName()==name)
			{
				l.setLapPrice(Price);;
				status=true;
				break;
			}
		}
		if(status=true)
		{
			return "Data Updated Successfully1";
		}
		else
		{
			return "Data Not Updated";
		}
	}
	//-------------------------------------------------------------------------------
	
	public String deleteDataByName(String name)
	{
		boolean status=true;
		for(LaptopModel l:lapList)
		{
			if(l.getLapName()==name)
			{
				lapList.remove(l);
				status=true;
				break;
			}
		}
		if(status=true)
		{
			return "Data Deleted Successfully1";
		}
		else
		{
			return "Data Not Deleted";
		}
	}
	//-------------------------------------------------------------------------------
	
	public String addData1(LaptopModel l)
	{
		if(lapList.add(l))
		{
			return "Data Added1";
		}
		else
		{
			return "Data Not Added";
		}
	}
	//-----------------------------------------------------------------------------
	
	public LaptopModel displayDataById1(int id)
	{
		LaptopModel temp=null;
		for(LaptopModel l:lapList)
		{
			if(l.getLapId()==id)
			{
				temp=l;
				break;
			}
		}
		return temp;
	}
	//-------------------------------------------------------------------------------
	
	public LaptopModel displayDataByName1(String name)
	{
		LaptopModel temp=null;
		for(LaptopModel l:lapList)
		{
			if(l.getLapName().equalsIgnoreCase(name))
			{
				temp=l;
				break;
			}
		}
		return temp;
	}
	//--------------------------------------------------------------------------------
	
}
