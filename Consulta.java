package construtores;

public class Consulta {

	private String nomeDents;
	private String data;
	private String nomePente;
	
	public Consulta(String nomeDents) {
		this.nomeDents = nomeDents;
	}
	public Consulta(String nomeDents, String data) {
		this.nomeDents = nomeDents;
		this.data = data;
	}
	public Consulta(String nomeDents, String data, String nomePente) {
		this.nomeDents = nomeDents;
		this.data = data;
		this.nomePente = nomePente;
		
	}
	public String getNomeDents() {
		return nomeDents;
	}
	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNomePente() {
		return nomePente;
	}
	public void setNomePente(String nomePente) {
		this.nomePente = nomePente;
	}
	
	

	}


