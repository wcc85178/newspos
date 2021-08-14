package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzCalendarsKey implements Serializable {
    private String schedName;

    private String calendarName;

    private static final long serialVersionUID = 1L;
}