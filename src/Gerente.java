public class Gerente extends Funcionario implements Autenticavel {

  private AutenticadorUtil autenticadorUtil;

  public Gerente(String nome, String cpf, double salario) {
    super(nome, cpf, salario);
    this.autenticadorUtil = new AutenticadorUtil();
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticadorUtil.autentica(senha);
  }

  @Override
  public void setSenha(int senha) {
    this.autenticadorUtil.setSenha(senha);
  }

  public double getBonificacao() {
    int bonificacao = 1000;
    return super.getSalario() + bonificacao;
  }
}
