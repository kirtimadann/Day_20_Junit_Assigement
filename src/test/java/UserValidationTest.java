
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class UserValidationTest {

    UserValidation user = new UserValidation();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateFirstName("Romil");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateFirstName("romil");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateLastName("Ghadge");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateLastName("ghadge");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateEmailId("abc.xyz@bridgelabz.co.on");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateEmailId("abc@xyz@bridgelabz.co.on");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateMobileNumber("91 1233243234");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateMobileNumber("12345432123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        boolean result = user.validatePassword("Rakya@11");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validatePassword("@@rerere11");
        Assert.assertFalse(result);
    }

}
