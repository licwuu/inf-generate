package com.licw.cli.command;

import cn.hutool.core.io.FileUtil;
import lombok.Data;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.io.File;
import java.util.List;

/**
 * 擦好看生成文件列表命令
 *
 * @author licw
 * @createDate 2023/11/20
 */
@Data
@Command(name = "list", description = "list all files that while be generated", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable {

    public void run() {
        String dirPath = "templates/ACMTemplates";
        List<File> files = FileUtil.loopFiles(dirPath);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args) {
        new CommandLine(new ListCommand()).execute();
    }

}
