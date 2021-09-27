package CalcoloAreeFigure;


//import interfacce.AreeFigure;

public abstract  class Figure implements AreeFigure {

	
	float base;
	float altezza;
	
	// costruire il rettangolo
	public Figure(float base,float altezza) {
		// TODO Auto-generated constructor stub
		
		this.altezza=altezza;
		this.base=base;
	}
	
	// costruire il quadrato
	public Figure(float base) {
		// TODO Auto-generated constructor 
		this.base=base;
		this.altezza=altezza;
	}
	
	public Figure() {
		
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

	
	
	
}
