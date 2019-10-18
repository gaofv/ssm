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
public class Emp {
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
}
