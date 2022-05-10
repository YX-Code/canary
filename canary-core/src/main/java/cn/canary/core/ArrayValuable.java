package cn.canary.core;

/**
 * 用于标记对象为可生成数组的接口
 *
 * @author yaojx
 */
public interface ArrayValuable<T> {

    /**
     * 说明对象可转为数组
     * 
     * @return T类型的数组
     */
    T[] toArray();
}
