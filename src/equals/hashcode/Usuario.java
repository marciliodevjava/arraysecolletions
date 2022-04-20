package equals.hashcode;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {
//		jeito correto de se fazer
//		if (objeto instanceof Usuario) {
//			Usuario outro = (Usuario) objeto;
//			return super.equals(objeto);
//		}
//		return false;
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;
		} else {
			return false;
		}

	}
	public int hashCode() {
		return 0;
	}
}
