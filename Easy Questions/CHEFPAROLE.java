import java.util.*;

class CHEFPAROLE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        if(days >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
	}
}