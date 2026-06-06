package com.heltonsoares.sefin_pref_recife.dtos.medicamentos;

import java.util.List;

public record MedicamentosResultDTO(List<MedicamentosDTO> records, Integer total) {

}
