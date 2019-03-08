package com.aaa.ssm.util;/**
 * Created by${smy}
 */

/**
 *fileName:JedisUtil
 *description:用来声明jedisutil的使用方法
 *author:Smy
 *createTime:2019/3/3 0003 11:40
 */
public interface JedisUtil {
    /**
     * 放入缓存
     * @param key
     * @param value
     */
    void putObject(Object key, Object value);
    /**
     * 清除缓存
     * @param arg0
     * @return
     */
    Object removeObject(Object arg0);
    /**
     * 从缓存中获取
     * @param arg0
     * @return
     */
    Object getObject(Object arg0);
}
