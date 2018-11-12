package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroKnowledgeNarhwal {
    public static void main(String[] args) {
        // Assumed single Client.
        System.out.println("Input your password");
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        int password = 0;
        try {
            String inputString = input.readLine();
            password = Integer.parseInt(inputString);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
