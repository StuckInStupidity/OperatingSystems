package fr.darkeye.conversion;

import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the amont of unit: ");
    int nb = sc.nextInt();
    System.out.println("enter the type of unit: ");
    String str = sc.next();
    switch (str) {
    	case "kgs":
    		System.out.println("result: " + nb * 2.205 + " lbs");
    		break;
    	case "lbs":
    		System.out.println("result: " + nb / 2.205 + " kgs");
    		break;
    	case "feet":
    		System.out.println("result: " + nb * 0.3048 + " meters");
    		break;
    	case "meters":
    		System.out.println("result: " + nb / 0.3048 + " feet");
    		break;
    	case "miles":
    		System.out.println("result: " + nb * 1.609 + " kms");
    		break;
    	case "kms":
    		System.out.println("result: " + nb / 1.609 + " miles");
    		break;
    	default:
    		System.out.println("Wrong type");
    }
    sc.close();
  }
}
