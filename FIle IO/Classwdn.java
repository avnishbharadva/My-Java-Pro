interface Avnish1 {
    void greet();
}

interface Avnish2{
    void greet(int a);
}

public class Classwdn implements Avnish1,Avnish2 {

    public void greet(){
        System.out.println("hello");
    }
    public void greet(int a){
        System.out.println(a);
    }
    // public void greet(){
    //     System.out.println("hello");
    // }
    public static void main(String[] args) {
        Classwdn obj = new Classwdn();
        obj.greet();
        // System.out.println(obj instanceof Avnish1);
        // System.out.println(obj instanceof Avnish2);
        // System.out.println(obj instanceof Classwdn);
        // System.out.println(true + 1); error
        // int x = 9;
        // System.out.println(x);
        // String ans = x%2==0 ? "even" : "odd"; 
        // System.out.println(x%2==0 ? "even" : "odd");
        // x%2==0 ? System.out.println("even") : System.out.println("odd"); error
        // int a=1,b=2,c = 9;
        // System.out.println(a+b+c); // 12
        // a = b = c;
        // System.out.println(a+b+c);
        // int a=1;
        // for(;;){
        //     if(a>=10){
        //         break;
        //     }
        //     System.out.println(a);
        //     a++;
        // }
        String s = "1";
        int c = Integer.parseInt(s);
        System.out.println(c);

        String s1 = "avn";
        String s2 = "dvn";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2)); 
    }
}