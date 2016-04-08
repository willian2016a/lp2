package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Publicacao;
import br.com.herbertrausch.domain.PublicacaoService;

@Path("/publicacoes")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PublicacaoResource {
	
	private PublicacaoService service = new PublicacaoService();
	
	@GET
	public List<Publicacao> get() {
		List<Publicacao> lista = service.getPublicacaos();
		return lista;
	}
	
	@GET
	@Path("/id/{id}")
	public Publicacao get(@PathParam("id") long id) {
		Publicacao p = service.getPublicacao(id);
		return p;
	}
	
	@GET
	@Path("/pagina/{pagina}")
	public List<Publicacao> get(@PathParam("pagina") String pagina) {
		List<Publicacao> p = service.getByPagina(pagina);
		return p;
	}
	

}
