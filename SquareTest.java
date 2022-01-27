import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SquareTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/squareData.csv")
	void isSquareCSVFile(
	  int input, int expected) {
	    int square = input * input;
	    assertEquals(expected, square);
	}

}
