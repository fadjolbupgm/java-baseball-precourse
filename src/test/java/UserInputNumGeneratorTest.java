import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserInputNumGeneratorTest {
    private UserInputNumGenerator generator;

    @Before
    public void setUp(){
        generator = new UserInputNumGenerator(BaseballGame.DEFAULT_LEN);
    }

    @Test
    public void generatorCanValidate(){
        generator.validate("123");
    }

    //유효성 검사 1. 널이 아닌가?
    @Test
    public void validateNotNull(){
        assertEquals(generator.validate("123"), true);
        assertEquals(generator.validate(null), false);
    }
    //유효성 검사 2. 게임에서 지정한 길이인가?
    @Test
    public void validateIsMaxLen(){
        assertEquals(generator.validate("123"), true);
        assertEquals(generator.validate("12"), false);
        assertEquals(generator.validate("1234"), false);
    }

    //유효성 검사 3. 문자열이 1~9까지의 숫자들로 이루어져 있는가
    //유효성 검사 4. 문자열이 서로 다른 숫자로 이루어져 있는가
}
