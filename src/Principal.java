public class Principal {
    //PSVM
    public static void main(String[] args) {
        Conta contaDoEwerton;
        contaDoEwerton = new Conta();
        contaDoEwerton.titular = "Ewerton";
        contaDoEwerton.saldo = 99.9;
        contaDoEwerton.numero= 1222;
        
        Conta conta2 = new Conta();
        conta2.titular = "Jose";
        conta2.saldo = 500.0;
        conta2.numero = 1002;
        conta2.imprimirTudo();
        
        /*contaDoEwerton.sacar(20.0);
        contaDoEwerton.imprimirTudo();
        
        contaDoEwerton.depositar(50.0);
        contaDoEwerton.imprimirTudo();
        
        contaDoEwerton.depositar(50.0);
        contaDoEwerton.imprimirTudo();
        
        contaDoEwerton.depositar(10.0);
        contaDoEwerton.imprimirTudo();*/
        
/*        sout
        System.out.println("Conta = " + contaDoEwerton.numero);
        System.out.println("Nome = " + contaDoEwerton.titular);
        System.out.println("Saldo = " + contaDoEwerton.saldo);
        System.out.println("Após Sacar");
        System.out.println("Conta = " + contaDoEwerton.numero);
        System.out.println("Nome = " + contaDoEwerton.titular);
        System.out.println("Saldo = " + contaDoEwerton.saldo); 
        System.out.println("Após Depositar");
        System.out.println("Conta = " + contaDoEwerton.numero);
        System.out.println("Nome = " + contaDoEwerton.titular);
        System.out.println("Saldo = " + contaDoEwerton.saldo);*/

        

    }
}
