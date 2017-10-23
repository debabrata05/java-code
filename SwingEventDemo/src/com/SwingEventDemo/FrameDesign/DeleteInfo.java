package com.SwingEventDemo.FrameDesign;

import java.util.ArrayList;
import com.SwingEventDemo.Poso.Registration;
import com.SwingEventDemo.FileHandling.UserDataReadWriteFromFile;

public class DeleteInfo 
{
	public static void deleteInfoData(int index)
	{
		ArrayList<Registration> list1;
		
		list1=UserDataReadWriteFromFile.readDataFromFile();
		
		list1.remove(index);
		 
		UserDataReadWriteFromFile.writeDatatoFile(list1);
	}
}