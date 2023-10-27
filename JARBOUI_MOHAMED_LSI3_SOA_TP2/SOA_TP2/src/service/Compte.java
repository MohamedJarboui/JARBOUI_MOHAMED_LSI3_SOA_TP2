package service;
import java.util.Date;
public class Compte {
private static int nb=0;
private int code;
private Date DateCreation;
private double solde;
public Compte(Date DateCraetion,double solde) {
	this.code=nb;
	this.DateCreation=DateCraetion;
	this.solde=solde;
	nb++;

}
public void setDateCreation(Date date) {
	this.DateCreation=date;
	
}
public void setSolde(double solde) {
	this.solde=solde;
	
}
public int getCode() {
	return code;
}
public Date getDateCreation() {
	return DateCreation;
}
public double getSolde() {
	return solde;
}
public String toString() {
	return "le code de compte est : "+code+" le date de creation et: "+DateCreation+" le solde du compte est : "+solde;
}

}
