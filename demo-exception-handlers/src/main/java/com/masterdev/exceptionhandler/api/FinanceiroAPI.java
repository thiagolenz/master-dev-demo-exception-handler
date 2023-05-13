package com.masterdev.exceptionhandler.api;

import com.masterdev.exceptionhandler.dto.FinanceiroDTO;
import com.masterdev.exceptionhandler.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/financeiro")
public class FinanceiroAPI {
    @Autowired
    private FinanceiroService financeiroService;

    @PostMapping
    public FinanceiroDTO salvar(@RequestBody FinanceiroDTO financeiro) {
        return financeiroService.salvar(financeiro);
    }
}
