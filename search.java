import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,n,b;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of arr");
		n=input.nextInt();
		int[]arr=new int[n];
		System.out.println("enter the element of arr");
		for(i=0;i<n;i++)
		{
		    arr[i]=input.nextInt();
		}
		   	System.out.println("enter the element  of arr you want to remove");
		  int m=input.nextInt();
		  b=-1;
			for(i=0;i<n;i++)
		{
			    if(arr[i]==m)
			    {
		         b=i;
		        }
		}
		if(b!=-1){
            	for(i=b;i<n-1;i++)
			{
			    arr[i]=arr[i+1];
			}
		}
		if (b==-1){
			    	for(i=0;i<n;i++)
			{
			    System.out.println(arr[i]);
			}
			}
			System.out.println("the new arry is :");
		
			for(i=0;i<n-1;i++)
			{
			    System.out.println(arr[i]);
			}
		
	}
}
