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
public class User {
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private String salt;
}
