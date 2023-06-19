package com.freesofts.algorithm.common.depart;

import com.freesofts.threader.LoginAppUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * Description: </br>
 * <p>版权所有：</p>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p>
 * 杭州孚立计算机软件有限公司
 *
 * @author LargerBear</ br>
 * date: 2020/9/14 14:20</br>
 * @since JDK 1.8
 */
@Component
@Slf4j
public class CommonService {

    /**
     * 根据当前登录用户查询用户详情接口
     */
    public static LoginAppUser getUserDetail() {
        LoginAppUser user = (LoginAppUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (null == user) {
            throw new RuntimeException("用户不存在或者已删除");
        }
        return user;
    }

}
