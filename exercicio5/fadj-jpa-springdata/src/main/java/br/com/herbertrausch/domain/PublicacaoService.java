package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PublicacaoService {

	
	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}

	// Lista todos as publicacoes do banco de dados
	public List<Publicacao> getPublicacaos() {
		List<Publicacao> publicaos = (List<Publicacao>) db.findAll();
		return publicaos;
	}	
	public List<Publicacao> getByPagina(String pagina){
		return db.findByPagina(pagina);
	}

	public Publicacao getPublicacao(Long id) {
		return db.findOne(id);
	 }
    
}
	