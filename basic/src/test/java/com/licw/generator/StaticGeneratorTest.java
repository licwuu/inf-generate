package com.licw.generator;

import org.junit.Test;

/**
 * 静态文件生成测试
 *
 * @author licw
 * @createDate 2023/11/20
 */
public class StaticGeneratorTest {

    @Test
    public void copyStaticFile() {
        // 复制文件夹
        StaticGenerator.copyStaticFile("X:\\inf-generate\\basic", "X:\\inf-generate\\generate");
        // 复制文件
        StaticGenerator.copyStaticFile("X:\\inf-generate\\basic\\src\\main\\java\\com\\licw\\Main.java", "X:\\inf-generate\\generate");
    }
}