package com.incture.paccarmdm.mat.staging.dto;

public class MaterialMarcDTO {

	private static final long serialVersionUID = 1L;

	private Integer plantId;

	private String materialNumber;

	private String mrpController;

	private String mrpType;

	private Integer planningCycle;

	private Integer lotSize;

	private Character procurementType;

	public Integer getPlantId() {
		return plantId;
	}

	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}

	public String getMaterialNumber() {
		return materialNumber;
	}

	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}

	public String getMrpController() {
		return mrpController;
	}

	public void setMrpController(String mrpController) {
		this.mrpController = mrpController;
	}

	public String getMrpType() {
		return mrpType;
	}

	public void setMrpType(String mrpType) {
		this.mrpType = mrpType;
	}

	public Integer getPlanningCycle() {
		return planningCycle;
	}

	public void setPlanningCycle(Integer planningCycle) {
		this.planningCycle = planningCycle;
	}

	public Integer getLotSize() {
		return lotSize;
	}

	public void setLotSize(Integer lotSize) {
		this.lotSize = lotSize;
	}

	public Character getProcurementType() {
		return procurementType;
	}

	public void setProcurementType(Character procurementType) {
		this.procurementType = procurementType;
	}

	

}