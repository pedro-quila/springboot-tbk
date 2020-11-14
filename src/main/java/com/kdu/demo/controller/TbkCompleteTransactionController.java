package com.kdu.demo.controller;

import com.kdu.demo.dto.CompleteTransaction.*;
import com.kdu.demo.service.TbkCompleteTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.ReflectiveConstructorResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/complete-transaction")
public class TbkCompleteTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionController.class);

    @Autowired
    private TbkCompleteTransactionService tbkCompleteTransactionService;

    @PostMapping("/initComplete")
    public ResponseEntity<InitCompleteTransactionResponse> postInitCompleteTransaction(
            @RequestBody InitCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkCompleteTransactionService.initCompleteTransaction(request),
                HttpStatus.OK);
    }

    @PostMapping("/completeInstallments")
    public ResponseEntity<QuotaCompleteTransactionResponse> postInstallmentsCompleteTransaction(
            @RequestBody QuotaCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkCompleteTransactionService.quotaCompleteTransaction(request),
                HttpStatus.OK);
    }

    @PutMapping("/confirmComplete")
    public ResponseEntity<ConfirmCompleteTransactionResponse> putConfirmCompleteTransaction(
            @RequestBody ConfirmCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkCompleteTransactionService.confirmCompleteTransaction(request),
                HttpStatus.OK);
    }

    @GetMapping("/stateComplete")
    public ResponseEntity<CompleteTransactionStateResponse> getCompleteTransactionState(
            @RequestBody CompleteTransactionStateRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkCompleteTransactionService.completeTransactionState(request),
                HttpStatus.OK);
    }

    @PutMapping("/refundComplete")
    public ResponseEntity<RefundCompleteTransactionResponse> putRefundCompleteTransaction(
            @RequestBody RefundCompleteTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkCompleteTransactionService.refundCompleteTransaction(request),
                HttpStatus.OK);
    }
    /*
    @PostMapping("/initMall")
    public ResponseEntity<InitMallTransactionResponse> postInitMallTransaction(
            @RequestBody InitMallTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallTransactionService.initMallTransaction(request),
                HttpStatus.OK);
    }
     */
}
