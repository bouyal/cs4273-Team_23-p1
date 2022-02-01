import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class simpleCsvTest {
	private simpleCsvParser csvParser = new simpleCsvParser();

	@ParameterizedTest(name = "#{index} - Run test with args={0}")
    	@ValueSource(strings = {
		"\"abc\",\"def\",\"ghi\",\"jkl\",\"mno\"",
            	"abc,def,ghi,jkl,mno",
            	"abc,def,\"ghi\",jkl,mno"
    	}
    	)
	void csv_test1(String line) throws Exception {
        	String[] result = parser.parseLine(line);
        	assertEquals(5, result.length);
        	assertEquals("aa", result[0]);
        	assertEquals("bb", result[1]);
        	assertEquals("cc", result[2]);
        	assertEquals("dd", result[3]);
        	assertEquals("ee", result[4]);
    	}
}	

