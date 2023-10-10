package com.jihen.produits;

import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jihen.produits.entities.Categorie;
import com.jihen.produits.entities.produit;
import com.jihen.produits.repos.ProduitRepository;



@SpringBootTest
class ProduitsApplicationTests {
	@Autowired
	private ProduitRepository produitRepository;


	@Test
	void testCreateProduit() {
		produit prod = new produit("PC Dell",2500.500,new Date());
		produitRepository.save(prod);

	}
	
	@Test
	public void testFindProduit()
	{
	produit p = produitRepository.findById(5L).get();
	System.out.println(p);
	}

	
	@Test
	public void testUpdateProduit()
	{
	produit p = produitRepository.findById(4L).get();
	p.setPrixProduit(9000.0);
	produitRepository.save(p);
	}
	
	
	@Test
	public void testDeleteProduit()
	{
	produitRepository.deleteById(7L);;
	}

	
	@Test
	public void testListerTousProduits()
	{
	List<produit> prods = produitRepository.findAll();
	for (produit p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomProduit()
	{
	List<produit> prods = produitRepository.findByNomProduit("PC Asus");
	for (produit p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomProduitContains()
	{
	List<produit> prods=produitRepository.findByNomProduitContains("PC");
	for (produit p : prods)
	{
	System.out.println(p);
	} }
	
	
		@Test
		public void testfindByNomPrix()
		{
		List<produit> prods = produitRepository.findByNomPrix("PC Asus", 1500.5);
		for (produit p : prods)
		{
		System.out.println(p);
		}
		}
		
		@Test
		public void testfindByCategorie()
		{
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<produit> prods = produitRepository.findByCategorie(cat);
		for (produit p : prods)
		{
		System.out.println(p);
		}
		}
		
		
		@Test
		public void findByCategorieIdCat()
		{
		List<produit> prods = produitRepository.findByCategorieIdCat(1L);
		for (produit p : prods)
		{
		System.out.println(p);
		}
		 }
		
		
		@Test
		public void testfindByOrderByNomProduitAsc()
		{
		List<produit> prods =
		produitRepository.findByOrderByNomProduitAsc();
		for (produit p : prods)
		{
		System.out.println(p);
		}
		}
		

		@Test
		public void testTrierProduitsNomsPrix()
		{
		List<produit> prods = produitRepository.trierProduitsNomsPrix();
		for (produit p : prods)
		{
		System.out.println(p);
		}
		}





	

}
