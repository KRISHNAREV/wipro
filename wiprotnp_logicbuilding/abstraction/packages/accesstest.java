import test.foundation;

public class accesstest {

    public static void main(String[] args) {

        foundation obj = new foundation();

        // System.out.println(obj.var1); // Private - Not Accessible
        // System.out.println(obj.var2); // Default - Not Accessible
        // System.out.println(obj.var3); // Protected - Not Accessible

        System.out.println("Public Variable : " + obj.var4);
    }
}