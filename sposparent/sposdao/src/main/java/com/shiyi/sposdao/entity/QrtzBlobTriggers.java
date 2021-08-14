package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzBlobTriggers extends QrtzBlobTriggersKey implements Serializable {
    private byte[] blobData;

    private static final long serialVersionUID = 1L;
}