package com.licw.cli.command;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.licw.generator.ACMGenerator;
import com.licw.model.ACMTemplateModel;
import freemarker.template.TemplateException;
import lombok.Data;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.IOException;

/**
 * 生成命令
 *
 * @author licw
 * @createDate 2023/11/20
 */
@Data
@Command(name = "generate", description = "generate code", mixinStandardHelpOptions = true)
public class GenerateCommand implements Runnable {
    @Option(names = {"-a", "--author"}, description = "author", interactive = true, arity = "0..1")
    private String author = "author";

    /**
     * 输出提示语句
     */
    @Option(names = {"-o", "--output"}, description = "output", interactive = true, arity = "0..1")
    private String outputHint = "output: ";

    /**
     * 是否有while循环输入
     */
    @Option(names = {"-l", "--loop"}, description = "has loop or not", interactive = true, arity = "0..1")
    private Boolean hasLoop = true;

    @Option(names = {"-p", "--path"}, description = "file dest path, default current path", interactive = true, arity = "0..1")
    private String destPath;

    public void run() {
        ACMTemplateModel model = new ACMTemplateModel(author, outputHint, hasLoop);
        if (StrUtil.isBlank(destPath)){
            destPath = ".";
        }
        destPath = FileUtil.getAbsolutePath(destPath);
        System.out.println(destPath);
        try {
            ACMGenerator.doGenerate("ACMTemplates", destPath, model);
        } catch (TemplateException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new CommandLine(new GenerateCommand()).execute( "-p");

    }

}
