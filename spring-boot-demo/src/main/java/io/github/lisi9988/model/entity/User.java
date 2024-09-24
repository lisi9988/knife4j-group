package io.github.lisi9988.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户实体类
 *
 * @author Tomcat
 */
@Getter
@Setter
@Schema(description = "用户")
public class User implements Serializable {

    private static final long serialVersionUID = 390249053149258022L;

    /**
     * 主键ID
     */
    @Schema(description = "主键ID")
    private Integer id;

    /**
     * 名称
     */
    @Schema(description = "名称")
    private String name;

    /**
     * 状态:0=禁用;1=正常
     */
    @Schema(description = "状态:0=禁用;1=正常")
    private Integer status;

    /**
     * 创建时间
     */
    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

}
