package pacote;

abstract class Filme {
	private String titulo;
	private String diretor;
	private int anoLancamento;
	private String sinopse;
	private boolean disponivel;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Filme(String titulo, String diretor, int anoLancamento, String sinopse, boolean disponivel) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
		this.sinopse = sinopse;
		this.disponivel = disponivel;
	}
	
	public abstract String getTipo();

	
	
	
}
