public class First_primes {
    public static void main(String[] args) {
        primes(14);
    }

    public static void primes(int len) {
        int no = 0;
        int pn = 2;

        while (no != len) {
            if (pn == 2) {
                System.out.print(pn + " ");
                no++;
            } else {
                boolean chk = false;
                for (int i = 2; i < pn; i++) {
                    if (pn % i == 0) {
                        chk = true;
                        break;
                    }
                }

                if (!chk)
                {
                    System.out.print(pn + " ");
                    no++;
                }
            }

            pn++;
        }
    }
}
