package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String versionString = System.getProperty("java.specification.version");
        Double version = Double.parseDouble(versionString);
        return version;
    }

    public static void main(String[] args) {
	    System.out.println((getVersion()));
    }
}
