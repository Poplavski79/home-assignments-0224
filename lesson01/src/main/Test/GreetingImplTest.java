import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson01.GreetingImpl;

import java.util.Arrays;

public class GreetingImplTest {

    private final GreetingImpl myGreeting = new GreetingImpl();

    @Test
    public void getFirstNameTest() {

        Assert.assertEquals("Алексей", myGreeting.getFirstName());
        Assert.assertNotEquals("Андрей", myGreeting.getFirstName());

    }

    @Test
    public void getLastNameTest() {

        Assert.assertEquals("Поплавский", myGreeting.getLastName());

    }

    @Test
    public void getBirthYearTest() {

        Assert.assertEquals(1979, myGreeting.getBirthYear());
    }

    @Test
    public void getHobbiesTest() {

        Assert.assertEquals(Arrays.asList("Картины по номерам", "Металлические пазлы"), myGreeting.getHobbies());
    }

    @Test
    public void getRepoURLTest() {
        Assert.assertEquals("https://github.com/Poplavski79/home-assignments-0224/blob/develop/",
                myGreeting.getRepoUrl());

    }

    @Test
    public void getPhoneTest() {

        Assert.assertEquals("+7(952)902-50-79", myGreeting.getPhone());
    }

    @Test
    public void getCourseExpectationsTest() {

        Assert.assertEquals(Arrays.asList("Возможность создавать проекты на языке JAVA",
                        "Понимание framework"),
                myGreeting.getCourseExpectations());
    }


}
