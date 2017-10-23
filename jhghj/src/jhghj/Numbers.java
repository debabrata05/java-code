package jhghj;

import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		int[] a=new int[n];
		int[] o=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<11)
			{
				o[i]=2*a[i]-1;
			}
			else if(a[i]<111 && a[i]>=11)
			{
				if(a[i]%11==0)
				{
					int c=a[i]/11;
					o[i]=c*2+(c-1);
				}
				else
				{
					int r=a[i]%11;
					int d=a[i]/11;
					o[i]=d*2+(d-1)+2*r;
				}
			}
			else if(a[i]<1111 && a[i]>=111)
			{
				if(a[i]%11==0)
				{
					int c=a[i]/11;
					o[i]=c*2+(c-1);
				}
				else if(a[i]%111==0 && a[i]%11!=0)
				{
					int c=a[i]/111;
					o[i]=c*3+(c-1);
				}
				else
				{
					int r1=a[i]%111;
					int d1=a[i]/111;
					int d2=r1/11;
					int r2=r1%11;
					o[i]=(d1*3+(d1-1))+(d2*2+(d2-1))+2*r2;
				}
			}
			else if(a[i]<10000)
			{
				if(a[i]%11==0)
				{
					int c=a[i]/11;
					o[i]=c*2+(c-1);
				}
				else if(a[i]%111==0 && a[i]%11!=0)
				{
					int c=a[i]/111;
					o[i]=c*3+(c-1);
				}
				else if(a[i]%1111==0 && a[i]%111!=0 && a[i]%11!=0)
				{
					int c=a[i]/1111;
					o[i]=c*4+(c-1);
				} 
				else
				{
					int r1=a[i]%1111;
					int d1=a[i]/1111;
					int d2=r1/111;
					int r2=r1%111;
					int d3=r2/11;
					int r3=r2%11;
					o[i]=(d1*4+(d1-1))+(d2*3+(d2-1))+(d3*2+(d3-1))+2*r3;
				}
			}
			else
			{
				System.out.println("0");
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(o[i]);
		}
		in.close();
	}

}

