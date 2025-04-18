package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

//comment

/**
 * Javadoc
 */

//todo
@TestInstance(PER_CLASS)
public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
    }

    @AfterAll
    public void afterAll() {
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
    }
    @Test
    public void openTheOrgPageAndCheckTheTitle() {
    }
}
