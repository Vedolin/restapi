package com.vedolin.itlab;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vedolin.itlab.model.Carro;

// Para construir os "findBy" com nomes inferidos a partir dos parametros
import org.springframework.data.repository.query.Param;


// Brinquei com Ruby on Rails durante algum tempo
// Descobrir esta interface já me deu vontade de trabalhar com Spring

@RepositoryRestResource(collectionResourceRel = "carros", path = "carros" )
public interface RepositorioCarro extends PagingAndSortingRepository<Carro, Long>{
	List<Carro> findByModelo(@Param("modelo") String modelo);

	

}
