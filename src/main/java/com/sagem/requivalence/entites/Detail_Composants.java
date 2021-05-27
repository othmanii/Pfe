package com.sagem.requivalence.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity



public class Detail_Composants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long Id;
	public String AGS;
	public String TypeArticle;
	public String DesignationEquivaent;
	public String Division;
	public String Gestionnaire;
	public String StockTotal;
	public String UniteDeQuantite;
	public String NarticleNpieceFabricant;
	public String DesignationArticle;
	public String NPFB;
	public String Fabricant;
	public String PrfPF;
	public String FinValidite;
	public String Blq;
	public String NiveauSecuriteAGS;
	public String NiveauSecuritePart;
	public String ROHS_AGS;
	public String ROHS_PART;
	public String Terminaison_Avec_Sans_Plomb;
	public String Compatibilite_Process_Plomb;
	public String Type_finition;
	public String Pic_temperature;
	public String Duree_pic;
	public String Niveau_MSL;
	public String Temperature_niveauMSL;
	public String Type_conditionnement;
	public String Qteconditionnement;
	public String LargeurConditionnement;
	


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getAGS() {
		return AGS;
	}

	public void setAGS(String aGS) {
		AGS = aGS;
	}

	public String getTypeArticle() {
		return TypeArticle;
	}

	public void setTypeArticle(String typeArticle) {
		TypeArticle = typeArticle;
	}

	public String getDesignationEquivaent() {
		return DesignationEquivaent;
	}

	public void setDesignationEquivaent(String designationEquivaent) {
		DesignationEquivaent = designationEquivaent;
	}

	public String getDivision() {
		return Division;
	}

	public void setDivision(String division) {
		Division = division;
	}

	public String getGestionnaire() {
		return Gestionnaire;
	}

	public void setGestionnaire(String gestionnaire) {
		Gestionnaire = gestionnaire;
	}

	public String getStockTotal() {
		return StockTotal;
	}

	public void setStockTotal(String stockTotal) {
		StockTotal = stockTotal;
	}

	public String getUniteDeQuantite() {
		return UniteDeQuantite;
	}

	public void setUniteDeQuantite(String uniteDeQuantite) {
		UniteDeQuantite = uniteDeQuantite;
	}

	public String getNarticleNpieceFabricant() {
		return NarticleNpieceFabricant;
	}

	public void setNarticleNpieceFabricant(String narticleNpieceFabricant) {
		NarticleNpieceFabricant = narticleNpieceFabricant;
	}

	public String getDesignationArticle() {
		return DesignationArticle;
	}

	public void setDesignationArticle(String designationArticle) {
		DesignationArticle = designationArticle;
	}

	public String getNPFB() {
		return NPFB;
	}

	public void setNPFB(String nPFB) {
		NPFB = nPFB;
	}

	public String getFabricant() {
		return Fabricant;
	}

	public void setFabricant(String fabricant) {
		Fabricant = fabricant;
	}

	public String getPrfPF() {
		return PrfPF;
	}

	public void setPrfPF(String prfPF) {
		PrfPF = prfPF;
	}

	public String getFinValidite() {
		return FinValidite;
	}

	public void setFinValidite(String finValidite) {
		FinValidite = finValidite;
	}

	public String getBlq() {
		return Blq;
	}

	public void setBlq(String blq) {
		Blq = blq;
	}

	public String getNiveauSecuriteAGS() {
		return NiveauSecuriteAGS;
	}

	public void setNiveauSecuriteAGS(String niveauSecuriteAGS) {
		NiveauSecuriteAGS = niveauSecuriteAGS;
	}

	public String getNiveauSecuritePart() {
		return NiveauSecuritePart;
	}

	public void setNiveauSecuritePart(String niveauSecuritePart) {
		NiveauSecuritePart = niveauSecuritePart;
	}

	public String getROHS_AGS() {
		return ROHS_AGS;
	}

	public void setROHS_AGS(String rOHS_AGS) {
		ROHS_AGS = rOHS_AGS;
	}

	public String getROHS_PART() {
		return ROHS_PART;
	}

	public void setROHS_PART(String rOHS_PART) {
		ROHS_PART = rOHS_PART;
	}

	public String getTerminaison_Avec_Sans_Plomb() {
		return Terminaison_Avec_Sans_Plomb;
	}

	public void setTerminaison_Avec_Sans_Plomb(String terminaison_Avec_Sans_Plomb) {
		Terminaison_Avec_Sans_Plomb = terminaison_Avec_Sans_Plomb;
	}

	public String getCompatibilite_Process_Plomb() {
		return Compatibilite_Process_Plomb;
	}

	public void setCompatibilite_Process_Plomb(String compatibilite_Process_Plomb) {
		Compatibilite_Process_Plomb = compatibilite_Process_Plomb;
	}

	public String getType_finition() {
		return Type_finition;
	}

	public void setType_finition(String type_finition) {
		Type_finition = type_finition;
	}

	public String getPic_temperature() {
		return Pic_temperature;
	}

	public void setPic_temperature(String pic_temperature) {
		Pic_temperature = pic_temperature;
	}

	public String getDuree_pic() {
		return Duree_pic;
	}

	public void setDuree_pic(String duree_pic) {
		Duree_pic = duree_pic;
	}

	public String getNiveau_MSL() {
		return Niveau_MSL;
	}

	public void setNiveau_MSL(String niveau_MSL) {
		Niveau_MSL = niveau_MSL;
	}

	public String getTemperature_niveauMSL() {
		return Temperature_niveauMSL;
	}

	public void setTemperature_niveauMSL(String temperature_niveauMSL) {
		Temperature_niveauMSL = temperature_niveauMSL;
	}

	public String getType_conditionnement() {
		return Type_conditionnement;
	}

	public void setType_conditionnement(String type_conditionnement) {
		Type_conditionnement = type_conditionnement;
	}

	public String getQteconditionnement() {
		return Qteconditionnement;
	}

	public void setQteconditionnement(String qteconditionnement) {
		Qteconditionnement = qteconditionnement;
	}

	public String getLargeurConditionnement() {
		return LargeurConditionnement;
	}

	public void setLargeurConditionnement(String largeurConditionnement) {
		LargeurConditionnement = largeurConditionnement;
	}

	public Detail_Composants(Long id, String aGS, String typeArticle, String designationEquivaent, String division,
			String gestionnaire, String stockTotal, String uniteDeQuantite, String narticleNpieceFabricant,
			String designationArticle, String nPFB, String fabricant, String prfPF, String finValidite, String blq,
			String niveauSecuriteAGS, String niveauSecuritePart, String rOHS_AGS, String rOHS_PART,
			String terminaison_Avec_Sans_Plomb, String compatibilite_Process_Plomb, String type_finition,
			String pic_temperature, String duree_pic, String niveau_MSL, String temperature_niveauMSL,
			String type_conditionnement, String qteconditionnement, String largeurConditionnement) {
		super();
		Id = id;
		AGS = aGS;
		TypeArticle = typeArticle;
		DesignationEquivaent = designationEquivaent;
		Division = division;
		Gestionnaire = gestionnaire;
		StockTotal = stockTotal;
		UniteDeQuantite = uniteDeQuantite;
		NarticleNpieceFabricant = narticleNpieceFabricant;
		DesignationArticle = designationArticle;
		NPFB = nPFB;
		Fabricant = fabricant;
		PrfPF = prfPF;
		FinValidite = finValidite;
		Blq = blq;
		NiveauSecuriteAGS = niveauSecuriteAGS;
		NiveauSecuritePart = niveauSecuritePart;
		ROHS_AGS = rOHS_AGS;
		ROHS_PART = rOHS_PART;
		Terminaison_Avec_Sans_Plomb = terminaison_Avec_Sans_Plomb;
		Compatibilite_Process_Plomb = compatibilite_Process_Plomb;
		Type_finition = type_finition;
		Pic_temperature = pic_temperature;
		Duree_pic = duree_pic;
		Niveau_MSL = niveau_MSL;
		Temperature_niveauMSL = temperature_niveauMSL;
		Type_conditionnement = type_conditionnement;
		Qteconditionnement = qteconditionnement;
		LargeurConditionnement = largeurConditionnement;
	}

	public Detail_Composants() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	 
}
