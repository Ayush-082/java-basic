import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arry");
		n=in.nextInt();
		int[]arr=new int[n];
		System.out.println("enter the element of arry");
		for(i=0;i<n;i++)
		{
		    arr[i]=in.nextInt();
		}
			for(i=3;i<n-1;i++)//deleting 4th element 
			{
			    arr[i]=arr[i+1];
			}
				for(i=0;i<n-1;i++) 
			System.out.println(arr[i]);
		
	}
}
