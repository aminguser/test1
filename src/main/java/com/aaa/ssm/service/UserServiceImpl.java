package com.aaa.ssm.service;/**
 * Created by${smy}
 */

import com.aaa.ssm.dao.UserDao;
import com.aaa.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *fileName:UserServiceImpl
 *description:
 *author:Smy
 *createTime:2019/3/3 0003 10:57
 */

@Service
public class UserServiceImpl implements UserService {
 @Autowired
 private UserDao dao;
/*    @Autowired
    private JedisUtil jedisUtil;*/

    @Override
    public List<Map> getUserPage(Map map) {
      //  map.put("start",(Integer.valueOf(map.get("pageNo")+"")-1)*Integer.valueOf(map.get("pageSize")+""));
          map.put("start",(Integer.valueOf(map.get("pageNo")+"")-1)*Integer.valueOf(map.get("pageSize")+""));
        return dao.getUserPage(map);
    }

    @Override
    public int getUserPageCount(Map map) {
        return dao.getUserPageCount(map);
    }

    public List<Map> getUserList() {
        return  dao.getUserList();
        //从redis  取 对象
      /*  Object userList = jedisUtil.getObject("userList");
        if(userList!=null){//如果存在，直接返回
            System.out.println("从redis缓存中取！！！！！");
            return (List<Map>)userList;
        }else{//不存在 ，从数据库中获取，放入缓存
            System.out.println("从数据库取值。。。。。。。。。");
            List<Map> userList1 = dao.getUserList();
            jedisUtil.putObject("userList",userList1);
            return userList1;
        }*/
    }
}
