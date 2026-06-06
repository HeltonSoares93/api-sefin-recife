package com.heltonsoares.sefin_pref_recife.dtos.despesas;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DespesaContabilDTO(
    @JsonProperty("ano") String ano,

    @JsonProperty("mês") String mes,

    @JsonProperty("Código do órgão") Long codigoOrgao, // Long utilizado devido ao tamanho 15 definido no metadado

    @JsonProperty("Descrição do órgão") String descricaoOrgao,

    @JsonProperty("Código da função") Long codigoFuncao,

    @JsonProperty("Descrição da função") String descricaoFuncao,

    @JsonProperty("Código da sub-função") Long codigoSubFuncao,

    @JsonProperty("Descrição da sub-função") String descricaoSubFuncao,

    @JsonProperty("Código do programa") Long codigoPrograma,

    @JsonProperty("Descrição do programa") String descricaoPrograma,

    @JsonProperty("Código da ação") Long codigoAcao,

    @JsonProperty("Descrição da ação") String descricaoAcao,

    @JsonProperty("Código da categoria") Long codigoCategoria,

    @JsonProperty("Descrição da categoria") String descricaoCategoria

    // @JsonProperty("Dotação inicial") BigDecimal dotacaoInicial, // BigDecimal utilizado para precisão em valores
    //                                                             // contábeis

    // @JsonProperty("Dotação atualizada") BigDecimal dotacaoAtualizada,

    // @JsonProperty("Empenhado") BigDecimal empenhado,

    // @JsonProperty("Liquidado") BigDecimal liquidado,

    // @JsonProperty("Pago") BigDecimal pago
) {

}
