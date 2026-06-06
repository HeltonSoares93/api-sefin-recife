package com.heltonsoares.sefin_pref_recife.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heltonsoares.sefin_pref_recife.dtos.medicamentos.MedicamentosDTO;
import com.heltonsoares.sefin_pref_recife.services.MedicamentoService;

@RestController
@RequestMapping("/api/v1/medicamentos")
public class MedicamentoController {

  private final MedicamentoService medicamentoService;

  public MedicamentoController(MedicamentoService medicamentoService) {
    this.medicamentoService = medicamentoService;
  }

  @GetMapping
  public ResponseEntity<List<MedicamentosDTO>> getMedicamentos() {
    List<MedicamentosDTO> medicamentos = medicamentoService.listarMedicamentos();
    return ResponseEntity.ok(medicamentos);
  }

}
