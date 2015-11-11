package com.tdder.learning.xxxx;

import jp.sourceforge.hotchpotch.coopie.logging.Logger;
import jp.sourceforge.hotchpotch.coopie.logging.LoggerFactory;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author manhole
 */
public class ExampleTest {

	private static final Logger logger = LoggerFactory.getLogger();

	@Test
	public void example() throws Throwable {
		// ## Arrange ##
		final String s1 = "123";
		final String s2 = "45";

		// ## Act ##
		final String actual = s1 + s2;

		// ## Assert ##
		assertThat(actual, is("12345"));
	}

}
