package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Scanner;

public class MyApplication {
    // users - a list of users
    private Scanner sc = new Scanner(System.in);
    private User signedUser;
    private LinkedList<User> userLinkedList;

    private void addUser(User user) {
        userLinkedList.add(user);
    }

    public MyApplication() {
        userLinkedList = new LinkedList<>();
    }

    public void menu() throws FileNotFoundException, UnsupportedEncodingException {
        sc = new Scanner(System.in);
        System.out.println("Welcome to Car factory!");
        System.out.println("What you will should buy?");
        while(true){
            System.out.println("We have 3 models," +
                    "rabbit,lion,puma");
            System.out.println("1.Buy model Enzo");
            System.out.println("2.Buy model 250gt");
            System.out.println("3.Buy F8 Spider");
            int a = sc.nextInt();
            if(a == 1){
                Characteristic characteristic = new Characteristic(15,2,"E-150",15);
                choice(characteristic);
            }
            if(a == 2){
                Characteristic characteristic = new Characteristic(15,2,"E-150",15);
                choice(characteristic);
            }
            if(a == 3){
                Characteristic characteristic = new Characteristic(15,2,"E-150",15);
                choice(characteristic);
            }
            else{
                System.out.println("You chosed a wrong number");
                menu();
            }
        }
    }

    private void userProfile() throws FileNotFoundException, UnsupportedEncodingException {
        while(true){
            System.out.println("1.Log off");
            int choice = sc.nextInt();
            if(choice == 1) logOff();
        }
    }

    private void logOff() throws FileNotFoundException, UnsupportedEncodingException {
        signedUser = null;
        start();
    }

    private void authentication() {
        while (true) {
            System.out.println("1.Sign in");
            System.out.println("2.Sign up");
            int choice =sc.nextInt();
            if(choice == 1) signIn();
            else signUp();
        }
    }

    private void signIn() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        String password = scanner.next();
        Password password1 = new Password(password);
        for(User user : userLinkedList){
            if(username.equals(user.getUsername()) && password1.equals(user.getPassword())){
                signedUser = user;
                
            }
        }
    }
//
//    private String username,name,surname;
//    private static int id =0;
//    private Password password;

    private void signUp() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        String username = scanner.next();
        String name = scanner.next();
        String surname =scanner.next();
        if(password != null && username != null && name != null &&surname != null){
            User user = new User();
            user.setName(name);
            user.setSurname(surname);
            user.setUsername(username);
            Password password1 = new Password(password);
            user.setPassword(password1);
            if(password1.checkPassword(user)){
                addUser(user);
                authentication();
            }
        }
    }

    public void start() throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("C:\\Users\\77479\\Desktop\\allFiles\\IdeaProjects\\OOpp\\src\\com\\company\\db.txt");
        Scanner fileScanner = new Scanner(file);
        // fill userlist from db.txt

        while (true) {
            System.out.println("Welcome to my application!");
            System.out.println("Select command:");
            System.out.println("1. Menu");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                menu();
            } else {
                break;
            }
        }

        saveUserList();
    }

    private void saveUserList() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter("db.txt","UTF-8");
        for(User user : userLinkedList){
            printWriter.println("Username "+user.getUsername() + ",name" + user.getName() + ",surname" + user.getSurname()
            + ",password" + user.getPassword());
        }
        printWriter.close();
    }
    private void choice(Characteristic characteristic) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("The characteristics of this model is: "+characteristic.getPower() + " "
        + characteristic.getModelEngine()+ " "+characteristic.getType()+ " "+characteristic.getTireRadius()+ " ");
        System.out.println("1.But it");
        System.out.println("2.Return");
        System.out.println("3.Log out");
        int a = sc.nextInt();
        switch (a){
            case 1:{
                System.out.println("Congratulations");
                menu();
            }
            case 2:{
                menu();
            }
            case 3:{
                logOff();
            }
            default:
                menu();
        }
    }
}
