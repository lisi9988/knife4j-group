package io.github.lisi9988.toolkit;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回结果类
 *
 * @author Tomcat
 */
@Data
public class Result<T> implements Serializable {

    /**
     * code
     */
    @Schema(description = "code")
    private String code;

    /**
     * data数据
     */
    @Schema(description = "data")
    private transient T data;

    /**
     * 消息
     */
    @Schema(description = "msg")
    private String msg;
}
