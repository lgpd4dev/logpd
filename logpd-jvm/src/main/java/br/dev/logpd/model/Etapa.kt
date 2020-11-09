package br.dev.logpd.model

/**
 * Lista com as 6 etapas de um ciclo de vida de tratamento de dados pessoais.
 */
enum class Etapa (val codigo: Char, val descricao: String){

    COLETA ('C', "Coleta"),
    RETENCAO ('R', "Retenção"),
    PROCESSAMENTO('P', "Processamento"),
    TRANSFERENCIA ('T', "Transferência"),
    ANONIMIZACAO ('A', "Anonimização"),
    EXCLUSAO ('E', "Exclusão");

}