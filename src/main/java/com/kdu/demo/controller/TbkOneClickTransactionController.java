package com.kdu.demo.controller;

import com.kdu.demo.dto.OneClickTransaction.*;
import com.kdu.demo.service.TbkOneClickTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/oneClick-transaction")
public class TbkOneClickTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkNormalTransactionController.class);

    @Autowired
    private TbkOneClickTransactionService tbkOneClickTransactionService;

    @PostMapping("/initInscription")
    public ResponseEntity<InitOneClickInscriptionResponse> postOCInscription(
            @RequestBody InitOneClickInscriptionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.initOCInscription(request),
                HttpStatus.OK);
    }

    @PutMapping("/finishInscription")
    public ResponseEntity<FinishOneClickInscriptionResponse> putFinishOCInscription(
            @RequestBody FinishOneClickInscriptionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.finishOCInscription(request),
                HttpStatus.OK);
    }

    @PostMapping("/authorizePayment")
    public ResponseEntity<AuthorizeOneClickPaymentResponse> postAuthorizeOCPayment(
            @RequestBody AuthorizeOneClickPaymentRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.authorizeOCPayment(request),
                HttpStatus.OK);
    }

    @GetMapping("/stateTransaction")
    public ResponseEntity<StateOneClickTransactionResponse> getStateOCTransaction(
            @RequestBody StateOneClickTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.stateOCTransaction(request),
                HttpStatus.OK);
    }

    @PutMapping("/refundTransaction")
    public ResponseEntity<RefundOneClickTransactionResponse> postRefundOCTransaction(
            @RequestBody RefundOneClickTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.refundOCTransaction(request),
                HttpStatus.OK);
    }

    @PostMapping("/authorizeMulticode")
    public ResponseEntity<AuthorizeOneClickMulticodeResponse> postAuthorizeOCMulticode(
            @RequestBody AuthorizeOneClickMulticodeRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.authorizeOCMulticode(request),
                HttpStatus.OK);
    }

    @GetMapping("/stateMulticode")
    public ResponseEntity<StateOneClickMulticodeTransactionResponse> getStateOCMulticode(
            @RequestBody StateOneClickMulticodeTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.stateOCMulticode(request),
                HttpStatus.OK);
    }

    @PutMapping("/refundMulticode")
    public ResponseEntity<RefundOneClickMulticodeTransactionResponse> postRefundOCMulticode(
            @RequestBody RefundOneClickMulticodeTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.refundOCMulticode(request),
                HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<DeleteOneClickUserResponse> deleteOCUser(
            @RequestBody DeleteOneClickUserRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkOneClickTransactionService.deleteUser(request),
                HttpStatus.OK);
    }
}
