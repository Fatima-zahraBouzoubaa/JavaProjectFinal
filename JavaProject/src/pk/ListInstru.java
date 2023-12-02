package pk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInstru extends Instrument{
	public ListInstru( String numSerie, String nom, String couleur, String origine, String dateDeCreation, double prix) {
		super(numSerie, nom, couleur, origine, dateDeCreation, prix);
		// TODO Auto-generated constructor stub
	}

	private List<Instrument> listeInstruments = new ArrayList<>();
    public void alimenterListe() {
        listeInstruments.add(new Instrument("A01", "Instru1", "Blanc", "Maroc", "2021", 64213.8));
        listeInstruments.add(new Instrument("A02", "Instru2", "Bleu", "Maroc", "2021", 64215.8));
        
    }
    public void afficherListe() {
        for (Instrument instrument : listeInstruments) {
            System.out.println(instrument);
        }
    }
    public void parcourirListe() {
        Iterator<Instrument> iterator = listeInstruments.iterator();
        while (iterator.hasNext()) {
            Instrument instrument = iterator.next();
            System.out.println(instrument);
        }
    }
    public void insererElement(Instrument nouvelInstrument, int index) {
        listeInstruments.add(index, nouvelInstrument);
    }
    public Instrument recupererElement(int index) {
        return listeInstruments.get(index);
    }
    public void supprimerElement(Instrument instrSup) {
        listeInstruments.remove(instrSup);
    }
    public boolean rechercherElement(Instrument instrumentRecherche) {
        return listeInstruments.contains(instrumentRecherche);
    }
    public void trierListe() {
        Collections.sort(listeInstruments);
    }
    public List<Instrument> copierListe() {
        return new ArrayList<>(listeInstruments);
    }
    public void melangerListe() {
        Collections.shuffle(listeInstruments);
    }
    public void inverserListe() {
        Collections.reverse(listeInstruments);
    }
    public List<Instrument> extrairePartieListe(int debut, int fin) {
        return listeInstruments.subList(debut, fin);
    }
    public boolean comparerListes(List<Instrument> autreListe) {
        return listeInstruments.equals(autreListe);
    }
    public void echangerElements(int index1, int index2) {
        Collections.swap(listeInstruments, index1, index2);
    }
    public void viderListe() {
        listeInstruments.clear();
    }
    public boolean estListeVide() {
        return listeInstruments.isEmpty();
    }

}