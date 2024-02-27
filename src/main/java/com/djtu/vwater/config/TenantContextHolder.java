package com.djtu.vwater.config;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: wang, yong
 * @Date 2021-10-27 15:30
 */
@Slf4j
public class TenantContextHolder {
	public static final ThreadLocal<Integer> content = new ThreadLocal<>();

	public static void setTenantId(Integer toKen) {
		content.set(toKen);
	}

	public static Integer getTenantId() {
		return content.get();
	}

	public static void clear() {
		content.remove();
	}

}
