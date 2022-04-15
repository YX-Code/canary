package cn.canary.core.enums;

/**
 * 通用状态枚举
 *
 * @author yaojx
 */
public enum CommonStatusEnum {

    ENABLE(0, "开启"),
    DISABLE(1, "关闭");
    
    CommonStatusEnum(Integer status, String name) {
        this.status = status;
        this.name = name;
    }
    
    /**
     * 状态值
     */
    private final Integer status;
    /**
     * 状态名
     */
    private final String name;
    
    public Integer getStatus() {
        return status;
    }
    
    public String getName() {
        return name;
    }
}
