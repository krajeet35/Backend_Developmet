package com._201;

import java.util.function.Function;

public class Function1 implements Function<Student, String> {

	@Override
	public String apply(Student t) {
		String res=t.getMarks()<500 ? "Fail" :"Pass";
		return res;
	}

	

	

}
