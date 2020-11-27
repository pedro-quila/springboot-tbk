package com.kdu.demo.dto.OneClickTransaction;

import java.io.Serializable;

public class FinishOneClickInscriptionResponse implements Serializable {

    private Integer response_code;
    private String tbk_user;
    private String authorization_code;
    private String credit_card_type;
    private String last_four_digits;
}
