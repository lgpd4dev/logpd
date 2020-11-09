package br.dev.logpd

import br.dev.logpd.model.Etapa
import br.dev.logpd.model.Registro
import br.dev.logpd.model.Tratamento
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

internal class RegistroTest {

    @Test
    fun testToLog() {
        val tratamento = Tratamento("pn1", Etapa.ANONIMIZACAO, "t01", "teste de descricao")
        val registro = Registro(LocalDateTime.of(2020, 2, 20, 12, 12, 24), "fulano", tratamento)
        val log = registro.toLog()
        println(log)
        //assertEquals("")
    }
}