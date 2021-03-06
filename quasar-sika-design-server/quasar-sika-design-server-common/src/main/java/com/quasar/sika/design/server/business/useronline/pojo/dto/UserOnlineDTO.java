package com.quasar.sika.design.server.business.useronline.pojo.dto;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.sika.code.standard.base.pojo.dto.BaseStandardDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 在线用户记录
 * </p>
 *
 * @author daiqi
 * @since 2021-01-08 00:03:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UserOnlineDTO extends BaseStandardDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据表id
     */
    private Long userOnlineId;
    /**
     * 用户会话id
     */
    private String sessionid;
    /**
     * 登录账号
     */
    private String loginName;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 登录IP地址
     */
    private String ipaddr;
    /**
     * 登录地点
     */
    private String loginLocation;
    /**
     * 浏览器类型
     */
    private String browser;
    /**
     * 操作系统
     */
    private String os;
    /**
     * 在线状态on_line在线off_line离线
     */
    private String status;
    /**
     * session创建时间
     */
    private LocalDateTime startTimestamp;
    /**
     * session最后访问时间
     */
    private LocalDateTime lastAccessTime;
    /**
     * 超时时间，单位为分钟
     */
    private Integer expireTime;

}
