package com.hy.designPattern.proxy.folder;

/**
 * @Author: wanghai
 * @Date:2019/11/9 10:47
 * @Copyright:reach-life
 * @Description:
 */
public class FolderProxy implements IFolder {

    private Folder folder;

    private User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    @Override
    public void performOperations() {
        if (user.getUserName().equals("wang") && user.getPassword().equals("123456")) {
            folder = new Folder();
            folder.performOperations();
        } else {
            System.out.println("permission permitted !!!");
        }
    }
}
