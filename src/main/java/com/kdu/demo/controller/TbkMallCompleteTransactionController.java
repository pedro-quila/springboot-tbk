package com.kdu.demo.controller;

import com.kdu.demo.dto.MallCompleteTransaction.*;
import com.kdu.demo.service.TbkMallCompleteTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/mallcomplete-transaction")
public class TbkMallCompleteTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkMallTransactionController.class);

    @Autowired
    private TbkMallCompleteTransactionService tbkMallCompleteTransactionService;

    @PostMapping("/initMallComplete")
    public ResponseEntity<InitMallCompleteTransactionResponse> postInitMallCompleteTransaction(
            @RequestBody InitMallCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallCompleteTransactionService.initTransaction(request),
                HttpStatus.OK);
    }

    @PutMapping("/confirmMallComplete")
    public ResponseEntity<ConfirmMallCompleteTransactionResponse> putConfirmMallCompleteTransaction(
            @RequestBody ConfirmMallCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallCompleteTransactionService.confirmTransaction(request),
                HttpStatus.OK);
    }

    @PostMapping("/installmentsMallComplete")
    public ResponseEntity<QuotaMallCompleteTransactionResponse> postInstallmentsMallCompleteTransaction(
            @RequestBody QuotaMallCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallCompleteTransactionService.quotaTransaction(request),
                HttpStatus.OK);
    }

    @GetMapping("/stateMallComplete")
    public ResponseEntity<StateMallCompleteTransactionResponse> getStateMallCompleteTransaction(
            @RequestBody StateMallCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallCompleteTransactionService.stateTransaction(request),
                HttpStatus.OK);
    }

    @PutMapping("/refundMallComplete")
    public ResponseEntity<RefundMallCompleteTransactionResponse> putRefundMallCompleteTransaction(
            @RequestBody RefundMallCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallCompleteTransactionService.refundTransaction(request),
                HttpStatus.OK);
    }
}
