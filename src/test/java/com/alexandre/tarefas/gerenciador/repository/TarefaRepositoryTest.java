package com.alexandre.tarefas.gerenciador.repository;

import com.alexandre.tarefas.gerenciador.model.Tarefa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TarefaRepositoryTest {

    @Mock
    private TarefaRepository tarefaRepository;

    @Test
    void salvarDadosEObterTarefa() {
        Tarefa tarefa = new Tarefa("Desenvolver Projetos", LocalDate.now(), "SleightofHand");

        when(tarefaRepository.save(any(Tarefa.class))).thenReturn(tarefa);

        Tarefa resultado = tarefaRepository.save(tarefa);

        assertEquals("Desenvolver Projetos", resultado.getNome());
        assertEquals("SleightofHand", resultado.getResponsavel());
        verify(tarefaRepository, times(1)).save(tarefa);
    }
}
