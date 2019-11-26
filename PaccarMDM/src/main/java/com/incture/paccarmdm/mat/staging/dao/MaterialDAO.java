package com.incture.paccarmdm.mat.staging.dao;

import org.springframework.stereotype.Repository;

import com.incture.paccarmdm.mat.staging.dto.MaterialMaraDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialMarcDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialSourceDTO;
import com.incture.paccarmdm.mat.staging.dto.UserDataDTO;
import com.incture.paccarmdm.mat.staging.entities.MaterialMaraDO;
import com.incture.paccarmdm.mat.staging.entities.MaterialMarcDO;
import com.incture.paccarmdm.mat.staging.entities.MaterialSourceDO;
import com.incture.paccarmdm.mat.staging.entities.UserDataDO;
import com.incture.paccarmdm.mat.staging.util.Response;
import com.incture.paccarmdm.mat.staging.util.ServicesUtil;

@Repository
public class MaterialDAO extends BaseDAO{
	
	// 1. importToDB --> 4 components
	// 2. exportFromDB --> 4 components
	// 3. PostMaterial --> 4 components
	// 4. get all materials
	// 5. get material by id
	
	public MaterialMaraDO importToDB(MaterialMaraDTO materialMaraDTO) {
		MaterialMaraDO materialMaraDO = new MaterialMaraDO();

		materialMaraDO.setDf_at_client_level(materialMaraDTO.getDfAtClientLevel());
		materialMaraDO.setCore_part(materialMaraDTO.getCorePart());
		materialMaraDO.setHazardous_material(materialMaraDTO.getHazardousMaterial());
		materialMaraDO.setIndustry_standard_description(materialMaraDTO.getIndustryStandardDescription());
		materialMaraDO.setLab_or_office(materialMaraDTO.getLabOrOffice());
		materialMaraDO.setLanguage_code(materialMaraDTO.getLanguageCode());
		materialMaraDO.setMateria_id(materialMaraDTO.getMaterialId());
		materialMaraDO.setMaterial(materialMaraDTO.getMaterial());
		materialMaraDO.setMaterial_base_unit_of_measure(materialMaraDTO.getMaterialBaseUnitOfMeasure());
		materialMaraDO.setMaterial_create_date(materialMaraDTO.getMaterialCreateDate());
		materialMaraDO.setMaterial_created_by(materialMaraDTO.getMaterialCreatedBy());
		materialMaraDO.setMaterial_decsription(materialMaraDTO.getMaterialDecsription());
		materialMaraDO.setMaterial_freight_group(materialMaraDTO.getMaterialFreightGroup());
		materialMaraDO.setMaterial_gross_weight(materialMaraDTO.getMaterialGrossWeight());
		materialMaraDO.setMaterial_group(materialMaraDTO.getMaterialGroup());
		materialMaraDO.setMaterial_height(materialMaraDTO.getMaterialHeight());
		materialMaraDO.setMaterial_length(materialMaraDTO.getMaterialLength());
		materialMaraDO.setMaterial_net_weight(materialMaraDTO.getMaterialNetWeight());
		materialMaraDO.setMaterial_number(materialMaraDTO.getMaterialNumber());
		materialMaraDO.setMaterial_source(materialMaraDTO.getMaterialSource());
		materialMaraDO.setMaterial_type(materialMaraDTO.getMaterialType());
		materialMaraDO.setMaterial_unit_of_dimension(materialMaraDTO.getMaterialUnitOfDimension());
		materialMaraDO.setMaterial_volume(materialMaraDTO.getMaterialVolume());
		materialMaraDO.setMaterial_volume_unit(materialMaraDTO.getMaterialVolumeUnit());
		materialMaraDO.setMaterial_weight_unit(materialMaraDTO.getMaterialWeightUnit());
		materialMaraDO.setMaterial_width(materialMaraDTO.getMaterialWidth());
		materialMaraDO.setOrder_unit(materialMaraDTO.getOrderUnit());
		materialMaraDO.setProduction_or_inspection_memo(materialMaraDTO.getProductionOrInspectionMemo());
		
		System.err.println("importToDB Exception in Material Mara:-" +materialMaraDTO.getMaterialNumber());

		return materialMaraDO;
	}
	
	public MaterialMarcDO importToDB(MaterialMarcDTO materialMarcDTO) {

		MaterialMarcDO materialMarcDO = new MaterialMarcDO();
		
		materialMarcDO.setPlant_id(materialMarcDTO.getPlantId());
		materialMarcDO.setPlanning_cycle(materialMarcDTO.getPlanningCycle());
		materialMarcDO.setLot_size(materialMarcDTO.getLotSize());
		materialMarcDO.setMrp_controller(materialMarcDTO.getMrpController());
		materialMarcDO.setMrp_type(materialMarcDTO.getMrpType());
		materialMarcDO.setProcurement_type(materialMarcDTO.getProcurementType());
		
		System.err.println("importToDB Exception in Material Marc:-" +materialMarcDTO.getPlantId());
		
		return materialMarcDO;
	}
	
	public MaterialSourceDO importToDB(MaterialSourceDTO materialSourceDTO) {
		
		MaterialSourceDO materialSourceDO = new MaterialSourceDO(); 
		
		materialSourceDO.setSource_id(materialSourceDTO.getSourceId());
		materialSourceDO.setMaterial_number(materialSourceDTO.getMaterialNumber());
		materialSourceDO.setSource_name(materialSourceDTO.getSourceName());
		materialSourceDO.setSource_location(materialSourceDTO.getSourceLocation());
		materialSourceDO.setSource_code(materialSourceDTO.getSourceCode());
		materialSourceDO.setSource_authorize(materialSourceDTO.getSourceAuthorize());
		materialSourceDO.setMaterial_description(materialSourceDTO.getMaterialDescription());
		
		System.err.println("importToDB Exception in Material Source:-" +materialSourceDTO.getSourceId());
		
		return materialSourceDO;
	}
	
	public UserDataDO importToDB(UserDataDTO userDataDTO) {
		UserDataDO userDataDO = new UserDataDO();
		userDataDO.setUser_id(userDataDTO.getUserId());
		userDataDO.setUser_name(userDataDTO.getUserName());
		userDataDO.setUser_email(userDataDTO.getUserEmail());
		userDataDO.setLogin_id(userDataDTO.getLoginId());
		//userDataDO.setUser_created_on(ServicesUtil.StringToDate(userDataDTO.getUserCreatedOn()));
		userDataDO.setIs_active(userDataDTO.getIsActive());
		
		System.err.println("importToDB Exception in User Data:-" +userDataDTO.getUserName());
		
		return userDataDO;
	}
	
	
	//exporting for material description
	public MaterialMaraDTO exportFromDB(MaterialMaraDO materialMaraDO) {
		MaterialMaraDTO materialMaraDTO = new MaterialMaraDTO();

		materialMaraDTO.setDfAtClientLevel(materialMaraDO.getDf_at_client_level());
		materialMaraDTO.setHazardousMaterial(materialMaraDO.getHazardous_material());
		materialMaraDTO.setIndustryStandardDescription(materialMaraDO.getIndustry_standard_description());
		materialMaraDTO.setLabOrOffice(materialMaraDO.getLab_or_office());
		materialMaraDTO.setMaterialBaseUnitOfMeasure(materialMaraDO.getMaterial_base_unit_of_measure());
		materialMaraDTO.setMaterialDecsription(materialMaraDO.getMaterial_decsription());
		materialMaraDTO.setMaterialFreightGroup(materialMaraDO.getMaterial_freight_group());
		materialMaraDTO.setMaterialGrossWeight(materialMaraDO.getMaterial_gross_weight());
		materialMaraDTO.setMaterialGroup(materialMaraDO.getMaterial_group());
		materialMaraDTO.setMaterialHeight(materialMaraDO.getMaterial_height());
		materialMaraDTO.setMaterialLength(materialMaraDO.getMaterial_length());
		materialMaraDTO.setMaterialNetWeight(materialMaraDO.getMaterial_net_weight());
		materialMaraDTO.setMaterialNumber(materialMaraDO.getMaterial_number());
		materialMaraDTO.setMaterialSource(materialMaraDO.getMaterial_source());
		materialMaraDTO.setMaterialType(materialMaraDO.getMaterial_type());
		materialMaraDTO.setMaterialUnitOfDimension(materialMaraDO.getMaterial_unit_of_dimension());
		materialMaraDTO.setMaterialVolume(materialMaraDO.getMaterial_volume());
		materialMaraDTO.setMaterialVolumeUnit(materialMaraDO.getMaterial_volume_unit());
		materialMaraDTO.setMaterialWeightUnit(materialMaraDO.getMaterial_weight_unit());
		materialMaraDTO.setMaterialWidth(materialMaraDO.getMaterial_width());
		materialMaraDTO.setMaterialCreateDate(materialMaraDO.getMaterial_create_date());
		materialMaraDTO.setMaterialCreatedBy(materialMaraDO.getMaterial_created_by());
		materialMaraDTO.setOrderUnit(materialMaraDO.getOrder_unit());
		materialMaraDTO.setProductionOrInspectionMemo(materialMaraDO.getProduction_or_inspection_memo());	
		
		System.err.println("exportFromDB Exception in Material Mara:-" +materialMaraDTO.getMaterialNumber());

		return materialMaraDTO;
	}
	
	//exporting for material plant description
	public MaterialMarcDTO exportFromDB(MaterialMarcDO materialMarcDO) {
		MaterialMarcDTO materialMarcDTO = new MaterialMarcDTO();

		materialMarcDTO.setPlantId(materialMarcDO.getPlant_id());
		materialMarcDTO.setPlanningCycle(materialMarcDO.getPlanning_cycle());
		materialMarcDTO.setLotSize(materialMarcDO.getLot_size());
		materialMarcDTO.setMaterialNumber(materialMarcDO.getMaterial_number());
		materialMarcDTO.setMrpController(materialMarcDO.getMrp_controller());
		materialMarcDTO.setMrpType(materialMarcDO.getMrp_type());
		materialMarcDTO.setProcurementType(materialMarcDO.getProcurement_type());
		
		System.err.println("exportFromDB Exception in Material Marc:-" +materialMarcDTO.getPlantId());

		return materialMarcDTO;
	}
	
	//exporting for material source
	public MaterialSourceDTO exportFromDB(MaterialSourceDO materialSourceDO) {
		MaterialSourceDTO materialSourceDTO = new MaterialSourceDTO();
		
		materialSourceDTO.setSourceId(materialSourceDO.getSource_id());
		materialSourceDTO.setMaterialNumber(materialSourceDO.getMaterial_number());
		materialSourceDTO.setSourceName(materialSourceDO.getSource_name());
		materialSourceDTO.setSourceLocation(materialSourceDO.getSource_location());
		materialSourceDTO.setSourceCode(materialSourceDO.getSource_code());
		materialSourceDTO.setSourceAuthorize(materialSourceDO.getSource_authorize());
		materialSourceDTO.setMaterialDescription(materialSourceDO.getMaterial_description());
		
		System.err.println("exportFromDB Exception in Material source:-" +materialSourceDTO.getSourceId());

		return materialSourceDTO;
	}
	
	//exporting for user data
	public UserDataDTO exportFromDB(UserDataDO userDataDO) {
		UserDataDTO userDataDTO = new UserDataDTO();

		userDataDTO.setUserId(userDataDO.getUser_id());
		userDataDTO.setIsActive(userDataDO.getIs_active());
		userDataDTO.setLoginId(userDataDO.getLogin_id());
		userDataDTO.setUserCreatedOn(ServicesUtil.DateToString(userDataDO.getUser_created_on()));
		userDataDTO.setUserEmail(userDataDO.getUser_email());
		userDataDTO.setUserName(userDataDO.getUser_name());
		
		System.err.println("exportFromDB Exception in User Data:-" +userDataDTO.getUserId());
		
		return userDataDTO;
	}

	// create material description
	public Response postMaterialMaraDetails(MaterialMaraDTO materialMaraDTO) {
		Response response = new Response();
		if (ServicesUtil.isEmptyObject(materialMaraDTO)) {
			response.setMessage("Material  " + materialMaraDTO.getMaterialNumber() + " Created");
			response.setStatusCode(200);
			return response;
		} else {

			try {
				session = getSession();
				MaterialMaraDO materialMaraDO = importToDB(materialMaraDTO);
				int id = (int) session.save(materialMaraDO);
				//System.err.println("id:-" + id);
				response.setStatus(id + "");
				response.setMessage("success");
				response.setStatusCode(200);
				return response;
			} catch (Exception e) {
				System.err.println("Exception Material mara:- " + e.getMessage());
				response.setMessage("failed to save");
				response.setStatus("Exception:- " + e.getMessage());
				response.setStatusCode(500);
				return response;
			}
		}
	}
	
	// create material plant description
	public Response postMaterialMarcDetails(MaterialMarcDTO materialMarcDTO) {
		Response response = new Response();
		if (ServicesUtil.isEmptyObject(materialMarcDTO)) {
			response.setMessage("Material  " + materialMarcDTO.getMaterialNumber() + " Created");
			response.setStatusCode(200);
			return response;
		} else {

			try {
				session = getSession();
				MaterialMarcDO materialMarcDO = importToDB(materialMarcDTO);
				int id = (int) session.save(materialMarcDO);
				//System.err.println("id:-" + id);
				response.setStatus(id + "");
				response.setMessage("success");
				response.setStatusCode(200);
				return response;
			} catch (Exception e) {
				System.err.println("Exception Material marc:- " + e.getMessage());
				response.setMessage("failed to save");
				response.setStatus("Exception material plant description:- " + e.getMessage());
				response.setStatusCode(500);
				return response;
			}
		}
	}
	
	// create material source
	public Response postMaterialSourceDetails(MaterialSourceDTO materialSourceDTO) {
		Response response = new Response();
		if (ServicesUtil.isEmptyObject(materialSourceDTO)) {
			response.setMessage("Material Source id-  " + materialSourceDTO.getSourceId() + " Created");
			response.setStatusCode(200);
			return response;
		} else {

			try {
				session = getSession();
				MaterialSourceDO materialSourceDO = importToDB(materialSourceDTO);
				int id = (int) session.save(materialSourceDO);
				//System.err.println("id:-" + id);
				response.setStatus(id + "");
				response.setMessage("success");
				response.setStatusCode(200);
				return response;
			} catch (Exception e) {
				System.err.println("Exception Material Source:- " + e.getMessage());
				response.setMessage("failed to save");
				response.setStatus("Exception in material source:- " + e.getMessage());
				response.setStatusCode(500);
				return response;
			}
		}
	}
	
	
	// create user data
	public Response postUserDetails(UserDataDTO userDataDTO) {
		Response response = new Response();
		if (ServicesUtil.isEmptyObject(userDataDTO)) {
			response.setMessage("User  " + userDataDTO.getUserName() + " Created");
			response.setStatusCode(200);
			return response;
		} else {

			try {
				session = getSession();
				UserDataDO userDataDO = importToDB(userDataDTO);
				int id = (int) session.save(userDataDO);
				//System.err.println("id:-" + id);
				response.setStatus(id + "");
				response.setMessage("success");
				response.setStatusCode(200);
				return response;
			} catch (Exception e) {
				System.err.println("Exception user details:- " + e.getMessage());
				response.setMessage("failed to save");
				response.setStatus("Exception:- " + e.getMessage());
				response.setStatusCode(500);
				return response;
			}
		}
	}
	

	// all materials
	public Response getAllMaterialDetails() {
		return null;
		// Response response = new Response();
		// List<Object> incidentMetadataList = null;
		// IncidentMetadata incidentMetadata = null;
		// try {
		// session = getSession();
		// Query query = session.createQuery("from Incidents");
		// List<Incidents> incidentsList = query.list();
		// if (incidentsList.size() == 0) {
		// response.setMessage("success");
		// response.setStatusCode(200);
		// response.setStatus("No records exists");
		// return response;
		// } else {
		// incidentMetadata = new IncidentMetadata();
		// incidentMetadataList = new ArrayList<Object>();
		// for (Incidents incidents : incidentsList) {
		// incidentMetadata = exportFromDB(incidents);
		// incidentMetadataList.add(incidentMetadata);
		// }
		//
		// response.setMessage("Received incident data");
		// response.setStatusCode(200);
		// response.setObjList(incidentMetadataList);
		// return response;
		// }
		// } catch (Exception e) {
		// System.err.println("Exception:- " + e.getMessage());
		// response.setMessage("failed to get data");
		// response.setStatusCode(500);
		// response.setStatus("Exception:- " + e.getMessage());
		// return response;
		// }

	}
	
	// get material by id
	public Response getMaterialDetailsById(int materialId) {
		return null;
	}
		// Response response = new Response();
		// if (ServicesUtil.isEmptyNumber(id)) {
		// response.setMessage("Id can't be null");
		// response.setStatusCode(200);
		// return response;
		// }
		// List<Object> incidentImageDOList = new ArrayList<>();
		// try {
		// session = getSession();
		// Incidents incidents = session.get(Incidents.class, id);
		// incidentImageDOList = session.createQuery("from IncidentImageDO where
		// incidentId='" + id + "'").list();
		// if (ServicesUtil.isEmptyObject(incidents)) {
		// response.setMessage("NO record exists");
		// response.setStatusCode(200);
		// return response;
		// } else {
		// IncidentMetadata incidentMetadata = exportFromDB(incidents);
		// response.setObj(incidentMetadata);
		// response.setObjList(incidentImageDOList);
		// response.setMessage("Incident id: " + incidents.getIncident_id() + "
		// data available");
		// response.setStatusCode(200);
		// return response;
		// }
		// } catch (Exception e) {
		// response.setMessage("failed");
		// response.setStatusCode(500);
		// return response;
		// }
//	}
	
}
