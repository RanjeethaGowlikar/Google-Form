package demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        driver.get("https://forms.gle/wjPkzeSEk1CM7KgGA");
        Thread.sleep(3000);
        String GoogleForm = driver.getCurrentUrl();
        Thread.sleep(3000);
        if(GoogleForm.contains("viewform")){
            System.out.println("Url is successfully opened");
        }else{
            System.out.println("Url is not opened"); 
        }
        System.out.println("End Test case: testCase01");
    }
    public  void testCase02() throws InterruptedException{
        System.out.println("Start Test case: testCase02");
        WebElement Name = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
        Thread.sleep(3000);
        Name.sendKeys("ranjeetha");
        Thread.sleep(3000);
        System.out.println("End Test case: testCase02");
    }
    public  void testCase03() throws InterruptedException{
       
        System.out.println("Start Test case: testCase03");
         String message = "I want to be the best QA Engineer!";
         String  fullmsg=message + getCurrentEpochTime();
        Thread.sleep(3000);
        WebElement time = driver.findElement(By.xpath("(//textarea[@aria-label='Your answer'])[1]"));
        time.sendKeys(fullmsg);
        Thread.sleep(3000);
        System.out.println("End Test case: testCase03");

}
public String getCurrentEpochTime(){
    return String.valueOf(System.currentTimeMillis()/1000);
}
public  void testCase04() throws InterruptedException{
       System.out.println("Start Test case: testCase04");
       Thread.sleep(2000);
       WebElement experience = driver.findElement(By.xpath("(//div[@class = 'AB7Lab Id5V1'])[1]"));
       experience.click();
       Thread.sleep(2000);
       System.out.println("End Test case: testCase04");
}
public  void testCase05() throws InterruptedException{
    System.out.println("Start Test case: testCase05");
    Thread.sleep(3000);
    WebElement java =driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]"));
    if (!java.isSelected()) {
        java.click();
    }
    Thread.sleep(3000);
    WebElement Selenium =driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]"));
    if (!Selenium.isSelected()) {
        Selenium.click();
    }
    Thread.sleep(3000);
    WebElement TestNG =driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[4]"));
    if (!TestNG.isSelected()) {
        TestNG.click();
    }
    Thread.sleep(3000);
    System.out.println("End Test case: testCase05");
}
public  void testCase06() throws InterruptedException{
    System.out.println("Start Test case: testCase06");
    Thread.sleep(3000);
 WebElement dropDown = driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']"));
 dropDown.click();
 Thread.sleep(3000);

List<WebElement> options = driver.findElements(By.xpath("//div[@jsname='wQNmvb']"));
Thread.sleep(3000);
for(int i=0;i<options.size();i++){
    if(options.get(i).getText().contains("Mrs")){
        options.get(i).click();
        
        System.out.println("Mrs is clickable");
        break;
    }
}
    System.out.println("End Test case: testCase06");


}
public  void testCase07() throws InterruptedException{
    System.out.println("Start Test case: testCase07");
    Thread.sleep(3000);
      LocalDate currDate = LocalDate.now();
        LocalDate DateMinus7Days = currDate.minusDays(7);

        DateTimeFormatter datechange = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = DateMinus7Days.format(datechange);
        WebElement Date = driver.findElement(By.xpath("(//input[@type='date'])[1]"));
        Date.sendKeys(formattedDate);
        Thread.sleep(3000);
        System.out.println("End Test case: testCase07");
}
public  void testCase08() throws InterruptedException{
    System.out.println("Start Test case: testCase07");
LocalDateTime currTime = LocalDateTime.now();
int currentHour = currTime.getHour(); 
int currentMinute = currTime.getMinute();
String formatehour = String.format("%02d", currentHour); // Format with leading zero if needed
        String formatmin = String.format("%02d", currentMinute);
WebElement hour = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
hour.sendKeys(formatehour);
WebElement Minute = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
Minute.sendKeys(formatmin);
Thread.sleep(3000);
System.out.println("End Test case: testCase07");
}

 public  void testCase09() throws InterruptedException{
     System.out.println("Start Test case: testCase09");
     Thread.sleep(3000);
WebElement submitbtn = driver.findElement(By.xpath("//span[text()='Submit']"));
submitbtn.click();
Thread.sleep(2000);
System.out.println("End Test case: testCase09");
}
public  void testCase10() throws InterruptedException{
    System.out.println("Start Test case: testCase10");
    WebElement successMsg = driver.findElement(By.xpath("//div[@class='RH5hzf RLS9Fe']"));
    Thread.sleep(3000);
String SuccMsg =successMsg.getText();
Thread.sleep(5000);
System.out.println("End Test case: testCase10");


}
}