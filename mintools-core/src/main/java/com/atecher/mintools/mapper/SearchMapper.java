package com.atecher.mintools.mapper;

import java.util.HashMap;
import java.util.List;

public interface SearchMapper {

    List<HashMap<String, Object>> search(String param);
}
