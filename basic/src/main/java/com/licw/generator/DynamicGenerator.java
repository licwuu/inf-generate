package com.licw.generator;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 动态文件生成器（其实就是文件复制）
 * 利用模板引擎，将模板文件生+数据模型生成目标文件
 *
 * @author licw
 * @createDate 2023/11/20
 */
public class DynamicGenerator {

    /**
     * 通过FreeMaker生成文件
     *
     * @param src 模板文件路径
     * @param model 数据模型
     * @param dest 目标文件路径
     */
    public static void generateDynamicFile(String src, String dest, Object model) throws IOException, TemplateException {
        File file = new File(src);
        if(!file.exists()) throw new IOException("文件模板不存在");
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        configuration.setDefaultEncoding("utf-8");

        // 指定模板文件夹路径
        configuration.setDirectoryForTemplateLoading(file.getParentFile());

        // 创建模板对象
        Template template = configuration.getTemplate(file.getName());

        // 生成目标文件
        FileWriter out = new FileWriter(dest);
        template.process(model, out);
        out.close();
    }

}
