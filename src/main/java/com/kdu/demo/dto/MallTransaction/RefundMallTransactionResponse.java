package com.kdu.demo.dto.MallTransaction;

import java.io.Serializable;
import java.util.Date;

public class RefundMallTransactionResponse implements Serializable {

    private String type;
    private String authorization_code;
    private Date authorization_date;
    private Integer nullified_amount;
    private Integer balance;
}
