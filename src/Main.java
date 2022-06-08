public class Main {
  public static void main(String[] args) {
    Gerente funcionario = new Gerente("fulano", "123.123.123.-213", 2000);
    funcionario.setSenha(111);

    Cliente cliente = new Cliente("fulano", "12.3.23.23", "professor");

    SistemaInterno sistema = new SistemaInterno();
    sistema.autentica(funcionario);

    ContaCorrente contaCorrente = new ContaCorrente(123, 123);
    contaCorrente.deposita(100.00);

    SeguroDeVida seguroDeVida = new SeguroDeVida();

    CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
    calculadorDeImposto.registra(seguroDeVida);
    calculadorDeImposto.registra(contaCorrente);
    System.out.println(calculadorDeImposto.getTotalImposto());
  }
}
