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

import com.sagem.requivalence.entites.Composants;
import com.sagem.requivalence.entites.Users;
import com.sagem.requivalence.services.ServiceComposants;

@RestController
@RequestMapping({ "/Composants" })
public class ControllerComposants {
	@Autowired
	ServiceComposants scomposant;

	@GetMapping("/Composants")
	public List<Composants> gettAllComposants() {
		return (List<Composants>) scomposant.findAll();

	}

	@PostMapping("/Composants")
	public Composants AddComposants(@Validated @RequestBody Composants composant) {
		return scomposant.save(composant);
	}

	@PutMapping("/Composants/{Id}")
	public Composants updateComposants(@PathVariable Long Id, @Validated @RequestBody Composants composantRequest) {
		Composants composant = scomposant.getOne(Id);
		composant.setAGS(composantRequest.getAGS());

		return scomposant.save(composant);

	}

}
