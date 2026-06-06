package com.heltonsoares.sefin_pref_recife.dtos.despesas;

import java.util.List;

public record DespesaContabilResultDTO(
    List<DespesaContabilDTO> records,
    Integer total) {

}
