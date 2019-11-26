package com.incture.paccarmdm.mat.staging.dto;

public class MaterialSourceDTO {
	private static final long serialVersionUID = 1L;

	private Integer sourceId;

	private String materialNumber;

	private String sourceName;

	private Boolean sourceAuthorize;

	private String sourceLocation;

	private String sourceCode;

	private String materialDescription;

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public String getMaterialNumber() {
		return materialNumber;
	}

	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public Boolean getSourceAuthorize() {
		return sourceAuthorize;
	}

	public void setSourceAuthorize(Boolean sourceAuthorize) {
		this.sourceAuthorize = sourceAuthorize;
	}

	public String getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}

}
