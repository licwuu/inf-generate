package com.licw.generator;

import cn.hutool.core.io.FileUtil;

/**
 * 静态文件生成器（其实就是文件复制）
 *
 * @author licw
 * @createDate 2023/11/20
 */
public class StaticGenerator {

    /**
     * 复制静态文件
     * 复制文件或目录(hutool实现）
     * 情况如下：
     *
     * <pre>
     * 1、src和dest都为目录，则将src目录及其目录下所有文件目录拷贝到dest下
     * 2、src和dest都为文件，直接复制，名字为dest
     * 3、src为文件，dest为目录，将src拷贝到dest目录下
     * </pre>
     *
     * @param src 源文件（夹）路径
     * @param dest 目标文件（夹）
     */
    public static void copyStaticFile(String src, String dest) {
        FileUtil.copy(src, dest, false);
    }


}