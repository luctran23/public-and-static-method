
package publicvsstaticmethod;


public class PublicVsStaticMethod {
    static void myStaticMethod() {
        System.out.println("static method can be called without creating objects ");
    }
    public void myPublicMethod() {
        System.out.println("public method must be called by creating objects ");
    }
    public static void main(String[] args) {
        myStaticMethod();
        PublicVsStaticMethod obj = new PublicVsStaticMethod();
        obj.myPublicMethod();
    }
    
}
