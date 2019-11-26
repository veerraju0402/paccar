package com.incture.paccarmdm.mat.staging.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "MATERIAL_DESCRIPTION")
public class MaterialMaraDO implements Serializable {

	public static final long serialVersionUID = 5018420100965861106L;

	// common column(s) - material number
	
	@Id
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	@Column(name = "MATERIAL_ID")
	private Integer materia_id;

	// unique number
	
	@Column(name = "MAT_NO", length = 10, unique = true)
	private String material_number;

	@Column(name = "MAT_SRC", length = 30)
	private String material_source;

	@Column(name = "MAT_DESC", length = 40)
	private String material_decsription;

	@Column(name = "MAT_TYP", length = 10)
	private String material_type;

	@Column(name = "MAT_BU_MES", length = 3)
	private String material_base_unit_of_measure;

	@Column(name = "MAT_GR", length = 10)
	private String material_group;

	@Column(name = "MAT_GR_WT", precision = 13, scale = 3)
	private BigDecimal material_gross_weight;

	@Column(name = "MAT_NR_WT", precision = 13, scale = 3)
	private BigDecimal material_net_weight;

	@Column(name = "MAT_WT_UT", length = 8)
	private String material_weight_unit;

	@Column(name = "MAT_LEN", precision = 13, scale = 3)
	private BigDecimal material_length;

	@Column(name = "MAT_WD", precision = 13, scale = 3)
	private BigDecimal material_width;

	@Column(name = "MAT_HT", precision = 13, scale = 3)
	private BigDecimal material_height;

	@Column(name = "MAT_UT_DIM", length = 3)
	private String material_unit_of_dimension;

	@Column(name = "DF_CLIENT_LVL", length = 2)
	private String df_at_client_level;

	@Column(name = "ORD_UNI", length = 3)
	private String order_unit;

	@Column(name = "PRD_INS_MEMO")
	private String production_or_inspection_memo;

	@Column(name = "INDUS_STD_DESC")
	private String industry_standard_description;

	@Column(name = "LAB_OFC", length = 3)
	private String lab_or_office;

	@Column(name = "MAT_VOL", precision = 13, scale = 2)
	private BigDecimal material_volume;

	@Column(name = "MAT_VOL_UT", length = 40)
	private String material_volume_unit;

	@Column(name = "HAZ_MAT")
	private Boolean hazardous_material;

	@Column(name = "MAT_FRG_GR", length = 15)
	private String material_freight_group;
	
	@Column(name = "MAT_CREATED_BY", length = 15)
	private String material_created_by; //login_id from userData table
	
	@Column(name = "MAT_CREATE_DATE", length = 15)
	@JsonFormat(pattern="yyyy-mm-dd hh:mm:ss")
	private String material_create_date;

	@Column(name = "LANG_CD", length = 2)
	private String language_code;
	
	@Column(name = "CORE_PART", length = 10)
	private String core_part;
	
	@Column(name = "MATERIAL", length = 20)
	private String material;

	public Integer getMateria_id() {
		return materia_id;
	}

	public void setMateria_id(Integer materia_id) {
		this.materia_id = materia_id;
	}

	public String getMaterial_number() {
		return material_number;
	}

	public void setMaterial_number(String material_number) {
		this.material_number = material_number;
	}

	public String getMaterial_source() {
		return material_source;
	}

	public void setMaterial_source(String material_source) {
		this.material_source = material_source;
	}

	public String getMaterial_decsription() {
		return material_decsription;
	}

	public void setMaterial_decsription(String material_decsription) {
		this.material_decsription = material_decsription;
	}

	public String getMaterial_type() {
		return material_type;
	}

	public void setMaterial_type(String material_type) {
		this.material_type = material_type;
	}

	public String getMaterial_base_unit_of_measure() {
		return material_base_unit_of_measure;
	}

	public void setMaterial_base_unit_of_measure(String material_base_unit_of_measure) {
		this.material_base_unit_of_measure = material_base_unit_of_measure;
	}

	public String getMaterial_group() {
		return material_group;
	}

	public void setMaterial_group(String material_group) {
		this.material_group = material_group;
	}

	public BigDecimal getMaterial_gross_weight() {
		return material_gross_weight;
	}

	public void setMaterial_gross_weight(BigDecimal material_gross_weight) {
		this.material_gross_weight = material_gross_weight;
	}

	public BigDecimal getMaterial_net_weight() {
		return material_net_weight;
	}

	public void setMaterial_net_weight(BigDecimal material_net_weight) {
		this.material_net_weight = material_net_weight;
	}

	public String getMaterial_weight_unit() {
		return material_weight_unit;
	}

	public void setMaterial_weight_unit(String material_weight_unit) {
		this.material_weight_unit = material_weight_unit;
	}

	public BigDecimal getMaterial_length() {
		return material_length;
	}

	public void setMaterial_length(BigDecimal material_length) {
		this.material_length = material_length;
	}

	public BigDecimal getMaterial_width() {
		return material_width;
	}

	public void setMaterial_width(BigDecimal material_width) {
		this.material_width = material_width;
	}

	public BigDecimal getMaterial_height() {
		return material_height;
	}

	public void setMaterial_height(BigDecimal material_height) {
		this.material_height = material_height;
	}

	public String getMaterial_unit_of_dimension() {
		return material_unit_of_dimension;
	}

	public void setMaterial_unit_of_dimension(String material_unit_of_dimension) {
		this.material_unit_of_dimension = material_unit_of_dimension;
	}

	public String getDf_at_client_level() {
		return df_at_client_level;
	}

	public void setDf_at_client_level(String df_at_client_level) {
		this.df_at_client_level = df_at_client_level;
	}

	public String getOrder_unit() {
		return order_unit;
	}

	public void setOrder_unit(String order_unit) {
		this.order_unit = order_unit;
	}

	public String getProduction_or_inspection_memo() {
		return production_or_inspection_memo;
	}

	public void setProduction_or_inspection_memo(String production_or_inspection_memo) {
		this.production_or_inspection_memo = production_or_inspection_memo;
	}

	public String getIndustry_standard_description() {
		return industry_standard_description;
	}

	public void setIndustry_standard_description(String industry_standard_description) {
		this.industry_standard_description = industry_standard_description;
	}

	public String getLab_or_office() {
		return lab_or_office;
	}

	public void setLab_or_office(String lab_or_office) {
		this.lab_or_office = lab_or_office;
	}

	public BigDecimal getMaterial_volume() {
		return material_volume;
	}

	public void setMaterial_volume(BigDecimal material_volume) {
		this.material_volume = material_volume;
	}

	public String getMaterial_volume_unit() {
		return material_volume_unit;
	}

	public void setMaterial_volume_unit(String material_volume_unit) {
		this.material_volume_unit = material_volume_unit;
	}

	public Boolean getHazardous_material() {
		return hazardous_material;
	}

	public void setHazardous_material(Boolean hazardous_material) {
		this.hazardous_material = hazardous_material;
	}

	public String getMaterial_freight_group() {
		return material_freight_group;
	}

	public void setMaterial_freight_group(String material_freight_group) {
		this.material_freight_group = material_freight_group;
	}

	public String getMaterial_created_by() {
		return material_created_by;
	}

	public void setMaterial_created_by(String material_created_by) {
		this.material_created_by = material_created_by;
	}

	public String getMaterial_create_date() {
		return material_create_date;
	}

	public void setMaterial_create_date(String material_create_date) {
		this.material_create_date = material_create_date;
	}

	public String getLanguage_code() {
		return language_code;
	}

	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}

	public String getCore_part() {
		return core_part;
	}

	public void setCore_part(String core_part) {
		this.core_part = core_part;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	

	// if required we can use below fields

	// * @Column(name="USE_CRE", length=50) private String userCreated;
	// *
	// * @Column(name="USE_UPD", length=40, nullable = false) private String
	// * userUpdated;
	// *
	// * @Column(name="VAR_ORD_UNI", length=3) private String variableOrderUnit;
	// *
	// * @Column(name="VOL", precision=16, scale=3) private BigDecimal volume;
	// *
	// * @Column(name="VOL_UNI", length=3) private String volumeUnit;
	// *
	// * @Column(name="WEI_UNI", length=3) private String weightUnit;
	// *
	// * @Column(name="WID", precision=16, scale=3) private BigDecimal width;
	// * *
	// * @Column(name="CRE_COU", length=255) private String creatorCountry;
	// *
	// *
	// * @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	// *
	// * @Column(name="DAT_CRE") private java.util.Date dateCreated;
	// *
	// * @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	// *
	// * @Column(name="DAT_UPD", nullable = false) private java.util.Date
	// * dateUpdated;
	// *
	// * @Column(name="GRO_WEI", precision=16, scale=3) private BigDecimal
	// * grossWeight;
	// *
	// * @Column(name="HAZ_MAT_NUM", length=18) private String
	// hazMaterialNumber;
	// * //MARA_STOFF, CHAR 18
	// *
	// * @Column(name="HEI", precision=16, scale=3) private BigDecimal height;
	// *
	// *
	// * @Column(name="LAB_OFF", length=3) private String labOffice;
	// //MARA_LABOR,
	// * CHAR 3
	// *
	// * @Column(name="LEN", precision=16, scale=3) private BigDecimal length;
	// *
	// * @Column(name="MAT_GRO", length=9) private String materialGroup;
	// *
	// * @Column(name="MAX_LOT_SIZ", length=13) private String maxLotSize;
	// *
	// * @Column(name="MIN_LOT_SIZ", length=13) private String minLotSize;
	// *
	// * @Column(name="NET_WEI", precision=16, scale=3) private BigDecimal
	// * netWeight;
	// * //MARA_ZZKADT1, Integer NUMC 7
	// *
	// *
	// * @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	// * @Column(name="ORD_AVA_DAT") private java.util.Date
	// * orderingAvailabilityDate; //MARA_ZZORAVDAT, Literal Date F DATS 8
	// *
	// *
	// * @Column(name="REG_COD", length=4) private String regionCode; //N/A
	// *
	// * @Column(name="REQ_COU", length=255) private String requestorCountry;
	// *

}
