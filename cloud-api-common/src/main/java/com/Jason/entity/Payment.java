package com.Jason.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Jason
 * @Date 2022/5/2 13:49
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private long id;
    private String serial;
}
