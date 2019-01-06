package com.project.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 返回页面类
 *
 * @author penghz
 * @date 2018-11-11 11:11:11
 * @version 1.0
 */
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PageResult <T> {

    private long total;
    private List<T> rows;


}

