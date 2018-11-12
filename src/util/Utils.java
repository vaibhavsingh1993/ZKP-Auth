package util;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Utils {
	private static SecureRandom rand = null;
	
	public void init() {
		rand = new SecureRandom();
	}
	
	public BigInteger generatePrime(int bits) {

	    BigInteger c = new BigInteger(bits, rand);
	    for (; ; ) {
	        if (c.isProbablePrime(1) == true) break;
	        c = c.subtract(new BigInteger("1"));
	    }
	    return (c);
	}
	
	public BigInteger getGenerator(int bits) {
	    return new BigInteger(bits, rand);
	}

	public long powerN(int number, int power) {
		  return (long) Math.pow(number, power);
	}
	
	public BigInteger generateRandom(int bits) {
	    return new BigInteger(bits, rand);
	}
	
	public long getFunctionValue(BigInteger p, BigInteger g, int x) {
		return Math.floorMod(powerN(g.intValue(), x), p.longValue());
	}
}
