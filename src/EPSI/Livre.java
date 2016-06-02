package EPSI;


/**
 * 
 * Signoret Pierre-Louis
 * 
 * Rapels perso
 * 
 * int est toujours init à 0
 * float est toujours init à 0,0
 * string est toujours init à "init"
 * constante se declare par le keyword "final"
 * toujours passer par accésseurs
 * 
 */


public class Livre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		/*Livre livre1 = new Livre("Maxime Chatam","Leviatemps");
		Livre livre2 = new Livre("Maxime","Liberté");
		
		System.out.println("\n Dans le TP précédent vous avez créé deux livres \n ");
		System.out.println("\n Nous allons maintenant renseigner le nombres de pages de ces livres \n ");
		
		livre1.setNbPages(Console.readInt("Entrez le nombres de pages : \n"));		
		
		System.out.println("Le deuxieme livre à présent : \n");
		
		livre2.setNbPages(Console.readInt("Entrez le nombre de pages du livre : \n"));
		
		System.out.println("Voici le nombre de pages de vos deux livres : " + livre1.getNB_pages() + " et " + livre2.getNB_pages() + " ce qui fait un total de " + CalculNbPages(livre1.getNB_pages(),livre2.getNB_pages()) + "\n");
		
		*/
	}
	
	public Livre(String auteur , String titre)
	{
		this.Auteur = auteur;
		this.Titre = titre;
		this.NbPages = 0;
	}
	
	public static int CalculNbPages(int Nb_Pages_L1, int Nb_Pages_L2)
	{
		int NbPagesTotal = 0;
		
		NbPagesTotal = Nb_Pages_L1 + Nb_Pages_L2;
		
		return NbPagesTotal;
	}
	
	
	public String getAuteur()
	{
		return this.Auteur;
	}
	public int getNB_pages()
	{
		return this.NbPages;	
	}
	public String getTitre()
	{
		return this.Titre;
	}
	
	
	
	public void setNbPages(int nombres_pages)
	{
		if (nombres_pages <=0)
		{
			System.out.println("Erreur : nombres de pages insuffisant ou négatif");	
			this.NbPages = nombres_pages;
		}
		else
		{
			this.NbPages = nombres_pages;
		}
	}
	public void setTitre(String titre)
	{
		this.Titre = titre;
	}
	public void setAuteur(String auteur)
	{
		this.Auteur = auteur;
	}
	
	
	private String Auteur;
	private String Titre;
	private int NbPages;

}
