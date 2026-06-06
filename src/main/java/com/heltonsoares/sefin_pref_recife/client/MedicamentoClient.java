package com.heltonsoares.sefin_pref_recife.client;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.heltonsoares.sefin_pref_recife.dtos.medicamentos.MedicamentosDTO;
import com.heltonsoares.sefin_pref_recife.dtos.medicamentos.MedicamentosResponseDTO;

@Service
public class MedicamentoClient {

  private final RestClient restClient;
  private static final String RESOURCE_ID = "537f0b95-4eb7-4912-9d7c-32caf9fd68ac";

  public MedicamentoClient() {
    this.restClient = RestClient.create("https://dados.recife.pe.gov.br");
  }

  public List<MedicamentosDTO> buscarDados() {
    MedicamentosResponseDTO response = restClient
        .get()
        .uri(uriBuilder -> uriBuilder
            .path("/api/action/datastore_search")
            .queryParam("resource_id", RESOURCE_ID)
            .build())
        .retrieve()
        .body(MedicamentosResponseDTO.class);

    if (response != null && response.result() != null && response.result().records() != null) {
      return response.result().records();
    }
    return List.of();
  }
}
