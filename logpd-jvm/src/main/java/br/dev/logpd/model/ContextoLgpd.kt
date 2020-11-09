package br.dev.logpd.model

import java.lang.IllegalArgumentException

/**
 * Um contexto LGPD é o conjunto de processos de negócio e seus tratamentos de dados pessoais organizados por etapas.
 * O contexto pode referir-se a uma organização inteira, a um sistema ou a um conjunto deles. Dentro de um contexto,
 * contudo, os processos de negócio são identificados e individualizados.
 *
 * @author Douglas Siviotti
 * @since 1.0
 */
data class ContextoLgpd(
        /** O ID do contexto identifica a organização ou sistema ao qual ele se refere */
        val id: String,
        /** Um contexto tem um conjunto de processos de negócio oriundos do mundo real */
        val tratamentos: List<Tratamento>
) {
    private val mapTratamentos = tratamentos.map { it.id to it }.toMap()

    init {

    }

    fun tratamentoByOd(id: String): Tratamento = if (!mapTratamentos.containsKey(id)) throw IllegalArgumentException(id) else mapTratamentos[id]!!
    fun tratamentosByProcessoNegocio(pnId: String) = tratamentos.filter { it.processoNegocio.id == pnId }.toList()
    
    fun listProcessosNegocio() = tratamentos.gr
}

/**
 * Um processo de negócio (PN) representa uma operação feita pela organização no mundo real.
 * É a representação de uma atividade comercial ou não que contém um ou mais tratamentos de dados pessoais.
 *
 * @author Douglas Siviotti
 * @since 1.0
 */
data class ProcessoNegocio(
        val id: String,
        val descricao: String,
        val baseLegal: BaseLegal)

/**
 * O tratamento representa um evento individual dentro de um processo de negócio onde o dado pessoal foi manipulado
 * de alguma forma. Qualquer operação é considerada um tratamento. Contudo, os tratamentos devem estar dentro
 * de alguma Etapa do ciclo de vida.
 *
 * @author Douglas Siviotti
 * @since 1.0
 */
data class Tratamento(
        val processoNegocio: ProcessoNegocio,
        val etapa: Etapa,
        val id: String,
        val descricao: String)