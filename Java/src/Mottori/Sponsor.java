package Mottori;

public class Sponsor {

	String nome;
	float ingaggio;
	public Sponsor(String nome,float ingaggio) {
		this.ingaggio=ingaggio;
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getIngaggio() {
		return ingaggio;
	}
	public void setIngaggio(float ingaggio) {
		this.ingaggio = ingaggio;
	}
}
