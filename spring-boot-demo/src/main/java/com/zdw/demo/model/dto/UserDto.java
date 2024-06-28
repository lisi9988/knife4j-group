package com.zdw.demo.model.dto;

import com.zdw.demo.toolkit.ValidaGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * 用户-请求数据载体
 *
 * @author Tomcat
 */
@Setter
@Getter
@ToString
@Schema(description = "用户-请求数据载体")
public class UserDto implements Serializable {

    private static final long serialVersionUID = 392694626450850052L;

    /**
     * 主键ID
     */
    @Schema(description = "主键ID", groups = {ValidaGroup.Query.class, ValidaGroup.HiddenCreate.class, ValidaGroup.Update.class, ValidaGroup.Delete.class})
    @Null(groups = {ValidaGroup.Create.class}, message = "ID必须为空")
    @NotNull(groups = {ValidaGroup.Update.class, ValidaGroup.Delete.class}, message = "ID不能为空")
    private Integer id;

    /**
     * 名称
     */
    @Schema(description = "名称", groups = {ValidaGroup.HiddenQuery.class, ValidaGroup.Create.class, ValidaGroup.Update.class, ValidaGroup.HiddenDelete.class})
    @NotEmpty(groups = {ValidaGroup.Create.class, ValidaGroup.Update.class}, message = "名称不能为空")
    @Length(max = 255, groups = {ValidaGroup.Create.class, ValidaGroup.Update.class}, message = "名称长度不能超过255个字符")
    private String name;

    /**
     * 用户状态
     */
    @Schema(description = "用户状态:0=禁用;1启用", groups = {ValidaGroup.Update.class, ValidaGroup.HiddenDelete.class})
    @NotNull(groups = {ValidaGroup.Create.class, ValidaGroup.Update.class}, message = "用户状态不能为空")
    private Integer status;

}
