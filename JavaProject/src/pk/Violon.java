package pk;

import java.util.Date;
import java.util.Objects;

public class Violon extends Instrument {
	

	private double lgrArchet ;
	private int nbrCordes;
	private String typeBois;
	private String typeCorde;

	public Violon(String numSerie, String nom, String couleur, String origine, String dateDeCreation, double prix,
			double lgrArchet, int nbrCordes, String typeBois, String typeCorde) {
		super(numSerie, nom, couleur, origine, dateDeCreation, prix);
		this.lgrArchet = lgrArchet;
		this.nbrCordes = nbrCordes;
		this.typeBois=typeBois;
		this.typeCorde=typeCorde;
	}

	@Override
	public String toString() {
		return super.toString() + "Violon : lgrArchet=" + lgrArchet + ", nbrCordes=" + nbrCordes + ", typeBois=" + typeBois + ", typeCorde="
				+ typeCorde ;
	}

	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj))
			return false;
		else {
		Violon other = (Violon) obj;
		return Double.doubleToLongBits(lgrArchet) == Double.doubleToLongBits(other.lgrArchet)
				&& nbrCordes == other.nbrCordes && Objects.equals(typeBois, other.typeBois)
				&& Objects.equals(typeCorde, other.typeCorde);}
	}

	@Override
	protected Violon clone() {
		// TODO Auto-generated method stub
		return (Violon) super.clone();
	}

	@Override
	public int compareTo(Instrument o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}

	
	
	


}