package com.atecher.mintools.service;

import com.atecher.mintools.model.MtResource;

import java.util.List;


public interface IToolService {

    List<MtResource> findToolAll();

    List<MtResource> findToolsByCategory(String param);
}
