package com.test.generics;

import java.util.List;

public class ClassC<T extends ClassA> {
	List <? extends T> ls;
	List <? super T> ls1;
}
