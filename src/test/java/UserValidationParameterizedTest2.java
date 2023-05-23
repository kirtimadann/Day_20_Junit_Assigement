
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class UserValidationParameterizedTest2 {
    String emailId ;

    UserValidation userValidation2;

    public UserValidationParameterizedTest2(String emailId) {
        super();
        this.emailId = emailId;

    }

    @Before
    public void initialize(){
        userValidation2 = new UserValidation();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new String[] {"abc.xyz@gmail.com" , "abc@gm.co.in"} );
    }

    @Test
    public void givenMultipleEmailId_WhenProper_ShouldReturnTrue(){
        System.out.println();
        Assert.assertEquals(true,userValidation2.validateEmailId(emailId));
    }
}
