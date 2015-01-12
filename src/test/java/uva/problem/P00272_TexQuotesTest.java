package uva.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P00272_TexQuotesTest {

	@Test
	public void should_format_input() {
		P00272_TexQuotes main = new P00272_TexQuotes();
		
		StringBuilder output = new StringBuilder();
		
		for (String line : input()) {
			output.append(main.format(line));
		}

		assertEquals(expectedOutput(), output.toString());
	}

	private String[] input() {
		return new String[] { 
			"\"To be or not to be,\" quoth the Bard, \"that\n",
			"is the question\".\n",
			"The programming contestant replied: \"I must disagree.\n",
			"To `C' or not to `C', that is The Question!\""};
	}
	
	private String expectedOutput() {
		return "``To be or not to be,'' quoth the Bard, ``that\n"
			+ "is the question''.\n"
			+ "The programming contestant replied: ``I must disagree.\n"
			+ "To `C' or not to `C', that is The Question!''";
	}
}
