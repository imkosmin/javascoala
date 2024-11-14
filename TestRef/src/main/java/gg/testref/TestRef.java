package gg.testref;

/**
 */
class TestRef {

    static String metoda1() {
        String str = new String("un sir");
        return str; //str=un sir
    }

    static void metoda2(String s) {
        String s1 = new String("alt sir");
        s = s1; //s=alt sir
    }

    public static void main(String args[]) {
        String sir1 = null, sir2 = null;
        sir1 = metoda1();
        metoda2(sir2);
        System.out.println("sir1=" + sir1 + "--sir2=" + sir2); //sir1=un sir--sir2=null
    }
}
