import java.util.*;

class ADVITIYA1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int running = sc.nextInt();

        if(running == 16 || running == 17 || running == 18) {
            System.out.println("ADVITIYA");
        } else {
            System.out.println("WAITING FOR ADVITIYA");
        }

        sc.close();
	}
}