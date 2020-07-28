package pe.edu.upeu.BACKEND.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.BACKEND.dao.ClienteDao;
import pe.edu.upeu.BACKEND.modelo.Cliente;

@Repository
public class ClienteDaoImp  implements ClienteDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Cliente> listar(){
		String sql = "select * from cliente";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cliente.class));
	}
}
