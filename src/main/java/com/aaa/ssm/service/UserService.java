package com.aaa.ssm.service;/**
 * Created by${smy}
 */

import java.util.List;
import java.util.Map;

/**
 *fileName:UserService
 *description:
 *author:Smy
 *createTime:2019/3/3 0003 10:56
 */
public interface UserService {
    List<Map> getUserList();
    /**
     * 获取分页所需的数据
     */
    List<Map> getUserPage(Map map);

    /**
     * 获取总数据
     * @param map
     * @return
     */
    int  getUserPageCount(Map map);
}
