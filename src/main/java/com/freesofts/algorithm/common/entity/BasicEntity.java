package com.freesofts.algorithm.common.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Description: </br>
 * <p>版权所有：</p>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p>
 * 杭州孚立计算机软件有限公司
 *
 * @author LargerBear</ br>
 * date: 2021/12/14 13:39</br>
 * @since JDK 1.8
 */
@Data
public class BasicEntity implements Serializable {

	@Id
	@ApiModelProperty(value = "ID", notes = "最大长度不能超过32个字符")
	@Size(max = 32, message = "id 长度必须在 {min} - {max} 之间")
	private String id;

	@ApiModelProperty(value = "创建人ID", notes = "用户ID", required = true)
	private String createdBy;

	@ApiModelProperty(value = "创建人名", notes = "用户登陆名", required = true)
	private String creatorName;

	@ApiModelProperty(value = "创建时间", notes = "标准格式：yyyy-MM-dd HH:mm:ss", required = true)
	private Date createdDate;

	@ApiModelProperty(value = "最后修改人ID", notes = "用户ID")
	private String lastModifiedBy;

	@ApiModelProperty(value = "最后修改人登陆名", notes = "用户登陆名")
	private String lastModifiedName;

	@ApiModelProperty(value = "最后修改时间", notes = "标准格式：yyyy-MM-dd HH:mm:ss")
	private Date lastModifiedDate;

	@ApiModelProperty(value = "是否删除", notes = "是否删除")
	private Integer delFlag;


}
