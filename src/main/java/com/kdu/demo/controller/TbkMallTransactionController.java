package com.kdu.demo.controller;

import com.kdu.demo.dto.MallTransaction.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/mall-transaction")
public class TbkMallTransactionController {

    Logger logger = LoggerFactory.getLogger(TbkMallTransactionController.class);


}
