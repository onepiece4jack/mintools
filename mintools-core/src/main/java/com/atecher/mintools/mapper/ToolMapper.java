package com.atecher.mintools.mapper;

import com.atecher.mintools.model.MtResource;

import java.util.List;

public interface ToolMapper {

    List<MtResource> findToolAll();

    List<MtResource> findToolsByCategory(String param);
}
