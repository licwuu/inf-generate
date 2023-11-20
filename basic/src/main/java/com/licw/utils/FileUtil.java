package com.licw.utils;

import java.net.URL;

/**
 * 文件相关操作的工具类
 *
 * @author licw
 * @createDate 2023/11/20
 */
public class FileUtil {

    /**
     * 获取资源文件夹路径
     *
     * @return 返回资源文件夹路径绝对路径
     */
    public static String getResourcesFolderPath() {
        // 使用ClassLoader获取资源文件夹的URL
        URL resource = FileUtil.class.getClassLoader().getResource("");
        assert resource != null;
        // 获取资源文件夹的绝对路径
        return resource.getPath().substring(1);
    }
}
