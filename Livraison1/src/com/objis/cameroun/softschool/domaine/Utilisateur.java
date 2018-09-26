/**
 * 
 */
package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de factoriser les proprietes et methodes communes aux classes 'Apprenant' et 'Enseignant'
 * @version 1.0 
 */
public class Utilisateur {
	
	protected String nom;
	protected String prenom;
	protected String code;
	protected String telephone;
	protected String email;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param code
	 * @param telephone
	 * @param email
	 */
	public Utilisateur(String nom, String prenom, String code, String telephone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.code = code;
		this.telephone = telephone;
		this.email = email;
	}
	/**
	 * @return la valeure de la propriete nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom c'est la valeure de la propriete nom a modifier
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return la valeure de la propriete prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom c'est la valeure de la propriete nom a modifier
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return la valeure de la propriete code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code c'est la valeure de la propriete code a modifier
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
