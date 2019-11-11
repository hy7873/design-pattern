package com.hy.designPattern.proxy.folder;

/**
 * @Author: wanghai
 * @Date:2019/11/9 10:50
 * @Copyright:reach-life
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {
        User user = new User("wang","1123456");
        FolderProxy proxy = new FolderProxy(user);
        proxy.performOperations();
    }

}
