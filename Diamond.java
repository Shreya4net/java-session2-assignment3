package puja;

public class Diamond {
public static void main(String[] args)
{
int i, j;
for(i=1; i<=5 ;i++)
{
	for(j=1; j<=5; j++)
	{
		if(j==5-(i+1)||i==2&&j==4|| i==4&&j==2||(i+j)==8)
				System.out.print("a");
		if(i==2&& j==3||i==3&& j==2||i==4&&j==3||i==3&&j==4)
			System.out.print("b");
		 if(i==3&& j==3)
		 System.out.print("c");
		else
			System.out.print(" ");
	}	
	System.out.println();
}
}
}
 