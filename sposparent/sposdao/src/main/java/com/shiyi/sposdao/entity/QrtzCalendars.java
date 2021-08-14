package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzCalendars extends QrtzCalendarsKey implements Serializable {
    private byte[] calendar;

    private static final long serialVersionUID = 1L;
}