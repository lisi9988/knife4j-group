package io.github.lisi9988.model.dto;

import io.github.lisi9988.toolkit.ValidGroup;
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
    @Schema(description = "主键ID", groups = {ValidGroup.Query.class, ValidGroup.HiddenCreate.class, ValidGroup.Update.class, ValidGroup.Delete.class})
    @Null(groups = {ValidGroup.Create.class}, message = "ID必须为空")
    @NotNull(groups = {ValidGroup.Update.class, ValidGroup.Delete.class}, message = "ID不能为空")
    private Integer id;

    /**
     * 名称
     */
    @Schema(description = "名称", groups = {ValidGroup.HiddenQuery.class, ValidGroup.Create.class, ValidGroup.Update.class, ValidGroup.HiddenDelete.class})
    @NotEmpty(groups = {ValidGroup.Create.class, ValidGroup.Update.class}, message = "名称不能为空")
    @Length(max = 255, groups = {ValidGroup.Create.class, ValidGroup.Update.class}, message = "名称长度不能超过255个字符")
    private String name;

    /**
     * 用户状态
     */
    @Schema(description = "用户状态:0=禁用;1启用", groups = {ValidGroup.Update.class, ValidGroup.HiddenDelete.class})
    @NotNull(groups = {ValidGroup.Create.class, ValidGroup.Update.class}, message = "用户状态不能为空")
    private Integer status;

}
