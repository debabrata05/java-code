package com.SwingEventDemo.FrameDesign;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.SwingEventDemo.Poso.Registration;
import com.SwingEventDemo.FileHandling.UserDataReadWriteFromFile;

public class SearchDisp extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public SearchDisp(int index)
	{
		super("Search Window");
		String heading[]={"ID","Password","Name","EmailId","MobNo","Address","City","Gender","DOB","Interests","Reg Date","Reg Time"};
		String data[][] = new String[5][12];;
		ArrayList<Registration> list6;
		try
		{
			list6 = UserDataReadWriteFromFile.readDataFromFile();
					
			Registration re = list6.get(index);
			
			int r = 0;
			data[r][0]=re.getId();
			data[r][1]=re.getPassword();
			data[r][2]=re.getName();
			data[r][3]=re.getEmailid();
			data[r][4]=re.getMobno();
			data[r][5]=re.getAddress();
			data[r][6]=re.getCity();
			data[r][7]=re.getGender();
			data[r][8]=re.getDob();
			data[r][9]=re.getInterests();
			data[r][10]=re.getDate();
			data[r][11]=re.getTime();
					
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("Information Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(850, 300);
			
			setLocation(200, 200);
			setVisible(true);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

