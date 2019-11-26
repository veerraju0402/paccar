package com.incture.paccarmdm.mat.staging.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MATERIAL_PLANT_DESCRIPTION")
public class MaterialMarcDO implements Serializable{

	// common column(s) -- MAT_NO

	public static final long serialVersionUID = 5018420100965861106L;

	@Id
	@Column(name = "PLANT_ID", length = 5)
	private Integer plant_id;

	@Column(name = "MAT_NO", length = 10)
	private String material_number;

	@Column(name = "MRP_CONTROLLER", length = 10)
	private String mrp_controller;

	@Column(name = "MRP_TY", length = 20)
	private String mrp_type;

	@Column(name = "PLAN_CYCLE")
	private Integer planning_cycle;

	@Column(name = "LOT_SIZE")
	private Integer lot_size;

	@Column(name = "PRC_TY")
	private Character procurement_type;

	public Integer getPlant_id() {
		return plant_id;
	}

	public void setPlant_id(Integer plant_id) {
		this.plant_id = plant_id;
	}

	public String getMaterial_number() {
		return material_number;
	}

	public void setMaterial_number(String material_number) {
		this.material_number = material_number;
	}

	public String getMrp_controller() {
		return mrp_controller;
	}

	public void setMrp_controller(String mrp_controller) {
		this.mrp_controller = mrp_controller;
	}

	public String getMrp_type() {
		return mrp_type;
	}

	public void setMrp_type(String mrp_type) {
		this.mrp_type = mrp_type;
	}

	public Integer getPlanning_cycle() {
		return planning_cycle;
	}

	public void setPlanning_cycle(Integer planning_cycle) {
		this.planning_cycle = planning_cycle;
	}

	public Integer getLot_size() {
		return lot_size;
	}

	public void setLot_size(Integer lot_size) {
		this.lot_size = lot_size;
	}

	public Character getProcurement_type() {
		return procurement_type;
	}

	public void setProcurement_type(Character procurement_type) {
		this.procurement_type = procurement_type;
	}

	
}