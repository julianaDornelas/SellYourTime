import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPaciente {
	
	private static LoginPacientePage page;
	private static WebDriver driver;
	
	@Before
	public void preCondicao() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Juliana\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://portal-terapeutico-paciente.netlify.app/");
	page = new LoginPacientePage(driver);
	}
	
	@Test
	public void logarComSucesso() {	
		page.logarCom("juliana.dornelas@gmail.com", "123456");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-AxmLO gmtmqV']")));
		
	}
	@Test
	public void logarSenhaSenhaSucesso() {	
		page.logarCom("juliana.dornelas@gmail.com", "1234567");
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div[2]/div/div/div[1]")));
	
	}
	@Test
	public void logarEmailSemSucesso() {
		page.logarCom("juliana.adjdkjf@gmail.com", "1234560");
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div[2]/div/div/div[1]")));
	
	}

	@Test
	public void logarSemDadosNok() {
	page.logarCom("", "");
	Assert.assertEquals("O e-mail é obrigatório", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/form/span[1]")).getText());
	Assert.assertEquals("A senha é obrigatoria", driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div/form/span[2]")).getText());

}	@Test
	public void logarSemSenhaNok() {
	page.logarCom("juliana.dornelas@gmail.com", "");
	Assert.assertEquals("A senha é obrigatoria", driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div/form/span")).getText());

}
	@Test
	public void logarSemEmailNok() {
	page.logarCom("", "123456");
	Assert.assertEquals("O e-mail é obrigatório", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/form/span[1]")).getText());
	
}
	@After
	public void finalizando(){
	driver.quit();
	}
}
	
