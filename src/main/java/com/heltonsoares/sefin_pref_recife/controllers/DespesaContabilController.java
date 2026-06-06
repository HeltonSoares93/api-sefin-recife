package com.heltonsoares.sefin_pref_recife.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heltonsoares.sefin_pref_recife.dtos.despesas.DespesaContabilDTO;
import com.heltonsoares.sefin_pref_recife.services.DespesaContabilService;

@RestController
@RequestMapping("/api/v1/despesas")
public class DespesaContabilController {

  private final DespesaContabilService despesaService;

  public DespesaContabilController(DespesaContabilService despesaService) {
    this.despesaService = despesaService;
  }

  @GetMapping
  public ResponseEntity<List<DespesaContabilDTO>> getDespesas() {
    List<DespesaContabilDTO> despesas = despesaService.listarDespesas();

    return ResponseEntity.ok(despesas);
  }

}
