package com.heltonsoares.sefin_pref_recife.client;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.heltonsoares.sefin_pref_recife.dtos.despesas.DespesaContabilDTO;
import com.heltonsoares.sefin_pref_recife.dtos.despesas.DespesaContabilResponseDTO;

@Service
public class DespesaContabilClient {

  private final RestClient restClient;

  private static final String RESOURCE_ID = "edfe9ed5-ab63-48a7-96bd-b1c28be02476";

  public DespesaContabilClient() {
    this.restClient = RestClient.create("https://dados.recife.pe.gov.br");
  }

  public List<DespesaContabilDTO> buscarDados() {
    DespesaContabilResponseDTO response = restClient.get()
        .uri(uribuilder -> uribuilder
            .path("/api/action/datastore_search")
            .queryParam("resource_id", RESOURCE_ID)
            .build())
        .retrieve()
        .body(DespesaContabilResponseDTO.class);

    if (response != null && response.result() != null && response.result().records() != null) {
      return response.result().records();
    }
    return List.of();
  }

}
