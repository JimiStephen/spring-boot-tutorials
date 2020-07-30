package com.jimi.spring.framework.dataaccess.jdbc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/24 16:17
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Title {

    private Long id;

    private String name;
}
