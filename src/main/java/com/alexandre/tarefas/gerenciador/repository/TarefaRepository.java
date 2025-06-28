package com.alexandre.tarefas.gerenciador.repository;

import com.alexandre.tarefas.gerenciador.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
}
