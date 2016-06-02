package Test;

import static org.junit.Assert.fail;
import org.junit.Assert.*;

import org.junit.Test;

import EPSI.Livre;

public class tester {

	@Test
	public final void testNbrPages() {
		Livre livretest1 = new Livre("Auteur 1", "Titre 1");
		livretest1.setNbPages(15);
		if(livretest1.getNB_pages()!=15){			
			fail("erreur de nombre de pages");
		}
	}
	@Test
	public final void testLivre(){
		try{
		Livre livretest = new Livre("auteur", "titre");
		}catch(Exception e){
			fail("erreur de création du livre");
		}
	}
	
	@Test
	public final void testAuteur(){
		Livre livretest = new Livre("auteur", "titre");
		if(!livretest.getAuteur().equals("auteur")){
			fail("erreur d'auteur du livre");
		}
	}
	@Test
	public final void testTitre(){
		Livre livretest = new Livre("auteur", "titre");
		if(!livretest.getTitre().equals("titre")){
			fail("erreur de titre du livre");
		}
	}
	@Test
	public final void testCalculPages(){
		Livre livretest1 = new Livre("auteur1", "titre1");
		Livre livretest2 = new Livre("auteur2", "titre2");
		livretest1.setNbPages(15);
		livretest2.setNbPages(20);
		if(Livre.CalculNbPages(livretest1.getNB_pages(), livretest2.getNB_pages())!= 35){
			fail("erreur de calcul du nbr de pages totales");
		}
	}
}
