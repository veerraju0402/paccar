package com.incture.paccarmdm.mat.staging.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.paccarmdm.mat.staging.dao.MaterialDAO;
import com.incture.paccarmdm.mat.staging.dto.MaterialMaraDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialMarcDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialSourceDTO;
import com.incture.paccarmdm.mat.staging.dto.UserDataDTO;
import com.incture.paccarmdm.mat.staging.util.Response;

@Transactional
@Service
public class MaterialServiceImpl implements MaterialService{
	
	@Autowired
	private MaterialDAO materialDAO;

	public Response postMaterialMaraDetails(MaterialMaraDTO materialMaraDTO) {
		return materialDAO.postMaterialMaraDetails(materialMaraDTO);
	}
	
	@Override
	public Response postMaterialMarcDetails(MaterialMarcDTO materialMarcDTO) {
		return materialDAO.postMaterialMarcDetails(materialMarcDTO);
	}

	@Override
	public Response postMaterialSourceDetails(MaterialSourceDTO materialSourceDTO) {
		return materialDAO.postMaterialSourceDetails(materialSourceDTO);
	}
	
	@Override
	public Response postUserDetails(UserDataDTO userDataDTO) {
		return materialDAO.postUserDetails(userDataDTO);
	}
	
	@Override
	public Response getAllMaterialDetails() {
		return null;
	}

	@Override
	public Response getMaterialDetailsById() {
		return null;
	}
	
}
