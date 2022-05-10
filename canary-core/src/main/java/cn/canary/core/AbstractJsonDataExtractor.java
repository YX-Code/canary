package cn.canary.core;

import cn.canary.core.dto.response.MultiResponse;
import cn.canary.core.dto.response.SingleResponse;

import java.util.Collection;
import java.util.Map;

/**
 * 默认实现Map转换的数据提取
 * 
 * 默认的实现将参数Map作为数据实体看待
 * 
 * @author yaojianxing
 */
public abstract class AbstractJsonDataExtractor implements JsonDataExtractor {
    
    @Override
    public SingleResponse toSingle(Map<String, Object> source) {
        SingleResponse singleResponse = new SingleResponse();
        singleResponse.setResult(source);
        singleResponse.setSuccess(true);
        return singleResponse;
    }
    @SuppressWarnings("rawtypes")
    @Override
    public MultiResponse toMulti(Collection<? extends Map> source) {
        MultiResponse multiResponse = new MultiResponse();
        multiResponse.setData(source);
        multiResponse.setSuccess(true);
        return multiResponse;
    }
}
