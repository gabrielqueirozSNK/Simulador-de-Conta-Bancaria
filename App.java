public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();
        c1.cliente = "SNK";
        c1.numeroDaConta = "6767";
        c1.saldo = 200.00;

        c1.informaçoes();

        System.out.println("===================================");

        Conta c2 = new Conta();
        c2.cliente = "KNS";
        c2.numeroDaConta = "6969";
        c2.saldo = 100.00;

        c2.informaçoes();

        System.out.println("===================================");
        c1.depositar(50.00);
        c2.depositar(50.00);
        System.out.println("===================================");
        c1.informaçoes();
        c2.informaçoes();
        System.out.println("===================================");
        c1.sacar(300.00);
        c2.sacar(250.00);
          System.out.println("===================================");
        c1.informaçoes();
        c2.informaçoes();
         System.out.println("===================================");
        c1.sacar(250.00);
        c2.sacar(150.00);
        System.out.println("===================================");
        c1.informaçoes();
        c2.informaçoes();

     
        


       
        



    }

}
