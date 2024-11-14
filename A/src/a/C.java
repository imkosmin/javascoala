package a;

/**
 *
 * @author nh114
 */
public class C extends A {

    float c1;
    char c2;

    C() {
        super();
        c1 = 0f;
        c2 = 'a';
    }
    
        C(char a1, String a2,float c1,char c2) 
        {
            
        super(a1,a2);
        this.c1 = c1;
        this.c2 = c2;
        }
     
        
        public C(C obj)
    {
            super(obj);
           this.c1=obj.c1;
           this.c2=obj.c2;
    }
       public String toString()
    {
        super.toString();
        String out="";
        System.out.println("");
        
        out+=" c1: "+c1;
        out+=" c2: "+c2;
        
        
        return out;
    }
     public void Afisare()
    {
        super.Afisare();
        System.out.println("");
      
        System.out.print(" c1: "+c1);
    
        System.out.print(" c2: "+c2);
    }

}
