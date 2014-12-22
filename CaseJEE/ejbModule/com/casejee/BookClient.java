package com.casejee;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BookClient {
	public static void main(String[] args) {
		Context context;
		try {
			context = new InitialContext();
			BookBeanRemote beanRemote = (BookBeanRemote) context
					.lookup(BookBean.RemoteJNDIName);
			beanRemote.test();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
