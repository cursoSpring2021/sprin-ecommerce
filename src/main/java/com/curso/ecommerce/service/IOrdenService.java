package com.curso.ecommerce.service;

import java.util.List;

import com.curso.ecommerce.model.Orden;
public interface IOrdenService  {
	List<Orden> finAll();
	Orden save (Orden orden);

}
