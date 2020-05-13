package section3;

public class ByteShortIntLong {

	public static void main(String[] args) {
		
		System.out.println("Integer Range");
		int myMin = Integer.MIN_VALUE;
		System.out.println("Minimum: " + myMin);
		
		int myMax = Integer.MAX_VALUE;
		System.out.println("Maximum: " + myMax);
		
		// overflow
		int myBustedMax = Integer.MAX_VALUE + 1;
		System.out.println("Busted Maximum Value: " + myBustedMax);

		// underflow
		int myBustedMin = Integer.MIN_VALUE - 1;
		System.out.println("Busted Maximum Value: " + myBustedMin);
		
		// throws error, number is out of range
		// int myMaxTest = 2147483648;
		
		
		byte myMinByte = Byte.MIN_VALUE;
		byte myMaxByte = Byte.MAX_VALUE;
		
		System.out.println("Byte Min: " + myMinByte);
		System.out.println("Byte Max: " + myMaxByte);
		
		short myMinShort = Short.MIN_VALUE;
		short myMaxShort = Short.MAX_VALUE;
		
		System.out.println("Short Min: " + myMinShort);
		System.out.println("Short Max: " + myMaxShort);
		
		long myLong = 100L;
		
		long myMinLong = Long.MIN_VALUE;
		long myMaxLong = Long.MAX_VALUE;
		
		System.out.println("Long Min: " + myMinLong);
		System.out.println("Long Max: " + myMaxLong);
		
		// need "L" to specify it's a long, otherwise
		// ide thinks it's an int value
		long bigLongLiteralValue = 2147483647234L;
		System.out.println(bigLongLiteralValue);
		
		short bigShortLiteralValue = 32767;
		System.out.println(bigShortLiteralValue);
		
		// Casting //
		System.out.println("************ Casting ****************");
		int myTotal = (myMin / 2);
		System.out.println(myTotal);
		
		byte myNewByteValue = (byte)(myMinByte / 2);
		System.out.println(myNewByteValue);
		
		short myNewShortValue = (short)(myMinShort / 2 );
		System.out.println(myNewShortValue);
		
		// Primitives Types Challenge
		System.out.println("\nPrimitives Types Challenge");
		byte byteVar = 125;
		short shortVar = 30;
		int intVar = 14327;
		
		// no casting needed
		long longSum = (50000) + ((byteVar + shortVar + intVar) * 10);
		System.out.println("Long Sum: " + longSum);
		
		short shortTotal = (short)(1000 + 10 * 
				(byteVar + shortVar + intVar));
		System.out.println("Short Total: " + shortTotal);
		
		
		
		
		
		
		
		
		
		
	}

}
