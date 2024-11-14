import java.util.Scanner;

public class AICOM {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int diff = sc.nextInt();

        System.out.println((diff <= 60) ? "YES" : "NO");

        sc.close();
	}
}
