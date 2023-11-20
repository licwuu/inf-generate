package com.licw.generator;

import com.licw.model.ACMTemplateModel;
import com.licw.utils.FileUtil;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.IOException;

/**
 * 动态文件生成测试
 *
 * @author licw
 * @createDate 2023/11/20
 */
public class DynamicGeneratorTest {

    @Test
    public void generateDynamicFile() throws TemplateException, IOException {
        String templatePath = FileUtil.getResourcesFolderPath() + "templates/ACMTemplates/MainTemplate.java.ftl";
        String outputPath = "X:/inf-generate/generate/MainTemplate.java";
        ACMTemplateModel model = new ACMTemplateModel("licwTest", "out", false);
        DynamicGenerator.generateDynamicFile(templatePath, outputPath, model);
    }
}