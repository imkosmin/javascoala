



public class Persoane {
//tipVariabila numeVariabila;
      String nume, prenume;
      int anNastere;
      Persoane(){
      nume="abcd";
      prenume="efgh";
      anNastere=0;
      }
      Persoane(String n, String pn, int an){
      nume=n;
      prenume=pn;
      anNastere=an;
      }
      int calcVarsta(int anCurent){
      /*int val;
      val =anCurent-anNastere;
      return val;*/
      return anCurent-anNastere;
      }
      
      void afisare(){
      System.out.println("Persoana: "+nume+" "+prenume+"\n anNastere: "+anNastere);
      }
      public String toString(){
      return "Persoana: "+nume+" "+prenume+"\n anNastere: "+anNastere+"\nVarsta: "+calcVarsta(2005);
      }
      public static void main(String[] args)
      {
      Persoane p1, p2, p3;
      p1=new Persoane();
      p2=new Persoane("Andrei","Ion",1975);
      p3=new Persoane("Popa", "Ilie", 2000);
      p1.afisare();
      System.out.println("Varsta: "+p1.calcVarsta(2007)+"\n\n");
      p2.afisare();
      System.out.println("Varsta: "+p2.calcVarsta(2007)+"\n\n");
      p3.afisare();
      System.out.println("Varsta: "+p3.calcVarsta(2007)+"\n\n");
      System.out.println(p2);
      
      }
      
}
