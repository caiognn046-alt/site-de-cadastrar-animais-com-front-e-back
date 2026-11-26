package com.caio.br.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.caio.br.entities.PetShop;
import com.caio.br.services.PetShopService;

@RestController
@RequestMapping("/petshop")
public class PetShopController {

	private final PetShopService petshopservice;

	public PetShopController(PetShopService petshopservice) {
		this.petshopservice = petshopservice;
		}

	   @GetMapping("/{id}")
	   public ResponseEntity<PetShop> getPetShop(@PathVariable Long id){
		   PetShop petshop = petshopservice.getJogo(id);
		   if(petshop != null) {
			   return ResponseEntity.ok(petshop);
		   }else {
			   return ResponseEntity.notFound().build();
		   }
	   }
	    @GetMapping
	   public List<PetShop> getALLjogos(){
		   return petshopservice.getTodosJogos();
	   }
	   @PostMapping("/create")
	   public PetShop createJogo(@RequestParam("nome")String nome,
			   @RequestParam("tipo") String tipo,
			   @RequestParam("raca") String raca,
			   @RequestParam("sexo") String sexo,
			   @RequestParam("tutorNome") String tutorNome,
			   @RequestParam("idade") int idade,
			   @RequestParam("foto") MultipartFile foto)throws IOException {
		   byte [] imageBytes = foto.getBytes();
		   PetShop petshop = new PetShop();
		   petshop.setNome(nome);
		   petshop.setTipo(tipo);
		   petshop.setRaca(raca);
		   petshop.setSexo(sexo);
		   petshop.setIdade(idade);
		   petshop.setTutorNome(tutorNome);
		   petshop.setFoto(imageBytes);
		   
		   return petshopservice.salvarJogo(petshop);
		   
		   
	   }
}
