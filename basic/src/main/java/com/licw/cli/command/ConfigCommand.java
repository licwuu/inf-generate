package com.licw.cli.command;

import com.licw.model.ACMTemplateModel;
import lombok.Data;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.lang.reflect.Field;

/**
 * 查看配置命令
 *
 * @author licw
 * @createDate 2023/11/20
 */
@Data
@Command(name = "config", description = "generate config", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable {

    public void run() {
        Field[] fields = ACMTemplateModel.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getSimpleName() + ":" + field.getName());
        }
    }

    public static void main(String[] args) {
        new CommandLine(new ConfigCommand()).execute();

    }

}
