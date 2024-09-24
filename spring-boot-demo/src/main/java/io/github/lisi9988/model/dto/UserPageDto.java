package io.github.lisi9988.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户-列表请求数据载体
 *
 * @author Tomcat
 */
@Setter
@Getter
@ToString
@Schema(description = "用户-列表请求数据载体")
public class UserPageDto implements Serializable {

    private static final long serialVersionUID = -43159509620715386L;

    /**
     * 主键ID
     */
    @Schema(description = "主键ID")
    private Integer id;

    /**
     * 用户码
     */
    @Schema(description = "用户码")
    private String code;

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
