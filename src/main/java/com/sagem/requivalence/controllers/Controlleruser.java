package com.sagem.requivalence.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagem.requivalence.entites.Users;
import com.sagem.requivalence.services.Serviceuser;

@RestController
@RequestMapping("/api")
public class Controlleruser {
	@Autowired
	Serviceuser susr;

	@PostMapping("/Users")
	public Users Adduser(@RequestBody Users user) {
		return susr.save(user);
	}

	@GetMapping("/Users")
	public List<Users> getuser() {
		return susr.findAll();
	}
@PutMapping("/Users/{Id}")
public Users updateuser(@PathVariable Long Id,@Validated  @RequestBody Users usrRequest) {
   Users user = susr.getOne(Id);
   user.setNom(usrRequest.getNom());
   user.setPrenom(usrRequest.getPrenom());
   return susr.save(user);
   
}}
