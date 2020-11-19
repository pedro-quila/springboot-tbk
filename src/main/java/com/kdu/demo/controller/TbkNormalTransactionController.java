package com.kdu.demo.controller;

import com.kdu.demo.dto.NormalTransaction.*;
import com.kdu.demo.service.TbkNormalTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/normal-transaction")
public class TbkNormalTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionController.class);

    @Autowired
    private TbkNormalTransactionService tbkNormalTransactionService;

    @PostMapping("/initNormal")
    public ResponseEntity<InitTransactionResponse> postInitTransaction(
            @RequestBody InitTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkNormalTransactionService.initTransaction(request),
                HttpStatus.OK);
    }

    @PostMapping("/initMensual")
    public ResponseEntity<InitTransactionResponse> postInitMensualTransaction(
            @RequestBody InitMensualTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkNormalTransactionService.initMensualTransaction(request),
                HttpStatus.OK);
    }

    @PutMapping("/confirm")
    public ResponseEntity<ConfirmTransactionResponse> putConfirmTransaction(
            @RequestBody ConfirmTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkNormalTransactionService.confirmTransaction(request),
                HttpStatus.OK);
    }

    @GetMapping("/state")
    public ResponseEntity<StateTransactionResponse> getTransactionState(
            @RequestBody StateTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkNormalTransactionService.transactionState(request),
                HttpStatus.OK);
    }

    @PutMapping("/refund")
    public ResponseEntity<RefundTransactionResponse> putRefundTransaction(
            @RequestBody RefundTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkNormalTransactionService.refundTransaction(request),
                HttpStatus.OK);
    }
}
