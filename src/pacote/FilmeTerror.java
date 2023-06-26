package pacote;

public class FilmeTerror extends Filme{
	
	public FilmeTerror(String titulo, String diretor, int anoLancamento, String sinopse, boolean disponivel) {
		super(titulo, diretor, anoLancamento, sinopse, disponivel);
	}
	
	//Polimorfismo
	public String getTipo(){
		return "Terror";
	}
	
}
