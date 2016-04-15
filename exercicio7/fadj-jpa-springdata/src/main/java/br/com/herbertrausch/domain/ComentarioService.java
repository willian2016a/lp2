package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class ComentarioService {

	
	private ComentarioRepository db;
	
	public ComentarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ComentarioRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Comentario> getComentarios() {
		List<Comentario> comentarios = (List<Comentario>) db.findAll();
		return comentarios;
	    
	}
	
	public List<Comentario> getByComentario(String comentario){
		return db.findByComentario(comentario);
	}
	
	public Comentario getComentario(Long id) {
		return db.findOne(id);
		}
	}
