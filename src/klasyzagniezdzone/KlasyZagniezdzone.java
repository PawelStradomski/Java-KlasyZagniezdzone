
package klasyzagniezdzone;
/**
 * 
 * @author pawelstradomski
 */

public class KlasyZagniezdzone {

    
    public static void main(String[] args) {
        
        A zewnetrzna = new A();
        A.B nazwa = zewnetrzna.new B();
        A.C nazwa2 = new A.C();
        
    }
    
}
class A
{
    A()
    {
        System.out.println("To jest konstruktor klasy zewnetrznej A");
    }
    class B
    {
        B()
        {
            System.out.println("To jest konstruktor klasy zagniezdzonej B");
        }
        
        void metodka() // ta "metodka" pokazuje, ze dostep jest do zewnetrznych danych czyli do test
        {
            test = 5;
        }
        private int tmp;
    }
    static class C
    {
        C()
        {
            System.out.println("To jest konstruktor statycznej klasy zagniezdzonej C");
        }
    }
    
    
    
    private int test;
}
