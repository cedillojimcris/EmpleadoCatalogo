package com.mx.SpringCrud.service;

import java.util.List;

import com.mx.SpringCrud.dominio.Catalogos;

public interface CatalogosServ {

	public void guardar(Catalogos catalogos);
	public void editar(Catalogos catalogos);
	public void eliminar(Catalogos catalogos);
	public Catalogos buscar(Catalogos catalogos);
	public List<Catalogos> listar(/*No poner nada le da amsiedad*/);
}