package br.dev.logpd.model

data class BaseLegal(val hipoteseLegal: HipoteseLegal, val descricao: String = hipoteseLegal.descricao)