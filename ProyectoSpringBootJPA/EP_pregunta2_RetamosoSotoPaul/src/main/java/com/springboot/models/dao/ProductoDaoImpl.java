package com.springboot.models.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.springboot.models.Producto;

@Repository
public class ProductoDaoImpl implements IProductoDao{
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Producto> listar() {
		String sql = "select * from producto";
		List<Producto>lista = jdbctemplate.query(sql, BeanPropertyRowMapper.newInstance(Producto.class));
		return lista;
	}

}
