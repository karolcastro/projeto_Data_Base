package com.wms.inbound.ds.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DsController {

    @GetMapping(path = "/ds/status")
    public String check() {
        return "app online";
    }

}
