package com.licw.generator;

import com.licw.utils.FileUtil;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * ACM模板的代码生成器
 *
 * @author licw
 * @createDate 2023/11/20
 */
public class ACMGenerator {
    private static final String ALL_TEMPLATES_PATH = FileUtil.getResourcesFolderPath() + "templates";

    public static void doGenerate(String templateName, String destPath, Object model) throws TemplateException, IOException {
        String ACMTemplatePath = String.join(File.separator, ALL_TEMPLATES_PATH, templateName);
        StaticGenerator.copyStaticFile(ACMTemplatePath, destPath);

        String templateFilePath = String.join(File.separator, ACMTemplatePath, "MainTemplate.java.ftl");
        String fileDestPath = String.join(File.separator, destPath, templateName, "MainTemplate.java");
        DynamicGenerator.generateDynamicFile(templateFilePath, fileDestPath, model);
    }

}
