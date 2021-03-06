package com.fast.springboot.basic.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogExtUtil {
    private static final Logger logger = LoggerFactory.getLogger(LogExtUtil.class);

    public static String decryptAndLog(String method, String paramName, String rawValue) {
        String newValue = Base64Util.decrypt(rawValue);
        logger.info("{} -> paramName:{}, rawValue:{}, newValue:{}", method, paramName, rawValue, newValue);
        return newValue;
    }
}
