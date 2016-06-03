package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodioRepository  extends MongoRepository<Usuario, String> {

	List<Usuario>findByNomeEpisodio(String nomeEpisodio);
	List<Usuario>findByIdTemporada(int idTemporada);

}
