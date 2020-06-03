package capitulos;

class Usuario implements Comparable{

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + "]";
	}

	private String nome;
	private int pontos;
	private boolean moderador;
	
	public Usuario(String nome, int pontos) {
		
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}

	public String getNome() {
		return nome;
	}

	
	public int getPontos() {
		return pontos;
	}

	
	public boolean isModerador() {
		return moderador;
	}

	public void tornaModerador() {
		this.moderador = true;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
