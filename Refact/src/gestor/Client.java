package gestor;

import java.util.ArrayList;

public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private ArrayList<Lloguer> lloguers;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }
    public String informe() {
    	return composaCapsalera() +
    	           composaDetall() +
    	           composaPeu();
    }
    public double importTotal() {
    	double total = 0;
    	for (Lloguer lloguer: lloguers) {
    		total += lloguer.quantitat() * 30;
    	}
    	return total;
    }
    public int bonificacionsTotals() {
    	int bonificacions = 0;
    	for (Lloguer lloguer: lloguers) {
    		bonificacions += lloguer.bonificacions();
    	}
    	return bonificacions;
    }
    public String composaCapsalera() {
    	String resultat = "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";
    	return resultat;
    }
    public String composaDetall() {
    	String resultat="";
    	for (Lloguer lloguer: lloguers) {        	
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (lloguer.quantitat() * 30) + "�" + "\n";
        }
    	return resultat;
    }
    public String composaPeu() {
    	String resultat ="";
    	resultat += "Import a pagar: " + importTotal() + "�\n" +
                "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultat;
    }
}