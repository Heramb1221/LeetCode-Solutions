import java.util.*;

class MANGOLASSI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int temp = sc.nextInt();

        if(temp > 35){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
	}
}
