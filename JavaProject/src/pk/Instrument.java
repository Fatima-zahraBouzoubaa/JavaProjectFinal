package pk;

import java.util.Date;
import java.util.Objects;

public class Instrument implements Cloneable,Comparable<Instrument>{
	private String numSerie;
	private String nom, couleur, origine;
	private String dateDeCreation;
	private double prix;
	public Instrument(String numSerie, String nom, String couleur, String origine, String dateDeCreation,double prix) {
		super();
		this.numSerie = numSerie;
		this.nom = nom;
		this.couleur = couleur;
		this.origine = origine;
		this.dateDeCreation = dateDeCreation;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" numSerie=" + numSerie + ", nom=" + nom + ", couleur=" + couleur + ", origine=" + origine
				+ ", dateDeCreation=" + dateDeCreation +", prix = "+ prix;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrument other = (Instrument) obj;
		return Objects.equals(numSerie, other.numSerie);
	}
	@Override
	protected Instrument clone()  {
		try {
			return(Instrument) super.clone();}
		catch(CloneNotSupportedException i) {
				System.err.println("Erreur de clonage");
				return null;
			}
		
		
	}
	@Override
	public int compareTo(Instrument o) {
		return this.numSerie.compareTo(o.numSerie);
	}

	
}