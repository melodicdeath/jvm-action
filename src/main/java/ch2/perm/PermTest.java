package ch2.perm;

import java.util.HashMap;

/**
 * JDK1.6 1.7 -XX:+PrintGCDetails -XX:PermSize=5M -XX:MaxPermSize=5m
 * 
 * JDK1.8 -XX:+PrintGCDetails -XX:MaxMetaspaceSize=5M
 *
 *
 * @author Geym
 *
 */
public class PermTest {
	public static void main(String[] args) {
		int i = 0;
		try {
			for (i = 0; i < 100000; i++) {
				//动态产生类，不仅仅是类的实例。由于类的信息（字段、方法、字节码）保存在方法区
				//因此，这个操作会占用方法区的空间
				CglibBean bean = new CglibBean("geym.zbase.ch2.perm" + i, new HashMap());
			}
		} catch (Exception e) {
			System.out.println("total create count:" + i);
			throw e;
		}
	}
}
