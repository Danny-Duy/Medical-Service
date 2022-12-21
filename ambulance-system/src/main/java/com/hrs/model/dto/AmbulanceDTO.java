package com.hrs.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AmbulanceDTO {
    private long id;
    private long accountId;
    private String name;
    private String numberPlate;
    private String avatar;
    private boolean status;

}
