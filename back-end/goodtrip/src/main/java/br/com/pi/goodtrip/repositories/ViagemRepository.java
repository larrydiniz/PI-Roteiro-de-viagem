package br.com.pi.goodtrip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pi.goodtrip.models.Viagem;

@Repository
public interface ViagemRepository extends CrudRepository<Viagem, Integer>{}