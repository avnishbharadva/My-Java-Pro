public class ExceptionHanding {
    public static void validate(int age) throws ArrayIndexOutOfBoundsException
        {
            if(age>18)
            {
                throw new ArrayIndexOutOfBoundsException("not valid");
                // throw new ArithmeticException("fnwkn");
                System.out.println("cnwi");
            }
            else
                System.out.println("done");
        }
    public static void main(String[] args) {
        // System.out.println("first");
        // try{
        //     System.out.println("first try");
        //     int a[] = new int[3];
        //     // a[34] = 78;
        //     // a[4] = 1/0;
        //     String d = "29";
        //     System.out.println(d.charAt(23));
        //     System.out.println("last try"); // it will skipped due to exception
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println(e.getMessage());
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e.getMessage());
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
        // finally{
        //     System.out.println("finally called");
        // }
        // // System.out.println(4/0);
        // System.out.println("last");

        // try
        // {
        //     System.out.println("start");
        //     try
        //     {
        //         System.out.println(1/0);
        //     }
        //     catch(ArithmeticException e)
        //     {
        //         System.out.println(e.getMessage());
        //     }
        //     try
        //     {
        //         int a[] = new int[3];
        //         a[3] = 34;
        //     }
        //     catch(ArrayIndexOutOfBoundsException e)
        //     {
        //         System.out.println(e.getMessage());
        //     }
        //     System.out.println(4/0);
        //     System.out.println("end");
        // }
        // // catch(Exception e)
        // // {
        // //     System.out.println(e.getMessage());
        // // }
        // finally
        // {
        //     System.out.println("finally block");
        // }
        // System.out.println("rest");

        

        validate(83);
    }
}
