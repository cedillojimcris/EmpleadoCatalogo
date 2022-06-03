package com.mx.SpringCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrud.dao.CatalogosDao;
import com.mx.SpringCrud.dominio.Catalogos;

@Service
public class CatalogosServImp implements CatalogosServ {

	@Autowired
	CatalogosDao catalogosDao;
	
	@Override
	public void guardar(Catalogos catalogos) {
		// TODO Auto-generated method stub
		catalogosDao.save(catalogos);
	}

	@Override
	public void editar(Catalogos catalogos) {
		// TODO Auto-generated method stub
		catalogosDao.save(catalogos);
	}

	@Override
	public void eliminar(Catalogos catalogos) {
		// TODO Auto-generated method stub
		catalogosDao.delete(catalogos);
	}

	@Override
	public Catalogos buscar(Catalogos catalogos) {
		// TODO Auto-generated method stub
		return catalogosDao.findById(catalogos.getId()).orElse(null);
	}

	@Override
	public List<Catalogos> listar() {
		// TODO Auto-generated method stub
		return (List<Catalogos>) catalogosDao.findAll();
	}

}
