package scot.macpherson.starter.springbootgroovy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Integration test for App class.
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class AppTestIT {

    @Autowired
    WebApplicationContext context;

    /**
     * Should boot up without errors.
     */
    @Test
    public void shouldBootUpWithNoErrors()
    {
        assertThat(context).isNotNull();
    }
}
