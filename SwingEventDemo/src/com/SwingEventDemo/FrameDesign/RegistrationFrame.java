package com.SwingEventDemo.FrameDesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.SwingEventDemo.FileHandling.UserDataReadWriteFromFile;
import com.SwingEventDemo.Poso.Registration;

public class RegistrationFrame extends JFrame
{
	  private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	  private JTextField tid,tname,temailid,tmobno;
	  private JPasswordField tpass;
	  private JTextArea tadd;
	  private JComboBox city,day,month,year;
	  private JCheckBox cmo,cmu,cco;
	  private JRadioButton rmale,rfemale;
	  private JButton bregister,bshowall, bsearch, bupdate,bclearall,bdelete;
	
	  private String sysdate,systime;
	
	  private final JMenuBar jmenubar;
      private final JMenu jmenu;
      private final JMenuItem jmenuregister,jmenushowall,jmenusearch,jmenuupdate;
		
	  ArrayList<Registration> userlist;
	  
	  Registration r;
	
	  public RegistrationFrame(String title)
	  {
		  super(title);
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(16,2));
				
		  tid=new JTextField(20);
		  tpass=new JPasswordField(20);
		  tname = new JTextField(20);
		  tname.addFocusListener( new FocusAdapter() 
		                          {
			                         public void focusGained(FocusEvent e)
			                         {
       	                                  tname.setBackground(Color.WHITE);
			                         }
		                          }
			                    );
		 
		  temailid = new JTextField(20);
		  tmobno = new JTextField(20);
		  
		  tadd=new JTextArea(5,20);
		  JScrollPane tapan=new JScrollPane(tadd);
				
		  String ctvalue[]={"Kolkata","Delhi","Mumbai","Chennai","Hydrabad","Pune","Bangalore"};
		  city=new JComboBox(ctvalue);
		 				
		  rmale=new JRadioButton("Male");
		  rfemale=new JRadioButton("Female");
		 
		   ButtonGroup rgroup=new ButtonGroup();
		   rgroup.add(rmale);
		   rgroup.add(rfemale);
		   
		   JPanel gpanel=new JPanel();
		   gpanel.add(rmale);
		   gpanel.add(rfemale);
				
		   String dvalue[]=new String[31];
		   for(int i=0;i<=30;i++)
		   {
				dvalue[i]=String.valueOf(i+1);
		   }
		   day=new JComboBox(dvalue);
				
		   String mvalue[]=new String[12];
		   for(int i=0;i<=11;i++)
		   {
				mvalue[i]=String.valueOf(i+1);
		   }
		   month=new JComboBox(mvalue);
				
		   String yvalue[]=new String[12];
		   int cnt=0;
		   for(int i=2000;i<=2011;i++)
		   {
				yvalue[cnt]=String.valueOf(i);
				cnt++;	
		   }
		   year=new JComboBox(yvalue);
			
		    JPanel cpanel=new JPanel();
		    cpanel.add(day);
			cpanel.add(month);
			cpanel.add(year);
				
			cmo=new JCheckBox("Movie");
			cmu=new JCheckBox("Music");
			cco=new JCheckBox("Computer");
			
			JPanel ipanel=new JPanel();
			ipanel.add(cmo);
			ipanel.add(cmu);
			ipanel.add(cco);
				
			bregister =new JButton("Register");
			bregister.addActionListener((e) ->
			                             {
			                            	addInformation();
			                            	
			                              }
			                            );
				
			bshowall=new JButton("Show All");
			bshowall.addActionListener((e) ->
            							{
            							   new DisplayAllData();
            							}
									  );
				
			bsearch=new JButton("Search");
			bsearch.addActionListener((e) ->
			                           {
				                          createRegObj();
				                          int idfoundpos = Search.searchId(r);
				                          if(idfoundpos >= 0)
				                          {
				                        	  new SearchDisp(idfoundpos);
				                          }
				                          else
				                          {
				                        	  JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
				                          }
				                       }
					 				 );
				
			bupdate=new JButton("Update");
			bupdate.addActionListener((e) ->
                                       {
                                    	   updateInformation();
                                    	   resetFrame();
                                       }
			                        );
			
			bclearall = new JButton("Reset All");
			bclearall.addActionListener((e) ->
                                         {
                                        	 resetFrame();
         	                             }
                                       );
			
			bdelete = new JButton("Delete");
			bdelete.addActionListener((e) ->
                                       {
                                    	   deleteInformation();
                                       }
									 );
			
			Font f=new Font("Chiller",Font.BOLD,27);
			l1=new JLabel("REGISTRATION");
			l1.setFont(f);
			l1.setForeground(Color.BLUE);
				
			Font f1=new Font("comic sans ms",Font.BOLD,14);
			l2=new JLabel("Enter User Id");
			l2.setFont(f1);
			l2.setForeground(Color.RED);
				
			l3=new JLabel("Enter Pasword");
			l3.setFont(f1);
			l3.setForeground(Color.RED);
			
			l13=new JLabel("Enter Name");
			l13.setFont(f1);
			l13.setForeground(Color.RED);
			
			l14=new JLabel("Enter EmailId");
			l14.setFont(f1);
			l14.setForeground(Color.RED);
			
			l15=new JLabel("Enter Mob No");
			l15.setFont(f1);
			l15.setForeground(Color.RED);
				
			l4=new JLabel("Enter Address");
			l4.setFont(f1);
			l4.setForeground(Color.RED);
			
			l5=new JLabel("Select City");
			l5.setFont(f1);
			l5.setForeground(Color.RED);
				
			l6=new JLabel("Select Gender");
			l6.setFont(f1);
			l6.setForeground(Color.RED);
				
			l7=new JLabel("Select DOB");
			l7.setFont(f1);
			l7.setForeground(Color.RED);
				
			l8=new JLabel("Select Interests");
			l8.setFont(f1);
			l8.setForeground(Color.RED);
				
			l9=new JLabel("Current Date");
			l9.setFont(f1);
			l9.setForeground(Color.RED);
			
			//Java 8 new class
			LocalDate today = LocalDate.now();
			int day = today.getDayOfMonth();
	  		int month = today.getMonthValue();
	  		int year = today.getYear();
				
			sysdate = day+"/"+month+"/"+year;
			l11=new JLabel(sysdate);		
			
			//Java 8 new class
			LocalTime time = LocalTime.now();
			int hr = time.getHour();
	 		int min = time.getMinute();
	 		int sec = time.getSecond();
			
	 		systime = hr+":"+min+":"+sec;
			l12=new JLabel(systime);		
				
			l10=new JLabel("Current Time");
			l10.setFont(f1);
			l10.setForeground(Color.RED);

			c.add(l1);c.add(new JLabel(""));
			c.add(l2);c.add(tid);
			c.add(l3);c.add(tpass);
			c.add(l13);c.add(tname);
			c.add(l14);c.add(temailid);
			c.add(l15);c.add(tmobno);
			c.add(l4);c.add(tapan);
			c.add(l5);c.add(city);
			c.add(l6);c.add(gpanel);
			c.add(l7);c.add(cpanel);
			c.add(l8);c.add(ipanel);
			c.add(l9);c.add(l11);
			c.add(l10);c.add(l12);
			c.add(bregister);c.add(bshowall);
			c.add(bsearch);c.add(bupdate);
			c.add(bclearall);c.add(bdelete);
			
		                
		    jmenubar = new JMenuBar();
		                
		    jmenu = new JMenu("OPTION");
		    jmenu.setMnemonic(KeyEvent.VK_O);
		                
		     jmenuregister = new JMenuItem("Register");
		     jmenuregister.setMnemonic(KeyEvent.VK_R);
		     jmenuregister.setToolTipText("Registration...");
		     jmenuregister.addActionListener((e) ->
                                              {
            	                                 addInformation();
                                              }
                                            );
		                
		     jmenushowall = new JMenuItem("Show All");
		     jmenushowall.setMnemonic(KeyEvent.VK_A);
		     jmenushowall.addActionListener((e) ->
                                             {
                                                new DisplayAllData();
                                             }
                                           );
		                
		     jmenusearch = new JMenuItem("Search");
		     jmenusearch.setMnemonic(KeyEvent.VK_S);
		     jmenusearch.addActionListener((e) ->
                                           {
                                             createRegObj();
                                             int idfoundpos = Search.searchId(r);
                                             
                                             if(idfoundpos >= 0)
                                             {
              	                                new SearchDisp(idfoundpos);
                                             }
                                             else
                                             {
              	                               JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
                                             }
                                           }
		    		                      );
		                
		     jmenuupdate = new JMenuItem("Update");
		     jmenuupdate.setMnemonic(KeyEvent.VK_U);
		     jmenuupdate.addActionListener((e) ->
                                            {
                                            	updateInformation();
                                            }
		    		 		    		 );
		                
		     jmenu.add(jmenuregister);
		     jmenu.add(jmenushowall);
		     jmenu.add(jmenusearch);
		     jmenu.add(jmenuupdate);
		                
		     jmenubar.add(jmenu);
		     setJMenuBar(jmenubar);
		                
			 setSize(450, 600);
			 setLocation(200,200);
			 setResizable(false);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setVisible(true);	
	   }
	
	   public boolean dataValidation()
	   {
		   boolean namevalidation = nameCheck();
		   boolean emailvalidation = emilcheck();
		   boolean mobnovalidation = mobnocheck();
		   
		   if (namevalidation && emailvalidation & mobnovalidation)
			   return true;
		   
		   return false;
	   }
	   
	   public boolean nameCheck()
	   {
		  boolean namevalid = true;
	      String namepattern = "^[a-zA-Z]{3,8}$";
	    	
	      Scanner sc1 = new Scanner(tname.getText().trim());
	    	
	      String match = sc1.findInLine(namepattern);
	    	
	      if (match == null)
	      {
	    	  JOptionPane.showMessageDialog(this, "Invalid Name..Please Enter Another Name");
	    	  tname.setText("");
	    	  tname.setBackground(Color.RED);
	       	  namevalid = false;
	      }
	      return namevalid;
	   }
	   
	   public boolean emilcheck()
	    {
		    boolean emailvalid = true;
	    	String emailpattern = "^(\\w)+@(\\w+\\.)(\\w+\\.)?[A-Za-z]+$";
	    	
	    	Scanner sc2 = new Scanner(temailid.getText().trim());
	    	
	    	String match1 = sc2.findInLine(emailpattern);
	    	
	    	if (match1 == null)
	    	{
	    	   JOptionPane.showMessageDialog(this, "Invalid EmailId..Please Enter Another Email");
		       temailid.setText("");
		      // temailid.setBackground(Color.RED);
		       emailvalid = false;
	    	}
	    	
	    	return emailvalid;
	    }
	
	   public boolean mobnocheck()
	   {
		   boolean mobilenovalid = true;
		   
		   String mobnopattern = "^[0-9]{10}$";
	    	
	       Scanner sc3 = new Scanner(tmobno.getText().trim());
	    	
	       String match2 = sc3.findInLine(mobnopattern);
	    	
	    	if (match2 == null)
	    	{
	    		 JOptionPane.showMessageDialog(this, "Invalid Mobno..Please Enter Another MobNo");
			     tmobno.setText("");
			   //  tmobno.setBackground(Color.RED);
			     mobilenovalid = false;
	    	}
		   	return mobilenovalid;
	    }
	   	   
	   public void createRegObj()
	   {
		    String id,pass,name,emailid,mobno,add,ct,gn,dob,ins;
			
			id=tid.getText().trim();
			pass=tpass.getText().trim();
			name = tname.getText().trim();
			emailid = temailid.getText().trim();
			mobno = tmobno.getText().trim();
			add=tadd.getText().trim();
			ct=(String)city.getSelectedItem();
			
			gn="";
			if(rmale.isSelected())
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			
			ins="";
			if(cmo.isSelected())
			{
				ins="Movie ";
			}
			if(cmu.isSelected())
			{
				ins = ins + "Music ";
			}
			if(cco.isSelected())
			{
				ins = ins + "Computer";
			}
			
			r=new Registration(id, pass,name,emailid,mobno, add, ct, gn, dob, ins,sysdate,systime);
		 }
	   
	     public void addInformation()
	     {
	    	boolean isdatavalidate = dataValidation(); 
         	if(isdatavalidate)
         	{
	    	   createRegObj();
	    	
         	   int idfoundpos = Search.searchId(r);
         	
         	   if(idfoundpos >= 0)
         	   {
         		   JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
         	   }
         	   else
         	   {
         	       int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
  			       if(con==JOptionPane.YES_OPTION)
  			       {
  				      userlist = UserDataReadWriteFromFile.readDataFromFile();
  				      userlist.add(r);
  				      UserDataReadWriteFromFile.writeDatatoFile(userlist);
  				      JOptionPane.showMessageDialog(this, "Registration Successful...");
  				    
  				      resetFrame();
  			       }
         	    }
         	}
	     }
	   
	     public void updateInformation()
	     {
	    	 createRegObj();
             int idfoundpos = Search.searchId(r);

             if(idfoundpos >= 0)
             {
                UpdateInfo.UpdateInfodata(r, idfoundpos);
                JOptionPane.showMessageDialog(this, "Information Updated...");
             }
             else
             {
                JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
             }
	     }
	     
	     public void deleteInformation()
	     {
	    	 createRegObj();
             int idfoundpos = Search.searchId(r);

             if(idfoundpos >= 0)
             {
            	 DeleteInfo.deleteInfoData(idfoundpos);
                JOptionPane.showMessageDialog(this, "Information Deleted...");
             }
             else
             {
                JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
             }
	     }
	   
	     public void resetFrame()
	     {
	    	 this.dispose();
        	 new RegistrationFrame("Registration...");
	     }
	     
	     public static void main(String[] args) 
	     {
		  new RegistrationFrame("Registration...");
	     }
}
