class Conta {
    int numero;
    String titular;
    double saldo;
    
    //void não retorna  nenhum valor ele somente executa as ações
    void sacar(double quantidade){
        /*double novoValor = this.saldo - quantidade;
        this.saldo = novoValor;*/
        System.out.println("Saque..." + quantidade);
        this.saldo -= quantidade;
    };
    void depositar (double quantidade){
        /*double novoValor = this.saldo + quantidade;
        this.saldo = novoValor;*/
        System.out.println("Deposito..." + quantidade);
        this.saldo += quantidade;
    };
    
/*    String imprimirTudo(){
        return "Nome: " + this.titular + "\tSaldo: " + this.saldo + ""
               + "\tNumero da conta" + this.numero;
    }*/
    void imprimirTudo(){
        System.out.println("Nome: " + this.titular + "\tSaldo: " + this.saldo + ""
               + "\tNumero da conta: " + this.numero);
    }
}
