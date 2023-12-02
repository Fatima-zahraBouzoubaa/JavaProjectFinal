package pk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class TabInstrument {
	private Instrument[] instru= new Instrument[5]; 
		public TabInstrument(Instrument[] instru) {
		super();
		instru[0]= new Instrument("A01","Instru1","Blanc","Maroc","2021",64213.8);
		instru[1]= new Instrument("A02","Instru2","Bleu","Maroc","2021",64215.8);
		instru[2]= new Instrument("A03","Instru3","Rouge","France","2022",9977.8);
		instru[3]= new Instrument("A04","Instru4","Marron","Nigeria","2020",9865.0);
		
	}
	public void trier () {
		Arrays.sort(instru);	}
	public void ajouter(Instrument inst, int pos) {
		if (pos>=0 && pos<instru.length) {
			ArrayList<Instrument> liste =new ArrayList<Instrument>(Arrays.asList(instru));
			liste.add(pos,inst);
			instru = liste.toArray(new Instrument[liste.size()]);
		}
	
	}
	public void supprimer(Instrument inst) {
			
				ArrayList<Instrument> liste =new ArrayList<Instrument>(Arrays.asList(instru));
				if(liste.remove(inst)) {
				instru = liste.toArray(new Instrument[liste.size()]);
				System.out.println("Success");}	
	}
	
	//public int nbElements() {
		
		
	//}
		

}