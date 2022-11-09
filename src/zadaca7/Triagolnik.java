package zadaca7;

public class Triagolnik {
	public int strana;
	public int visina;
	public int perimetar;
	public float plostina;
	
	public Triagolnik() {
		
	}
	public Triagolnik (int strana, int visina){
		this.strana=strana;
		this.visina=visina;
		this.perimetar=3*strana;
		this.plostina=(float)0.5*strana*visina;
	}
}
