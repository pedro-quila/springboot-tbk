package com.kdu.demo.controller;

import com.kdu.demo.dto.ConfirmTransactionRequest;
import com.kdu.demo.dto.ConfirmTransactionResponse;
import com.kdu.demo.dto.InitMensualTransactionRequest;
import com.kdu.demo.dto.InitTransactionResponse;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/mensual-transaction")
public class TbkNMensualTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionController.class);

    @Autowired
    private TbkNormalTransactionService tbkMensualTransactionService;

    @PostMapping("/initMensual")
    public ResponseEntity<InitTransactionResponse> postInitMensualTransaction(@RequestBody InitMensualTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(tbkMensualTransactionService.initMensualTransaction(request), HttpStatus.OK);
    }

    @PutMapping("/confirm")
    public ResponseEntity<ConfirmTransactionResponse> confirmTransaction(@RequestBody ConfirmTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(tbkMensualTransactionService.confirmTransaction(request), HttpStatus.OK);
    }
}
