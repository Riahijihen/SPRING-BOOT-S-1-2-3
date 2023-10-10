package com.jihen.produits.services;

import java.util.List;

import com.jihen.produits.entities.Categorie;
import com.jihen.produits.entities.produit;

public interface ProduitService {
	produit saveProduit(produit p);
	produit updateProduit(produit p);
	void deleteProduit(produit p);
	 void deleteProduitById(Long id);
	produit getProduit(Long id);
	List<produit> getAllProduits();
	List<produit> findByNomProduit(String nom);
	List<produit> findByNomProduitContains(String nom);
	List<produit> findByNomPrix (String nom, Double prix);
	List<produit> findByCategorie (Categorie categorie);
	List<produit> findByCategorieIdCat(Long id);
	List<produit> findByOrderByNomProduitAsc();
	List<produit> trierProduitsNomsPrix();


}
