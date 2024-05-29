package org.example.esercizio1_adapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Info info = new Info("gio", "gionny", LocalDate.of(2000, 10, 1));

        UserData userData = new UserData();

        Adapter adapter = new Adapter(info);

        userData.getData(adapter);
        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());


    }
}
