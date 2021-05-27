package com.sagem.requivalence.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagem.requivalence.entites.Detail_Composants;
import com.sagem.requivalence.services.ServiceDetail_Composants;

@RestController
@RequestMapping({ "/detail_composants" })
public class ControllerDetail_Composants {
	@Autowired
	ServiceDetail_Composants sdetail_composants;

	@GetMapping("/list")
	public List<Detail_Composants> gettAllDetails_Composants() {
		return (List<Detail_Composants>) sdetail_composants.findAll();
	}
	//@GetMapping ( "/ detail_composants/ {ags}" )  
	//public List<Detail_Composants> getDetails_ComposantsByAGS()
	//retourne  booksService.getBooksById (bookid);  
	//}
}
