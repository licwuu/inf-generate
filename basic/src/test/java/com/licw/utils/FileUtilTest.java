package com.licw.utils;

import org.junit.Test;

/**
 *
 * @author licw
 * @createDate 2023/11/20
 */
public class FileUtilTest {

    @Test
    public void getResourcesFolderPath() {
        String resourcesPath = FileUtil.getResourcesFolderPath();
        System.out.println(resourcesPath);
    }
}