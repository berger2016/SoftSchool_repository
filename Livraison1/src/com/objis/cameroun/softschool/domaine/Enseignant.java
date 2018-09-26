/**
 * 
 */
package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de definir les propretes et methodes specifique a un 'Enseignant'
 * @version 1.0 
 */
public class Enseignant extends Utilisateur {
	
	public String grade;
	public String specialite;
	public String langue;

	/**
	 * @param nom
	 * @param prenom
	 * @param code
	 * @param telephone
	 * @param email
	 * @param grade
	 * @param specialite
	 * @param langue
	 */
	public Enseignant(String nom, String prenom, String code, String telephone, String email,String grade,String specialite
			,String langue) {
		super(nom, prenom, code, telephone, email);
		this.grade = grade;
		this.specialite = specialite;
		this.langue = langue;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enseignant [grade=" + grade + ",\n"
				+ "\t \t specialite=" + specialite + ", \n"
				+ "\t \t langue=" + langue + ", \n"
				+ "\t \t nom=" + nom+ ", \n"
				+ "\t \t prenom=" + prenom + ",\n "
				+ "\t \t code=" + code + ", \n"
				+ "\t \t telephone=" + telephone + ",\n "
				+ "\t \t email=" + email + "]";
	}
	
}
