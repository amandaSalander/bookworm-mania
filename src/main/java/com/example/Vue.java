package com.example;


public class Vue {
	

	private String nom;
	private String urlLink;
	private String name;
	
	private String[] categorie;

	public Vue(String nom, String urlLink, String name, String[] categorie ){
		this.nom = nom;
		this.categorie = categorie;
		this.urlLink= urlLink;
		this.name=name;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String[] getCategorie() {
		return categorie;
	}

	public void setCategorie(String[] categorie) {
		this.categorie = categorie;
	}
	public String getUrlLink() {
		return urlLink;
	}
	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
