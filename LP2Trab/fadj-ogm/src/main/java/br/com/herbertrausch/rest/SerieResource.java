package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.spring.mongo.Serie;
import br.com.herbertrausch.spring.mongo.SerieService;


@Path("/series")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class SerieResource {

	SerieService service = new SerieService();
	
	@GET
	public List<Serie> get() {
		
		return service.getAll();
		
	}
	
	@GET
	@Path("/Serie/{nome}")
	public List<Serie> getByNomeSerie(@PathParam("Serie") String nomeSerie) {
		return service.getByNomeSerie(nomeSerie);
	}
	@GET
	@Path("/Genero/{genero}")
	public List<Serie> getByGeneroSerie(@PathParam("Genero") String generoSerie) {
		return service.getByGeneroSerie(generoSerie);
	}
	
	
	
	@POST
	public void save(Serie e){
		
		service.insert(e);
		
	}
    
}