public class SistemaInterno {

  private int senha = 111;

  public void autentica(Autenticavel funcionario) {
    boolean estaAutenticado = funcionario.autentica(this.senha);

    if (estaAutenticado) {
      System.out.println("Usuário autenticado");
    } else {
      System.out.println("Não foi possível autenticar");
    }
  }
}
