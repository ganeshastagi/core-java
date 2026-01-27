package com.OOPS.ExceptionHandling;

import java.io.IOException;

public class Throws {
    public static void main(String[] args) {

        // While throw is used to intentionally throw an error, throws is used to let the caller method handle the exceptions.
        Library obj = new Library();
        obj.firstPage();
    }
}

class Library{

    public void Login() throws IOException {

    }

    public void firstPage() {
        try {
            Login();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

