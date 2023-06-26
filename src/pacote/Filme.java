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

	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		builder.append("***********************\n");
		builder.append("Título: " + titulo + "\n");
		builder.append("Diretor: " + diretor + "\n");
		builder.append("Ano de Lançamento: " + anoLancamento + "\n");
		builder.append("Sinopse: " + sinopse + "\n");
		builder.append("Disponível? " + disponivel + "\n");
		builder.append("Tipo: " + getTipo() + "\n");
		builder.append("***********************");

		return builder.toString();
	}

}
