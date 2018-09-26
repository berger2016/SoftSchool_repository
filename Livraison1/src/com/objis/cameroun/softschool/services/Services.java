package com.objis.cameroun.softschool.services;

import com.objis.cameroun.softschool.domaine.Apprenant;
import com.objis.cameroun.softschool.domaine.Contenue;
import com.objis.cameroun.softschool.domaine.Enseignant;
//import com.objis.cameroun.softschool.dao.*;//Le dao doit etre importe, meme-si nous ne l'utilisons pas encore.

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de definir les services offerts par notre application. Les implementations de ces
 * services iront en s'ameliorant a mesure que l'on avancera dans la decouverte des modules.
 * Pour le momment, nous ne faisont qu'afficher des messages a l'ecran.
 * On  ntera egalement que la liste des services n'est pas exhaustive. 
 * @version 1.0 
 */
public class Services {

	/**
	 * @param contenue
	 * Description: ce savoir-faire permet d'enregistrer le contenue passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public void enregistrerContenu(Contenue contenue) {

		System.out.println(">>>>" + contenue.toString() + " enregistre avec success");

	}

	/**
	 * @param apprenant
	 * Description: ce savoir-faire permet d'enregistrer l'apprenant passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 * 
	 */
	public void enregistrerApprenant(Apprenant apprenant) {

		System.out.println(">>>>" + apprenant.toString() + "enregistre avec success");
	}

	/**
	 * @param enseignant
	 * Description: ce savoir-faire permet d'enregistrer l'enseignant passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public void enregistrerEnseignant(Enseignant enseignant) {

		System.out.println(">>>>" + enseignant.toString() + " enregistre avec success");
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 * 
	 */
	public void afficheDetailsEnseignant() {

		System.out.println(">>>>Ce savoir-faire retourne les ddetails d'un enseignant");
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public void afficheDetailsContenu() {

		System.out.println(">>>>Ce savoir-faire retourne les ddetails d'un Contenu");
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public void afficheDetailsApprenant() {

		System.out.println(">>>>Ce savoir-faire retourne les details d'un Apprenant");
	}

}
