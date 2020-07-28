package pe.edu.upeu.BACKEND.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.BACKEND.dao.ClienteDao;
import pe.edu.upeu.BACKEND.modelo.Cliente;
import pe.edu.upeu.BACKEND.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService{
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	public List<Cliente> listar(){
		return clienteDao.listar();
	}
}
