package br.dev.logpd.model

private val map = HipoteseLegal.values().map { it.codigo to it }.toMap()

fun hipoteseLegalOf(codigo: Int) = map[codigo]

enum class HipoteseLegal(val codigo: Int,
                         val descricao: String,
                         val requerConsentimento: Boolean = false,
                         val permiteTratarSensivel: Boolean = true
) {
    /** art. 7 e 11 */
    CONSENTIMENTO(1, "Consentimento", true, true),

    /** art. 7 e 11 */
    OBRIGACAO_LEGAL(2, "Obrigação Legal"),

    /** art. 7 e 11 */
    ADM_PUBLICA(3, "Administração Pública"),

    /** art. 7 e 11 */
    ESTUDOS(4, "Estudo por Órgão de Pesquisa"),

    /** art. 7 e 11 */
    CONTRATO(5, "Execução de Contrato"),

    /** art. 7 e 11 */
    PROCESSO_JUDICIAL(6, "Processo Judicial, Extrajudicial ou Arbitragem"),

    /** art. 7 e 11 */
    PROTECAO_VIDA(7, "Proteção à Vida"),

    /** art. 7 e 11 */
    TUTELA_SAUDE(8, "Tutela de Saúde"),

    /** art. 7  */
    LEGITIMO_INTERESSE(9, "Legítimo Interesse", false),

    /** art. 7 */
    PROTECAO_CREDITO(10, "Proteção ao Crédito", false),

    /** art. 11 */
    PREVENCAO_FRAUDE(11, "Prevenção à Fraude"),

    /** art. 23 ou outra base legal fora da LGPD */
    OUTROS(99, "Outros");
    ;



}