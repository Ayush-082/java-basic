import java.util.Scanner;
public class leapyear
{
	public static void main(String[] args) {
		int y;
		Scanner in=new Scanner(System.in);
		System.out.println("entrer the year");
		y=in.nextInt();
		if(y%100==0)
		{
		    if(y%400==0)
		    {
		        System.out.println("leap year");
		    }
		  else{
		      System.out.println("not a leap year");
		  }  
		}
		 if(y%100!=0){
		    if(y%4==0)
		    {
		        System.out.println("leap year");
		    }
           else
		{
		    System.out.println("not a leap year");
		}

		    
		}
	}
}
