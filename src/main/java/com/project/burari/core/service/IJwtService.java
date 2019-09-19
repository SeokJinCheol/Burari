package com.project.burari.core.service;

import java.util.Map;

public interface IJwtService {
	<T> String create(String key, T data, String subject);
	Map<String, Object> get(String key);
	Integer getMemberId();
	boolean isUsable(String jwt);
}
