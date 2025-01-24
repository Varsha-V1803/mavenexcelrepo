package mavenexcel;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args) throws IOException {
		System.out.println(Excelread.stringmethod(1, 0));
		System.out.println(Excelread.intmethod(1, 1));
		System.out.println(Excelread.stringmethod(2, 0));
		System.out.println(Excelread.intmethod(2, 1));
		System.out.println(Excelread.stringmethod(3, 0));
		System.out.println(Excelread.intmethod(3, 1));
		System.out.println(Excelread.stringmethod(4, 0));
		System.out.println(Excelread.intmethod(4, 1));
	}

}
