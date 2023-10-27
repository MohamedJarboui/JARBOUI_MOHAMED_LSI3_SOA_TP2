package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class BanqueService {
	List<Compte> comptes = new ArrayList<Compte>();
	
public Compte getCompte(double montant) {
    return new Compte(new Date(), montant);
    
}
public List<Compte> getComptes(){
    Compte c1 = getCompte(0);
    Compte c2 = getCompte(1);
    comptes.add(c1);
    comptes.add(c2);
    return comptes;
}
	public double conversion(double montant) {
		return montant*3.5;
	}

}
