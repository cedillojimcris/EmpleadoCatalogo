package com.mx.SpringCrud.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrud.dominio.Empleados;

public interface EmpleadosDao extends CrudRepository<Empleados, Long> {

}
