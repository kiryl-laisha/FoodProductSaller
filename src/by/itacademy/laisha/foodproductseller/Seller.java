package by.itacademy.laisha.foodproductseller;

import by.itacademy.laisha.foodproductseller.account.AccountInitialization;
import by.itacademy.laisha.foodproductseller.services.*;
import by.itacademy.laisha.foodproductseller.utils.*;

public final class Seller {

    public static void main(String[] args) {

        //Account initialization
        try {
            if (AccountInitialization.initializeAccount()) {
                // databases loading
                Manager.loadDatabases();
                // working in main menu
                Manager.workInMainMenu(); // TODO use boolean
            }
        } catch (Exception exception) {  //TODO set the necessary exception (NoSuchElementException?)
            Logger.log("Main menu or account authorization error.");
            System.out.println("System error, restart, please.");
        }
    }
}