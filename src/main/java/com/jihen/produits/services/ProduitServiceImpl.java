package com.jihen.produits.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jihen.produits.entities.Categorie;
import com.jihen.produits.entities.produit;
import com.jihen.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl  implements ProduitService{
	
	@Autowired
	ProduitRepository produitRepository;


	@Override
	public produit saveProduit(produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);

	}

	@Override
	public produit updateProduit(produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);

	}

	@Override
	public void deleteProduit(produit p) {
		// TODO Auto-generated method stub
		produitRepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
		
	}

	@Override
	public produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).get();

	}

	@Override
	public List<produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public List<produit> findByNomProduit(String nom) {
	return produitRepository.findByNomProduit(nom);
	}
	@Override
	public List<produit> findByNomProduitContains(String nom) {
	return produitRepository.findByNomProduitContains(nom);
	}
	@Override
	public List<produit> findByNomPrix(String nom, Double prix) {
	return produitRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<produit> findByCategorie(Categorie categorie) {
	return produitRepository.findByCategorie(categorie);
	}
	@Override
	public List<produit> findByCategorieIdCat(Long id) {
	return produitRepository.findByCategorieIdCat(id);
	}
	@Override
	public List<produit> findByOrderByNomProduitAsc() {
	return produitRepository.findByOrderByNomProduitAsc();
	}
	@Override
	public List<produit> trierProduitsNomsPrix() {
	return produitRepository.trierProduitsNomsPrix();
	}

}
