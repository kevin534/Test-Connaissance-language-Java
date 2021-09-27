package Istanze;

import interfacce.Figura;

public class Triangolo implements Figura{
	
	private float a,b,c;
	
	public Triangolo(float a, float b, float c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	// costruttore Triangolo Equilatero
	
	public Triangolo(float altezza) {
		
		this.a=altezza;
		this.b=altezza;
		this.c=altezza;
	}
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float getPerimetro() {
		return (getA() + getB() + getC());
	}
	//metodi
	public void TipoTriangolo() {
	
		if(isScaleno()) {
			System.out.println("il triangolo è scaleno");
		}
		else if(isIsosceli()) {
			System.out.println("il triangolo è isoscelo");
		}
		else if(isEquilatero()) {
			System.out.println("il triangolo è equilatero");
		}
		else {
			System.out.println("il triangolo è isoscelo");
		}
	}
	
	public float getAreaTriangolo() {
		return (getA()*getB()*getC());
	}
	
	private boolean isScaleno() {
		return (this.a != this.b && this.b != this.c && this.a != this.c);
	}
	private boolean isIsosceli() {
		return (this.a == this.b || this.b == this.c || this.a== this.c);
	}
	
	private boolean isEquilatero() {
		return (this.a == this.b && this.b == this.c);
		
		
	}

@Override
public float CalcolArea() {
	// TODO Auto-generated method stub
	return getAreaTriangolo();
}

@Override
public void Stampa() {
	// TODO Auto-generated method stub
	//System.out.println("il triangolo ha per lati " +getA() + " , " + getB() + " , " + getC());
	System.out.println("il triangolo ha perimetro uguale a: " + getPerimetro());
	//System.out.println("L'area del triangolo è uguale a: " + getAreaTriangolo());
}

@Override
public void NaturFigura() {
	// TODO Auto-generated method stub
	
	if(getA() == getB() && getB() == getC()) {
		System.out.println("il triangolo è Equilatero con valori a = "+ getA() + "  b = "+ getB() + "c = " + getC());
	}
	/*if(isEquilatero()) {
		return isEquilatero();
	}
	else if (isIsosceli()) {
		return isIsosceli();
	}
	else if(isScaleno()) {
		return isScaleno();
	}
	return false;
	*/
}


}
