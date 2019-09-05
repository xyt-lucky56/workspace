package com.xyt.common.base.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.SelectProvider;

public interface SelectMapEntityMapper<T> {
	@SelectProvider(type = BaseSelectMapEntityProvider.class, method = "dynamicSQL")
    @MapKey("pkid")
	Map<Long,T> selectMapEntity(T record);
}
