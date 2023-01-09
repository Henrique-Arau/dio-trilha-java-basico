
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(10, "157-20", "Maria", 152.12F);
        try (Scanner leitura = new Scanner(System.in)) {
            String nomeCliente;
            int numero, op;
            String agencia;
            Float saldo;
                do{
                    System.out.println("----- * Menu * > Conta Bancaria-----");
                    
                    System.out.println("1- Nome Cliente:");
                    System.out.println("2- Agencia:");
                    System.out.println("3- Numero:");
                    System.out.println("4- Saldo:");
                    System.out.println("0 - Sair ---------------------------");
                    leitura.nextLine();
                    op = leitura.nextInt();
                    switch(op){
                        
                        case 1 :  
                            System.out.println("Entre com o nome do cliente:"); 
                            nomeCliente = leitura.nextLine();
                    
                            

                            System.out.println("Entre com a Agencia: "); 
                            agencia = leitura.nextLine();
    
            
                             
                            
                            System.out.println("Entre com o Numero: "); 
                            numero = leitura.nextInt();


                          

                            System.out.println("Entre com o saldo");
                            saldo = leitura.nextFloat();

                            minhaConta.ContaBanco(nomeCliente, agencia, numero, saldo);
                            
                            break;
                            case 2 :
                                minhaConta.mostrardado();
                            break;


                            
                    }
                    }while(op != 0);
        }
        }

     
    }

