/**
 * 
 */
package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de definir les propretes et methodes specifique a un Apprenant.
 * @version 1.0 
 */
public class Apprenant extends Utilisateur{

	private String niveau;
	private String langue;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param code
	 * @param telephone
	 * @param email
	 * @param niveau
	 * @param langue
	 */
	public Apprenant(String nom, String prenom, String code, String telephone, String email, String niveau, String langue) {
		super(nom, prenom, code, telephone, email);
		this.niveau = niveau;
		this.langue = langue;
	}
	/**
	 * @return la valeure de la propriete niveau
	 */
	public String getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau c'est la valeure de la propriete niveau a modifier
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	/**
	 * @return la valeure de la propriete langue
	 */
	public String getLangue() {
		return langue;
	}
	/**
	 * @param langue c'est la valeure de la propriete langue a modifier
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Description: Permet d'imprimer l'etat de notre objet
	 */
	@Override
	public String toString() {
		return "Apprenant "
				+ "[niveau=" + niveau + ",\n"
				+ "\t \t langue=" + langue + ", \n"
				+ "\t \t nom=" + nom + ", \n"
				+ "\t \t prenom=" + prenom + ", \n"
				+ "\t \t code="+ code + ", \n"
				+ "\t \t telephone=" + telephone + ", \n"
				+ "\t \t email=" + email + "]";
	}
	
	
}
