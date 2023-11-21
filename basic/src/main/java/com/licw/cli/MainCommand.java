package com.licw.cli;

import com.licw.cli.command.ConfigCommand;
import com.licw.cli.command.GenerateCommand;
import com.licw.cli.command.ListCommand;
import picocli.CommandLine;
import picocli.CommandLine.*;

/**
 * 主命令
 *
 * @author licw
 * @createDate 2023/11/21
 */
@Command(mixinStandardHelpOptions = true)
public class MainCommand implements Runnable{
    private final CommandLine commandLine = new CommandLine(this);
    {
        commandLine.addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        commandLine.execute("--help");
    }

    public void doExecute(String[] args){
        commandLine.execute(args);
    }
}
