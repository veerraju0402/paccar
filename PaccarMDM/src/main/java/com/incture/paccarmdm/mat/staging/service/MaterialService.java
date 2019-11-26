package com.incture.paccarmdm.mat.staging.service;

import com.incture.paccarmdm.mat.staging.dto.MaterialMaraDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialMarcDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialSourceDTO;
import com.incture.paccarmdm.mat.staging.dto.UserDataDTO;
import com.incture.paccarmdm.mat.staging.util.Response;

public interface MaterialService {

	Response postMaterialMaraDetails(MaterialMaraDTO materialMaraDTO);
	
	Response postMaterialMarcDetails(MaterialMarcDTO materialMarcDTO);
	
	Response postMaterialSourceDetails(MaterialSourceDTO materialSourceDTO);
	
	Response postUserDetails(UserDataDTO userDataDTO);
	
	Response getAllMaterialDetails();
	
	Response getMaterialDetailsById();
}
