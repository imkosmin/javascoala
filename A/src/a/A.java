package a;

/**
 *
 * @author nh114
 */
public class A {
    char a1 ;
    String a2;


    A() {
        a1 = '0';
        a2 = "";
    }

    A(char a1, String a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

        public A(A obj)
    {
           this.a1=obj.a1;
           this.a2=obj.a2;
    }
    
    public String toString()
    {
        String out="";
        System.out.println("");
        out+=" a1: "+a1;
        out+=" a2: "+a2;
        
        
        return out;
    }
    public void Afisare()
    {
        System.out.println("");

        System.out.print(" a1: "+a1);

        System.out.print(" a2: "+a2);
    }
    
    
    public void maiMareAaa()
    {
   
        if(a1>200 && a2.contains("aaa"));
        System.out.println(this);
    }
    
    
    
    public static void main(String[] args) {
        char a1='d';
        char b01='e';
  
        double b1=23;
        float c1=13;
        int b3=55;
        String a2="aaadasd";       
        String b02="boo";
        boolean b2=false;
        char c2='c';
        char c01='z';
        String c02="coo";
        
        
        A obiect1=new A(a1,a2);
        B obiect2=new B(b01,b02,b1,b2);
        C obiect3=new C(c01,c02,c1,c2); 
        A obiect12=new C(obiect3);
        obiect12.Afisare();
        System.out.println(obiect12.toString());

          obiect1.maiMareAaa();
        
        
        
    }

}
