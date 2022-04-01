package cn.canary.core;


import java.io.Serializable;

/**
 * 表示对象内部的信息
 *
 * @author yaojianxing
 */
public abstract class Info implements Serializable {
    private static final long serialVersionUID = 5583654013618205373L;
    
    /**
     * 对象转为{@link BizScenario}
     * @return
     */
    public abstract BizScenario toBizScenario();
}
