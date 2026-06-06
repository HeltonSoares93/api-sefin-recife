package com.heltonsoares.sefin_pref_recife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heltonsoares.sefin_pref_recife.client.DespesaContabilClient;
import com.heltonsoares.sefin_pref_recife.dtos.despesas.DespesaContabilDTO;

@Service
public class DespesaContabilService {

  private final DespesaContabilClient despesaClient;

  public DespesaContabilService(DespesaContabilClient despesaClient) {
    this.despesaClient = despesaClient;
  }

  public List<DespesaContabilDTO> listarDespesas() {
    return despesaClient.buscarDados();
  }
}
