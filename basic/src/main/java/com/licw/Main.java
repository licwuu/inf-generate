package com.licw;

import com.licw.cli.MainCommand;

public class Main {
    public static void main(String[] args) {
        MainCommand mainCommand = new MainCommand();
        mainCommand.doExecute(args);
    }
}