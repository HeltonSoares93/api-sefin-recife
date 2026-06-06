package com.heltonsoares.sefin_pref_recife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heltonsoares.sefin_pref_recife.client.MedicamentoClient;
import com.heltonsoares.sefin_pref_recife.dtos.medicamentos.MedicamentosDTO;

@Service
public class MedicamentoService {

  private final MedicamentoClient medicamentoClient;

  public MedicamentoService(MedicamentoClient medicamentoClient) {
    this.medicamentoClient = medicamentoClient;
  }

  public List<MedicamentosDTO> listarMedicamentos() {
    return medicamentoClient.buscarDados();
  }
}
