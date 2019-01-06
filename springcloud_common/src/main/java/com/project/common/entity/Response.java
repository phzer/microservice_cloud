package com.project.common.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 返回类
 *
 * @author penghz
 * @date 2018-11-11 11:11:11
 * @version 1.0
 */
@Data
@Slf4j
@Accessors(chain = true)
public class Response implements Serializable {


    private boolean flag;
    private String code;
    private String message;
    private Object data;

    public Response() {
    }

    public Response(boolean flag, String code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Response(boolean flag, String code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
