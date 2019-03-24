package _03_Printing_Binary;

import java.util.ArrayList;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		byte b = 14;
		printByteBinary(b);
		System.out.println("Next:");
		short e = 19;
		printShortBinary(e);
		System.out.println("Next:");
		int a = 1842;
		printIntBinary(1842);
		System.out.println("Next:");
		printLongBinary(1239871248);
	}
	public static void printByteBinary(byte b) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 8; i >= 0; i--) {
			list.add((b & 1<<(i)) >> i);
		}
		for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i));	
		}
		
	}
	
	public static void printShortBinary(short s) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 16; i >= 0; i--) {
			list.add((s & 1<<(i)) >> i);
		}
		for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i));	
		}
	}
	
	public static void printIntBinary(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i1 = 32; i1 >= 0; i1--) {
			list.add((i1 & 1<<(i1)) >> i1);
		}
		for (int i1 = 0; i1 < list.size(); i1++) {
		System.out.print(list.get(i1));	
		}
	}
	
	public static void printLongBinary(long l) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i1 = 64; i1 >= 0; i1--) {
			list.add((i1 & 1<<(i1)) >> i1);
		}
		for (int i1 = 0; i1 < list.size(); i1++) {
		System.out.print(list.get(i1));	
		}
	}
}
