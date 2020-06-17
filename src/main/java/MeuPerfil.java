import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MeuPerfil {
	private static MeuPerfilPage page;
	private static WebDriver driver;
	private static LoginPacientePage pages;
	
	
	@Before
	public void acesso() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Juliana\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://portal-terapeutico-paciente.netlify.app/");
	page = new MeuPerfilPage(driver);
	pages = new LoginPacientePage(driver);
	
	}
	@Test
	public void AlterarPerfil() {	
		pages.logarCom("juliana.dornelas@gmail.com", "123456");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div[1]/div[1]/div/aside/div/div/a")));
		pages.meuPerfilBotaoEntrar();
		//Assert.assertEquals("477.115.548-23", driver.findElement(By.name("cpf")));
		//page.nome());
		page.nomeClick();
		page.nomeClicado();
		page.nome("Juliana Dornelas - Teste");
		page.senhaClick();
		page.senha("123456");
		page.senhaNovaClick();
		page.senhaNova("1234567");
		page.senhaConfirmacapClick();
		page.senhaConfirmacao("1234569");
		page.clicarAtualizarPerfil();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div[2]/div/div")));
		
	}
}