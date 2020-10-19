import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirsttestCase {

    @Test(priority = 1)
    void  setup(){
        WebDriver driver = new ChromeDriver();
        try  {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        try  {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.id("identifierId")).sendKeys("farhad.mangrovesystemsbd");
        try  {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        try  {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("farhad.mangrovesystemsbd@gmail.com");
        try  {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
//        Thread.sleep(4000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "gmail";
        driver.close();
        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Test successful");
        }else {
            System.out.println("Test fails");

        }

        System.out.println("opening browser");

    }

    @Test(priority = 2)
    void  login(){

        System.out.println("This is login test");

    }

    @Test(priority = 3)
    void  tearDown(){

        System.out.println("closing browser");
    }
}
