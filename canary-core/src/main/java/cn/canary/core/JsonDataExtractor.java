package cn.canary.core;

import cn.canary.core.dto.response.MultiResponse;
import cn.canary.core.dto.response.PageResponse;
import cn.canary.core.dto.response.SingleResponse;

import java.util.Collection;
import java.util.Map;

/**
 * 数据提取转换器
 *
 * @author yaojx
 */
public interface JsonDataExtractor {
    /**
     * 将Map转换为SingleResponse
     *
     * @param source
     * @return
     */
    SingleResponse toSingle(Map<String, Object> source);
    
    /**
     * 将Map转换为MultiResponse
     *
     * @param source
     * @return
     */
    @SuppressWarnings("rawtypes")
    MultiResponse toMulti(Collection<? extends Map> source);
    
    /**
     * 将实体转换为SingleResponse
     *
     * @param source
     * @return
     */
    SingleResponse toSingle(Object source);
    
    /**
     * 将实体转换为MultiResponse
     *
     * @param source
     * @return
     */
    MultiResponse toMulti(Object source);
    
    /**
     * 将实体转换为PageResponse
     *
     * @param source
     * @return
     */
    PageResponse toPage(Object source);
}
