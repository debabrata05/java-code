package com.SwingEventDemo.FrameDesign;

import java.util.ArrayList;
import com.SwingEventDemo.Poso.Registration;
import com.SwingEventDemo.FileHandling.UserDataReadWriteFromFile;

public class Search 
{
	public static int searchId(Registration id)
	{
		ArrayList<Registration> list2;
		int f = -1;
		int p = 0;
		try
		{
			list2=UserDataReadWriteFromFile.readDataFromFile();
			
			for(Registration robj : list2)
			{
				
				if(id.equals(robj.getId()))
				{
					f=p;
					break;
				}
				p++;
			}
			
			/*
			 Registration robj;
			 for(int p=0; p<list2.size(); p++)
			{
				robj = list2.get(p)
				if(id.equals(robj.getId()))
				{
				   f = p;
				   break;
				}	
			}*/
			 
			return(f);
		}catch(Exception e)
		{
			System.out.println(e);
			return(-2);
		}
 	}
}