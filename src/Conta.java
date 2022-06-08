public abstract class Conta {
  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int quantidadeDeContas;

  public Conta(int agencia, int numero) {
    Conta.quantidadeDeContas += 1;
    this.agencia = agencia;
    this.numero = numero;
  }

  public static int getQuantidadeDeContas() {
    return Conta.quantidadeDeContas;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if (agencia < 0) {
      System.out.println("O número da agência não pode ser negativo");
      return;
    }
    this.agencia = agencia;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    if (numero < 0) {
      System.out.println("O número não pode ser negativo");
      return;
    }
    this.numero = numero;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public abstract void deposita(double valor);

  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean transfere(double valor, Conta contaDestino) {
    if (this.saldo >= valor) {
      this.saca(valor);
      contaDestino.deposita(valor);
      return true;
    }
    return false;
  }
}