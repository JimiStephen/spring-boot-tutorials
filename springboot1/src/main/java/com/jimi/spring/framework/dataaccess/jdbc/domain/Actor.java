package com.jimi.spring.framework.dataaccess.jdbc.domain;

import lombok.*;

import java.util.Date;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 9:57
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Actor {
    private Long actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdate;
}
