package com.kdu.demo.controller;

import com.kdu.demo.dto.InitTransactionRequest;
import com.kdu.demo.dto.InitTransactionResponse;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/normal-transaction")
public class TbkNormalTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionController.class);

    @Autowired
    private TbkNormalTransactionService tbkNormalTransactionService;

    @PostMapping("/init")
    public ResponseEntity<InitTransactionResponse> postInitTransaction(@RequestBody InitTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(tbkNormalTransactionService.initTransaction(request), HttpStatus.OK);
    }



}
