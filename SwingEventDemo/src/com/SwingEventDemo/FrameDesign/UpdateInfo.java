package com.SwingEventDemo.FrameDesign;

import java.util.ArrayList;
import com.SwingEventDemo.Poso.Registration;
import com.SwingEventDemo.FileHandling.UserDataReadWriteFromFile;

public class UpdateInfo 
{
	public static void UpdateInfodata(Registration rg,int index)
	{
		ArrayList<Registration> list1;
		
		list1=UserDataReadWriteFromFile.readDataFromFile();
		
		list1.set(index, rg);
		 
		UserDataReadWriteFromFile.writeDatatoFile(list1);
	}
}