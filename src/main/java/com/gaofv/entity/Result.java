package com.gaofv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: GF
 * @Date: 2019/10/18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result {
    private Boolean success;
    private String message;
}
