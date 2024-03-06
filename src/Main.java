import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {

            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    banco.cadastrarCliente();
                    break;
                case 2:
                    banco.consultarSaldo();
                    break;
                case 3:
                    banco.depositar();
                    break;
                case 4:
                    banco.sacar();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Realizar depósito");
        System.out.println("4. Realizar saque");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }
}

class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

class Banco {
    private Cliente cliente;
    private ContaBancaria conta;

    public Banco() {
        this.cliente = null;
        this.conta = null;
    }

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        this.cliente = new Cliente(nome, sobrenome, cpf);
        this.conta = new ContaBancaria();
    }

    public void consultarSaldo() {
        if (cliente != null && conta != null) {
            System.out.println("Saldo atual: R$" + conta.getSaldo());
        } else {
            System.out.println("Cliente não cadastrado.");
        }
    }

    public void depositar() {
        if (cliente != null && conta != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor a ser depositado: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Cliente não cadastrado.");
        }
    }

    public void sacar() {
        if (cliente != null && conta != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor a ser sacado: ");
            double valor = scanner.nextDouble();
            if (conta.sacar(valor)) {
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Cliente não cadastrado.");
        }
    }
}
