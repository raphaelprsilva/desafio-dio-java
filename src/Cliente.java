public class Cliente implements Autenticavel {
  private String nome;
  private String cpf;
  private String profissao;
  private AutenticadorUtil autenticadorUtil;

  public Cliente(String nome, String cpf, String profissao) {
    this.nome = nome;
    this.cpf = cpf;
    this.profissao = profissao;
    this.autenticadorUtil = new AutenticadorUtil();
  }

  public String getNome() {
    return this.nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getProfissao() {
    return this.profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  @Override
  public void setSenha(int senha) {
    this.autenticadorUtil.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticadorUtil.autentica(senha);
  }
}