package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository  extends MongoRepository<Cliente, String> {

	List<Usuario>findByNomeSerie(String nomeSerie);
	List<Usuario>findByGeneroSerie(String generoSerie );

}
