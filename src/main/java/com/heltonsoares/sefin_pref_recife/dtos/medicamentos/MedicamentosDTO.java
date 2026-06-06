package com.heltonsoares.sefin_pref_recife.dtos.medicamentos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MedicamentosDTO(
    Integer distrito,
    String unidade,
    String apresentacao,
    @JsonProperty("codigo_produto") String codigoProduto,
    String produto,
    Integer cadum,
    Integer quantidade) {

}
