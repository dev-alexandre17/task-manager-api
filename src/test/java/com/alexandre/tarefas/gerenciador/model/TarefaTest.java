package com.alexandre.tarefas.gerenciador.model;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {

    @Test
    void criarDadosGenerativos() {
        Tarefa tarefa = new Tarefa("Criação de dados de usuário",
                LocalDate.of(2025, 7, 1), "tainAwesome");

        assertEquals("Criação de dados de usuário", tarefa.getNome());
        assertEquals("tainAwesome", tarefa.getResponsavel());
        assertEquals(LocalDate.of(2025, 7, 1), tarefa.getDataEntrega());
    }
}
