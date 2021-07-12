
import java.util.Scanner;

public class Temple_Land {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No cases");
		int n = sc.nextInt();
		for(int k=1; k<=n; k++)
		{
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			int [] a = new int[size];
			System.out.println("Enter "+size+" Element");
			for (int i = 0; i < a.length; i++) 
			{
				a[i] = sc.nextInt();
			}
			int j = a.length-1;
			int cnt=0;
			for (int i = 0; i < a.length/2; i++) 
			{
				if(a[i] == a[j--] && a[0]==1 && a[1]==2)
					cnt++;
			}
			if(cnt == (a.length-1)/2)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		/*int no = 1221;
		int temp = no;
		int rev =0;
		int cnt =0;
		while(temp >0)
		{
			cnt++;
			int rem = temp%10;
			rev = rev*10 + rem;
			temp /= 10;
		}
		if(no == rev && cnt % 2 ==1 )
			System.out.println("Yes");
		else
			System.out.println("No");*/
	}

}
