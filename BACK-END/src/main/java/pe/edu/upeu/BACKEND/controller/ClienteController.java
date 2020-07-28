package pe.edu.upeu.BACKEND.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.BACKEND.modelo.Cliente;
import pe.edu.upeu.BACKEND.service.ClienteService;

@RestController
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/")
	public 	List<Cliente> listar(){
		return clienteService.listar();
	}


}
