package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.SecureRandom;

import util.Utils;


public class ZeroKnowledgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input your password");
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		int x = 0;
		try {
			String inputString = input.readLine();
			x = Integer.parseInt(inputString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utils util = new Utils();
		util.init();
		BigInteger p = util.generatePrime(8);
		BigInteger g = util.getGenerator(8);
		
		long y =  util.getFunctionValue(p, g, x);
		System.out.println("y is " + y);
		
		int rounds = 10;
		
		for (int i = 0; i < rounds; i++) {
			BigInteger r = util.generateRandom(8);
			long C = util.getFunctionValue(p, g, r.intValue());
		}
		
	
	}
}
