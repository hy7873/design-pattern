package com.hy.designPattern.proxy.folder;

/**
 * @Author: wanghai
 * @Date:2019/11/9 10:45
 * @Copyright:reach-life
 * @Description:
 */
public class Folder implements IFolder {
    @Override
    public void performOperations() {
        System.out.println("perform operations on folder");
    }
}
