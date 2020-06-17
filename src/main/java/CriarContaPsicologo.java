import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CriarContaPsicologo {
	private static CriarContaPsicologoPage page;
	private static WebDriver driver;
	
	@Before
	public void acesso() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Juliana\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://portal-terapeutico.netlify.app/");
	page = new CriarContaPsicologoPage(driver);
	}
	
	@Test
	public void criarContaExistente() {	
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Marta");
		page.preencherCrp("325082");
		page.preencherEmail("martamaria@gmail.com");
		page.preencherSenha("123456");
		page.preencherCpf("212.492.020-00");
		page.clicarTelefone();
		page.preencherTelefone("(11)3918-4013");
		page.clicarCelular();
		page.preencherCelular("(11)94928-3758");
		page.clicarCriarContaCadastro();
		wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='Toastify__toast Toastify__toast--error']")));
	}

	@Test
	public void criarContaSucesso() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Maria");
		page.preencherCrp("335012");
		page.preencherEmail("maria@gmail.com");
		page.preencherSenha("123456");
		page.preencherCpf("258.487.220-05");
		page.clicarTelefone();
		page.preencherTelefone("(11)3813-4013");
		page.clicarCelular();
		page.preencherCelular("(11)95928-3258");
		page.clicarCriarContaCadastro();
		wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='Toastify__toast-container Toastify__toast-container--top-right']")));
	
	}
	@Test
	public void criarContaNOKSemNome() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherCrp("335012");
		page.preencherEmail("maria@gmail.com");
		page.preencherSenha("123456");
		page.clicarCpf();
		page.preencherCpf("258.487.220-05");
		page.clicarTelefone();
		page.preencherTelefone("(11)3813-4013");
		page.clicarCelular();
		page.preencherCelular("(11)95928-3258");
		page.clicarCriarContaCadastro();
		//wait = new WebDriverWait(driver, 15);
	    Assert.assertEquals("O nome é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/span")).getText());
	}
	@Test
	public void criarContaNOKSemCRP() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Maria");
		page.preencherEmail("maria@gmail.com");
		page.preencherSenha("123456");
		page.preencherCpf("258.487.220-05");
		page.clicarTelefone();
		page.preencherTelefone("(11)3813-4013");
		page.clicarCelular();
		page.preencherCelular("(11)95928-3258");
		page.clicarCriarContaCadastro();
		//wait = new WebDriverWait(driver, 15);
	    Assert.assertEquals("O crp é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/span")).getText());
	}
	@Test
	public void criarContaSemEmail() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Maria");
		page.preencherCrp("335012");
		page.preencherSenha("123456");
		page.preencherCpf("258.487.220-05");
		page.clicarTelefone();
		page.preencherTelefone("(11)3813-4013");
		page.clicarCelular();
		page.preencherCelular("(11)95928-3258");
		page.clicarCriarContaCadastro();
		//wait = new WebDriverWait(driver, 15);
		Assert.assertEquals("O e-mail é obrigatório", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/span")).getText());
	}
	@Test
	public void criarContaSemSenha() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Maria");
		page.preencherCrp("335012");
		page.preencherEmail("maria@gmail.com");
		page.preencherCpf("258.487.220-05");
		page.clicarTelefone();
		page.preencherTelefone("(11)3813-4013");
		page.clicarCelular();
		page.preencherCelular("(11)95928-3258");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("A senha é obrigatoria", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/span")).getText());
	}
	@Test
	public void criarContaSemCPF() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Maria");
		page.preencherCrp("335012");
		page.preencherEmail("maria@gmail.com");
		page.preencherSenha("123456");
		page.clicarTelefone();
		page.preencherTelefone("(11)3813-4013");
		page.clicarCelular();
		page.preencherCelular("(11)95928-3258");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O cpf é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/span")).getText());
	}
	@Test
	public void criarContaSemCelular() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Maria");
		page.preencherCrp("335012");
		page.preencherEmail("maria@gmail.com");
		page.preencherSenha("123456");
		page.preencherCpf("258.487.220-05");
		page.clicarTelefone();
		page.preencherTelefone("(11)3813-4013");
		page.clicarCelular();
		page.preencherCelular("");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O Celular é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/span")).getText());
	}
	@After
	public void finalizando(){
	driver.quit();
	}
}


