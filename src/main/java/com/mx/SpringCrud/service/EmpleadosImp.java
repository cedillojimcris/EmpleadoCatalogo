package com.mx.SpringCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrud.dao.EmpleadosDao;
import com.mx.SpringCrud.dominio.Empleados;

@Service
public class EmpleadosImp implements EmpleadosServ{

	@Autowired
	EmpleadosDao empleadosDao;

	@Override
	public void guardar(Empleados empleados) {
		empleadosDao.save(empleados);
	}

	@Override
	public void editar(Empleados empleados) {
		empleadosDao.save(empleados);
	}

	@Override
	public void eliminar(Empleados empleados) {
		empleadosDao.delete(empleados);
	}

	@Override
	public Empleados buscar(Empleados empleados) {
		return empleadosDao.findById((long) empleados.getId()).orElse(null);
	}

	@Override
	public List<Empleados> listar() {
		return (List<Empleados>) empleadosDao.findAll();
	}
	
}

