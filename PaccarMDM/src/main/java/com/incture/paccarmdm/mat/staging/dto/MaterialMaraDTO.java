package com.incture.paccarmdm.mat.staging.dto;

import java.math.BigDecimal;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MaterialMaraDTO {

	private static final long serialVersionUID = 1L;

	private Integer materialId;

	private String materialNumber;

	private String materialSource;

	private String materialDecsription;

	private String materialType;

	private String materialBaseUnitOfMeasure;

	private String materialGroup;

	private BigDecimal materialGrossWeight;

	private BigDecimal materialNetWeight;

	private String materialWeightUnit;

	private BigDecimal materialLength;

	private BigDecimal materialWidth;

	private BigDecimal materialHeight;

	private String materialUnitOfDimension;

	private String dfAtClientLevel;

	private String orderUnit;

	private String productionOrInspectionMemo;

	private String industryStandardDescription;

	private String labOrOffice;

	private BigDecimal materialVolume;

	private String materialVolumeUnit;

	private Boolean hazardousMaterial;

	private String materialFreightGroup;
	
	private String materialCreatedBy;
	
	private String materialCreateDate;
	
	private String languageCode;
	
	private String corePart;
	
	private String material;

	public Integer getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

	public String getMaterialNumber() {
		return materialNumber;
	}

	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}

	public String getMaterialSource() {
		return materialSource;
	}

	public void setMaterialSource(String materialSource) {
		this.materialSource = materialSource;
	}

	public String getMaterialDecsription() {
		return materialDecsription;
	}

	public void setMaterialDecsription(String materialDecsription) {
		this.materialDecsription = materialDecsription;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getMaterialBaseUnitOfMeasure() {
		return materialBaseUnitOfMeasure;
	}

	public void setMaterialBaseUnitOfMeasure(String materialBaseUnitOfMeasure) {
		this.materialBaseUnitOfMeasure = materialBaseUnitOfMeasure;
	}

	public String getMaterialGroup() {
		return materialGroup;
	}

	public void setMaterialGroup(String materialGroup) {
		this.materialGroup = materialGroup;
	}

	public BigDecimal getMaterialGrossWeight() {
		return materialGrossWeight;
	}

	public void setMaterialGrossWeight(BigDecimal materialGrossWeight) {
		this.materialGrossWeight = materialGrossWeight;
	}

	public BigDecimal getMaterialNetWeight() {
		return materialNetWeight;
	}

	public void setMaterialNetWeight(BigDecimal materialNetWeight) {
		this.materialNetWeight = materialNetWeight;
	}

	public String getMaterialWeightUnit() {
		return materialWeightUnit;
	}

	public void setMaterialWeightUnit(String materialWeightUnit) {
		this.materialWeightUnit = materialWeightUnit;
	}

	public BigDecimal getMaterialLength() {
		return materialLength;
	}

	public void setMaterialLength(BigDecimal materialLength) {
		this.materialLength = materialLength;
	}

	public BigDecimal getMaterialWidth() {
		return materialWidth;
	}

	public void setMaterialWidth(BigDecimal materialWidth) {
		this.materialWidth = materialWidth;
	}

	public BigDecimal getMaterialHeight() {
		return materialHeight;
	}

	public void setMaterialHeight(BigDecimal materialHeight) {
		this.materialHeight = materialHeight;
	}

	public String getMaterialUnitOfDimension() {
		return materialUnitOfDimension;
	}

	public void setMaterialUnitOfDimension(String materialUnitOfDimension) {
		this.materialUnitOfDimension = materialUnitOfDimension;
	}

	public String getDfAtClientLevel() {
		return dfAtClientLevel;
	}

	public void setDfAtClientLevel(String dfAtClientLevel) {
		this.dfAtClientLevel = dfAtClientLevel;
	}

	public String getOrderUnit() {
		return orderUnit;
	}

	public void setOrderUnit(String orderUnit) {
		this.orderUnit = orderUnit;
	}

	public String getProductionOrInspectionMemo() {
		return productionOrInspectionMemo;
	}

	public void setProductionOrInspectionMemo(String productionOrInspectionMemo) {
		this.productionOrInspectionMemo = productionOrInspectionMemo;
	}

	public String getIndustryStandardDescription() {
		return industryStandardDescription;
	}

	public void setIndustryStandardDescription(String industryStandardDescription) {
		this.industryStandardDescription = industryStandardDescription;
	}

	public String getLabOrOffice() {
		return labOrOffice;
	}

	public void setLabOrOffice(String labOrOffice) {
		this.labOrOffice = labOrOffice;
	}

	public BigDecimal getMaterialVolume() {
		return materialVolume;
	}

	public void setMaterialVolume(BigDecimal materialVolume) {
		this.materialVolume = materialVolume;
	}

	public String getMaterialVolumeUnit() {
		return materialVolumeUnit;
	}

	public void setMaterialVolumeUnit(String materialVolumeUnit) {
		this.materialVolumeUnit = materialVolumeUnit;
	}

	public Boolean getHazardousMaterial() {
		return hazardousMaterial;
	}

	public void setHazardousMaterial(Boolean hazardousMaterial) {
		this.hazardousMaterial = hazardousMaterial;
	}

	public String getMaterialFreightGroup() {
		return materialFreightGroup;
	}

	public void setMaterialFreightGroup(String materialFreightGroup) {
		this.materialFreightGroup = materialFreightGroup;
	}

	public String getMaterialCreatedBy() {
		return materialCreatedBy;
	}

	public void setMaterialCreatedBy(String materialCreatedBy) {
		this.materialCreatedBy = materialCreatedBy;
	}

	public String getMaterialCreateDate() {
		return materialCreateDate;
	}

	public void setMaterialCreateDate(String materialCreateDate) {
		this.materialCreateDate = materialCreateDate;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getCorePart() {
		return corePart;
	}

	public void setCorePart(String corePart) {
		this.corePart = corePart;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}