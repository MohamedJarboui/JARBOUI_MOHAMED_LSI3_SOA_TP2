package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		List<Compte>tab=new ArrayList<Compte>();
		BanqueService Bank =new BanqueService();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("donner un Montant EURO:\n");
		double TND =scan.nextDouble();
		System.out.println("le montant avant le conversion ="+Bank.conversion(TND)+" TND");
		Compte c1=Bank.getCompte(0.0);
		Compte c2=Bank.getCompte(100.1);
		Compte c3=Bank.getCompte(55.147);
		tab=Bank.getComptes();
		for(Compte compte :tab) {
			System.out.println(compte);
		}
		
		
		
		
	
		

	}

}
