public class Administrador extends Funcionario implements Autenticavel {

  private AutenticadorUtil autenticadorUtil;

  public Administrador(String nome, String cpf, double salario) {
    super(nome, cpf, salario);
    this.autenticadorUtil = new AutenticadorUtil();
  }

  @Override
  public void setSenha(int senha) {
    this.autenticadorUtil.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticadorUtil.autentica(senha);
  }

  @Override
  public double getBonificacao() {
    return 0;
  }
}
