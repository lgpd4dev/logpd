package br.dev.logpd.model

import java.lang.StringBuilder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Representa um registro de Log efetuado por uma aplicação.
 *
 * @author Douglas Siviotti
 * @since 1.0
 */
data class Registro (val momento: LocalDateTime, val titularId: String, val tratamento: Tratamento){

    fun toLog(): String {
        val sb = StringBuilder()
        sb.append(momento.format(DateTimeFormatter.ISO_DATE)).append(" ")
        if (momento.hour < 10) sb.append("0")
        sb.append(momento.hour).append(":")
        if (momento.minute < 10) sb.append("0")
        sb.append(momento.minute).append(":")
        if (momento.second < 10) sb.append("0")
        sb.append(momento.second)
        sb.append(" ")
        sb.append("titular=").append(titularId).append(" ")
        sb.append("pn=").append(tratamento.processoNegocio).append(" ")
        sb.append("etapa=").append(tratamento.etapa).append(" ")
        sb.append("tratamento=").append(tratamento.id).append(" ")
        sb.append("descricao=").append(tratamento.descricao)
        return sb.toString()
    }
}

