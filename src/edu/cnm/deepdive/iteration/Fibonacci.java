package edu.cnm.deepdive.iteration;

import java.math.BigInteger; //not a wrapper class, will not convert long

public class Fibonacci {

  public static BigInteger rabbits(int generation) {
    BigInteger prev = BigInteger.ONE;
    BigInteger current = BigInteger.ZERO;
    for (int i = 0; i < generation; i++) {
      BigInteger temp = prev.add(current); //.add to add BigInt
      prev = current;
      current = temp;
    }
    return current;
  }

}
