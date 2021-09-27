package Istanze;

import interfacce.Figura;

public class Rettangolo implements Figura{

	private float base;
	float altezza;
	
	// costruire il rettangolo
	public Rettangolo(float base,float altezza) {
		// TODO Auto-generated constructor stub
		
		this.altezza=altezza;
		this.base=base;
	}
	

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	
	
	public float getPerimetroRettangolo() {
		return ((getBase() + getAltezza())*2);
	}
	public float getAreaRettangolo() {
		return (getBase()*getAltezza());
	}
	
	public void Stampa() {
		System.out.println("il perimetro del rettangolo di base:"+ getBase()+ "e altezza: " +getAltezza()+ "è:" +getPerimetroRettangolo());
		System.out.println("l'area del rettangolo si calcola con la formula della base * altezza: " + getAreaRettangolo());
	}


	@Override
	public float CalcolArea() {
		// TODO Auto-generated method stub
		return getAreaRettangolo();
	}


	@Override
	public void NaturFigura() {
		// TODO Auto-generated method stub

	}

	
	
}
