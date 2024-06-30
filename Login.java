import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<String>();

        int choice = 1;

        while(choice!=0)
        {
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    // System.out.println("login start");
                    // System.out.println("Enter username : ");
                    // String un = sc.nextLine();
                    // System.out.println("Enter password : ");
                    // String ps = sc.nextLine();
                    int count = 3;
                    for(int i=1;i<=3;i++)
                    {
                        System.out.println("Enter password : ");
                        String ps = sc.nextLine();

                        if(ps.equals("avnish18"))
                        {
                            System.out.println("Access Granted");
                            break;
                        }
                        else
                        {
                            System.out.println("Password Wrong");
                        }
                        count--;
                    }
                    if(count==0)
                    {
                        System.out.println("Access Denied");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("sign up start");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("enter valid");
            }
        }
    }
}
