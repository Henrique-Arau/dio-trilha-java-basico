



public class Conta {


    private int Numero;
    public int op;
    private String Agencia; 
    private String NomeCliente;
    private Float Saldo;

    public  Conta(String nomeCliente2, String agencia2, int numero2, Float saldo2) {
        Numero = 10;
        Agencia = "157-20";
        NomeCliente = "Maria" ;
        Saldo = 152.12F;
    }
    
   
    public Conta(int i, String agencia2, String string, float saldo2) {
    }


    public int getNumero() {
        return Numero; 
    }
    public void setNumero(int Numero) {
        this.Numero = Numero; 
    }
    public String getAgencia() {
        return Agencia; 
    }
    public void setAgencia(String Agencia) {
        this.Agencia = Agencia; 
    }
    public String getNomeCliente() {
        return NomeCliente;
    }
    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }
    public Float getSaldo() {
        return Saldo;
    }
    public void setSaldo(Float Saldo) {
        this.Saldo = Saldo;
    }


    public void ContaBanco(String nomeCliente2, String agencia2, int numero2, Float saldo2) {

        this.Numero = numero2;
        this.Agencia = agencia2;
        this.NomeCliente = nomeCliente2 ;
        this.Saldo = saldo2;
    }


    void mostrardado(){
        System.out.println("Nome do Cliente: " + this.getNomeCliente());
        System.out.println("Dono da Conta: " + this.getAgencia());
        System.out.println("Numero da Conta: " + this.getNumero());
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    void mostrarsal(){
            System.out.println("Saldo Atual: " + this.getSaldo()); 
        
    }

   


    

  


}