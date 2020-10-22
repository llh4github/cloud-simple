package com.llh.cloudsimple.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JsonResult
 * <p>
 * CreatedAt: 2020-10-19 22:41
 *
 * @author llh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult {
    private int code;
    private String msg;
    private Object data;

    public static JsonResult ok(Object data) {
        return new JsonResult(200, "ok", data);
    }

    public static JsonResult ok(Object data, String msg) {
        return new JsonResult(200, msg, data);
    }


    public static JsonResult ok() {
        return new JsonResult(200, "ok", null);
    }
}