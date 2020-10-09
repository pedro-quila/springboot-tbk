package com.kdu.demo.controller;

import com.kdu.demo.dto.RequestInitTransaction;
import com.kdu.demo.dto.ResponseInitTransaction;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TbkNormalTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionController.class);

    @Autowired
    private TbkNormalTransactionService tbkNormalTransactionService;

    @PostMapping
    public ResponseInitTransaction initTransaction (@RequestBody RequestInitTransaction requestInitTransaction){
        logger.info("Peticion recibida "+ requestInitTransaction.toString());
        return tbkNormalTransactionService.initTransaction(requestInitTransaction);
    }
}
