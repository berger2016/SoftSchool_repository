	************************************
*****  	Description de l'application:   	*****
	************************************

SoftSchool est une plate-forme de gestion de contenu qui permet de suivre des programme de formation classique en ligne.
Des apprenants peuvent s'inscrire dans une classe, par exemple La classe de Terminale C, et y suivre tout le programme de cette classe, et meme s'evaluer.
Elle(La plate-forme) des programmes de preparation aux differents concours et examens. 
Les differents acteurs de cette plate-forme sont:
	- Les apprenants: Ils viennent dans la plate-forme pour suivre une formation de leur choix.
	- Les fournisseurs de contenu: Ils viennent dans la plate-forme pour l'enrichir un contenu, en fonction de leur domaine de competense.
	- Les enseignants: Ils viennent dans la plate-forme pour suivre les apprenant(TD ou discussion en video conference), ou pour diffuser des documents relatifs a 
		leurs activites.
	- Les validateur de contenu: Ils viennent dans la plate-forme pour apprecier et valider la pertinence des contenu proposes par les fournisseurs de contenu, afin de 
	   les rendre visible par les apprenants.
	- Les administrateurs: Ils viennent dans la plate-forme pour surveiller l'action des autre acteurs, et gerer les les utilisateurs et leurs droits d'acces au systeme et a ses ressources.
	- L'essentiel des objets manipules ici sont des contenu en tout genre(documents, video, audio, etc).

NB: - Cette description n'est pas exshaustive, elle s'ameliorera donc a mesure que les ides se tasseront.
    - Pour le moment, seule les fonctionnalites suivante ont ete implementes.
	* enregistrerApprenant
	* enregistrerEnseignant
	* enregistrerContenu
	* afficherDetailsApprenant
	* afficherDetailsEnseignants
	* afficherDetailsContenu
	Ces implementations ne sont qu'a titre illustratif, mais elles seront amelioree a mesure que l'on avancera dans la formation.


	************************************
*****  	     Pr�-requis avant execution		*****
	************************************
Installer un jdk ou au moins un jre sur son ordinateur.
Pour l'installation merci de suivre les �tapes suivantes:

	-Rendez-vous sur la partie Java du site d�Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite �software downloads�, cliquez sur le lien �Java SE� (pour Java Standard Edition)
	-Cliquez sur l�ic�ne �Java� pour t�l�charger le JDK
	-Accepter la licence
	-De pr�f�rence choisir la version la plus r�cente (derni�re sur la liste)
		-si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
		-si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
		-la version 32 bit fonctionne sur un Syst�me Windows 32 bit ou 64 bit.
	-Cliquez sur le bouton �Enregistrer le fichier�. Le t�l�chargement commence
	-Double cliquez sur le fichier t�l�charg�. L�assistant d�installation du JDK se lance
	-Cliquez sur le bouton �Next� des fen�tre qui vont s'afficher
	-Au moment d�installer un environnement d�ex�cution ind�pendant du JDK, l�assistant vous consulte. Acceptez les options par d�faut et cliquez sur Next
	-Ainsi m�me si vous supprimez par la suite le r�pertoire d�installation du JDK (qui contient aussi une JRE), vous pourrez tout de m�me ex�cuter des programmes Java sur votre ordinateur
	-Vous arrivez � l��cran de fin d�installation, qui vous pr�cise que l�installation s�est bien d�roul�e 
	-Cliquez sur Close: L�installation du JDK est termin�e. 

	************************************
*****  		Version du jdk utili�		  	*****
	************************************
java version "1.8.0_73"
Java(TM) SE Runtime Environment (build 1.8.0_73-b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)



	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'Livraison1\doc'.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:
	
1) 	A l'aide de votre interpretteur de commande (cmd.exe/ windows powershell),
	placer vous dans le dossier o� vous avez t�l�charg�
	le fichier compress� "GestionPatients.jar"
	('cd [chemin]/[dossier cible]').

	NB: - preferer windows powershell a cmd car le rendu n'est pas tres fidel pour ce dernier.
	    - Ou alors aller dans les proprietes de cmd, et modifier les parametres suivant:

		POUR LA MEMOIRE TAMPON
		* hauteur: 150
		* largeur: 3000

		POUR LA TAILLE DE LA FENETRE
		* 8x12
		
		POUR LA POLICE
		* raster

2)	Entrer la commande 'java -jar GestionPatients.jar'.