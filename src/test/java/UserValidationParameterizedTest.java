
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserValidationParameterizedTest {

    String emailId ;

    UserValidation userValidation1;

    public UserValidationParameterizedTest(String emailId) {
        super();
        this.emailId = emailId;

    }

    @Before
    public void initialize(){
        userValidation1 = new UserValidation();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new String[] {"abc@xyz@gmail.com" , ".abc@gm.co.in." ,"abc..xyz@gmail.com"} );
    }

    @Test
    public void givenMultipleEmailId_WhenNotProper_ShouldReturnFalse(){
        System.out.println();
        Assert.assertEquals(false,userValidation1.validateEmailId(emailId));
    }

}
