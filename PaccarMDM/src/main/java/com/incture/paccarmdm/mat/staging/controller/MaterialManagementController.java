package com.incture.paccarmdm.mat.staging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.paccarmdm.mat.staging.dto.MaterialMaraDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialMarcDTO;
import com.incture.paccarmdm.mat.staging.dto.MaterialSourceDTO;
import com.incture.paccarmdm.mat.staging.dto.UserDataDTO;
import com.incture.paccarmdm.mat.staging.service.MaterialService;
import com.incture.paccarmdm.mat.staging.util.Response;

@RestController
@RequestMapping(value = "/material")
public class MaterialManagementController {

	@Autowired
	private MaterialService materialService;

	// wel come message
	@GetMapping("/msg")
	public String getMessage() {
		return "Welcome to Material Master Management System";
	}

	// create material
	@PostMapping("/postMaterial")
	public Response postMaterialMaraDetails(@RequestBody MaterialMaraDTO materialMaraDTO) {
		return materialService.postMaterialMaraDetails(materialMaraDTO);
	}

	@PostMapping("/postPlant")
	public Response postMaterialMarcDetails(@RequestBody MaterialMarcDTO materialMarcDTO) {
		return materialService.postMaterialMarcDetails(materialMarcDTO);
	}

	@PostMapping("/postSource")
	public Response postMaterialSourceDetails(@RequestBody MaterialSourceDTO materialSourceDTO) {
		return materialService.postMaterialSourceDetails(materialSourceDTO);
	}

	@PostMapping("/createUser")
	public Response postUserDetails(@RequestBody UserDataDTO userDataDTO) {
		return materialService.postUserDetails(userDataDTO);
	}

	// get all details
	@GetMapping("/getAllMaterial")
	public Response getAllMaterialDetails() {
		return materialService.getAllMaterialDetails();
	}

	// get material details by id
	@GetMapping("/getMaterialDetailsById")
	public Response getMaterialDetailsById() {
		return materialService.getMaterialDetailsById();
	}
}
