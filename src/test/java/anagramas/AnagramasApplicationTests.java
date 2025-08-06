package anagramas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnagramasApplicationTests {

	@Test
	void main_deveExecutarSemErros() {
		AnagramasApplication.main(new String[]{});
	}

}
