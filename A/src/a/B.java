package a;

/**
 *
 * @author nh114
 */
public class B extends A {

    double b1;
    boolean b2;

    B() {
        super();
        b1 = 0;
        b2 = false;
    }
            B(char a1, String a2,double b1,boolean b2) 
        {
        super(a1,a2);
        this.b1 = b1;
        this.b2 = b2;
        }
        
        public B(B obj)
    {
            super(obj);
           this.b1=obj.b1;
           this.b2=obj.b2;
    }
        
 public void Afisare()
    {
             super.Afisare();
        System.out.println("");

        System.out.print(" b1: "+b1);

        System.out.print(" b2: "+b2);
    }
    
        public String toString()
    {
        super.toString();
        String out="";
        System.out.println("");
        out+=" b1: "+b1;
        out+=" b2: "+b2;
        
        
        return out;
    }
}
