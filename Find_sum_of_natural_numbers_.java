import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            cnt+=i;
        }

		System.out.println(cnt);
	}
}