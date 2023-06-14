package com.skillstorm.training.week10.day5;

import java.io.IOException;
import java.sql.SQLException;

class NewException extends Exception {
}

class AnotherException extends Exception {
}

public class ExceptionTest {
	public static void main(String[] args) throws Exception {
		try {
			m2();
		} catch (Exception e) {
			throw new NullPointerException();
		} finally {
			m3();
		}
	}

	public static void m2() throws NewException {
		throw new NewException();

	}

	public static void m3() throws AnotherException {
		throw new AnotherException();
	}

//	void m1() throws Exception {
//		try {
//			// line1
//		} catch (IOException e) {
//			throw new SQLException();
//		} catch (SQLException e) {
//			throw new InstantiationException();
//		} finally {
//			throw new CloneNotSupportedException(); // this is not a RuntimeException.
//		}
//	}

	void myMethod() throws IOException {
		throw new IOException();
	}

	void myMethod2() throws IOException {
		throw new IOException();
	}
}