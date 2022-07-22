package hrms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import hrms.domain.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
@TableName(value = "hrms_user")
public class User extends BaseEntity {

    @TableField(exist = true, value = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

    @TableField(exist = true, value = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    @TableField(exist = true, value = "email")
    @ApiModelProperty(value = "邮箱")
    private String email;

    @TableField(exist = true, value = "phone")
    @ApiModelProperty(value = "手机号")
    private String phone;

    @TableField(exist = true, value = "sex")
    @ApiModelProperty(value = "性别")
    private Integer sex;

    @TableField(exist = true, value = "job")
    @ApiModelProperty(value = "职位")
    private Integer job;

    @TableField(exist = true, value = "state")
    @ApiModelProperty(value = "状态")
    private Boolean state;
}
