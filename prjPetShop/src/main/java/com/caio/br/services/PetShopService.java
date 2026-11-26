package com.caio.br.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caio.br.entities.PetShop;
import com.caio.br.repositories.PetShopRepository;



@Service
public class PetShopService {

private final PetShopRepository petshoprepository;
	
	public PetShopService( PetShopRepository petshoprepository) {
		this.petshoprepository = petshoprepository;
	}
	
	public PetShop getJogo(Long id) {
		return petshoprepository.findById(id).orElse(null);
	}
	
	public List<PetShop> getTodosJogos(){
		return petshoprepository.findAll();
	}
	
	public PetShop salvarJogo(PetShop petshop) {
		return petshoprepository.save(petshop);
	}
	
	public void deletarjogo(Long id) {
		petshoprepository.deleteById(id);
	}
	
}

