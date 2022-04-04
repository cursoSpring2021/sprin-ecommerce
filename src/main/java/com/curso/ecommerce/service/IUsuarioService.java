package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.model.Usuario;

public interface IUsuarioService  {
	
  Optional<Usuario>	 findById(Integer id);
  Usuario save(Usuario usuario);
  Optional<Usuario> finByEmail(String email);
  List<Usuario> findAll();

}
