package com.kdu.demo.controller;

import com.kdu.demo.dto.MallTransaction.*;
import com.kdu.demo.service.TbkMallTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/mall-transaction")
public class TbkMallTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkMallTransactionController.class);

    @Autowired
    private TbkMallTransactionService tbkMallTransactionService;

    @PostMapping("/initMall")
    public ResponseEntity<InitMallTransactionResponse> postInitMallTransaction(
            @RequestBody InitMallTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallTransactionService.initMallTransaction(request),
                HttpStatus.OK);
    }

    @PutMapping("/confirmMall")
    public ResponseEntity<ConfirmMallTransactionResponse> putConfirmMallTransaction(
            @RequestBody ConfirmMallTransactionRequest request){
        logger.info("Peticion recibida "+request.toString());
        return new ResponseEntity<>(
                tbkMallTransactionService.confirmMallTransaction(request),
                HttpStatus.OK);
    }

    @GetMapping("/stateMall")
    public ResponseEntity<MallTransactionStateResponse> getMallTransactionState(
            @RequestBody MallTransactionStateRequest request) {
        logger.info("Peticion recibida " + request.toString());
        return new ResponseEntity<>(
                tbkMallTransactionService.mallTransactionState(request),
                HttpStatus.OK);
    }

    @PutMapping("/refundMall")
    public ResponseEntity<RefundMallTransactionResponse> putRefundMallTransaction(
            @RequestBody RefundMallTransactionRequest request){
        logger.info("Peticion recibida " + request.toString());
        return new ResponseEntity<>(
                tbkMallTransactionService.refundMallTransaction(request),
                HttpStatus.OK);
    }

}
