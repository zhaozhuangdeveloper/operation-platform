package cn.tinet.operationplatformservice.module.app.deploy.domain.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Time : 2021/4/16 16:51
 * @Author : zhaozhuang
 * @Email : zhaozhuang@ti-net.com.cn
 * @File : DeployListVO.java
 * @Software: IntelliJ IDEA
 * @description: deploy列表展示
 **/
@Data
@Builder
public class DeployListVO {
    /** deployment id */
    private String id;
    /** 名称 */
    private String name;
    /** 状态 */
    private String status;
    /** 正常的副本数 */
    private Integer readyReplicas;
    /** 正在更新的副本数 */
    private Integer updateReplicas;
    /** 全部副本数 */
    private Integer replicas;
    /** 命名空间 */
    private String namespace;
    /** 创建时间 */
    private Long creationTimestamp;
    /** 镜像 */
    private List<String> images;
}
