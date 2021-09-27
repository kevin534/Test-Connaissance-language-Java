package Istanze;

import interfacce.Figura;

public class Quadrato implements Figura {

	public float base;
	public Quadrato(float base) {
		// TODO Auto-generated constructor stub
		this.base=base;
				
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	
	public float getAreaQuadrato() {
		return (getBase()*getBase());
	}
	
	public float getPerimetroQuadrato() {
		return (getBase()*4);
	}
		
	public void Stampa() {
		System.out.println("il perimetro del quadrato di base * 4:"+ getPerimetroQuadrato());
		System.out.println("l'area del quadrato si calcola con la formula della base * base: " + getAreaQuadrato());
	}
	@Override
	public float CalcolArea() {
		// TODO Auto-generated method stub
		return getAreaQuadrato();
	}
	@Override
	public void NaturFigura() {
		// TODO Auto-generated method stub
		
	}


}
