package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        MyApplication myApplication = new MyApplication();
        myApplication.start();
    }
}
