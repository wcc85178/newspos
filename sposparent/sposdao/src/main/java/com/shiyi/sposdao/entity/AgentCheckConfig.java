package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AgentCheckConfig implements Serializable {
    private Integer id;

    private Integer parentTypeStart;

    private Integer parentTypeEnd;

    private static final long serialVersionUID = 1L;
}