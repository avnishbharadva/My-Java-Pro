import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int no;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        no = sc.nextInt();

        boolean prime = checkPrime(no);

        if (prime == true)
            System.out.println(no + " is prime number");
        else
            System.out.println(no + " is not prime number");
    }

    public static boolean checkPrime(int no) {
        int temp = 0;

        if (no == 2)
            return true;
        else {
            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0)
                return true;
            else
                return false;
        }
    }
}