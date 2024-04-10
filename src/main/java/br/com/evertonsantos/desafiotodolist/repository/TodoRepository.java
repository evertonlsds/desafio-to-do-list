package br.com.evertonsantos.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.evertonsantos.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
