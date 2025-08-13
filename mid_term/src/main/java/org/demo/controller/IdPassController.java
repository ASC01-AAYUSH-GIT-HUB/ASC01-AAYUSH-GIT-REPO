package org.demo.controller;

import org.demo.entity.IdPassEntity;
import org.demo.service.IdPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verification")
public class IdPassController {
    private final IdPassService idPassService;
    @Autowired
    public IdPassController(IdPassService idPassService){
        this.idPassService=idPassService;
    }

    @PostMapping("/id")
    String verification(@RequestBody IdPassEntity idPassEntity){
        return idPassService.getVerification(idPassEntity);
    }
}
