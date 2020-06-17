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


public class CriarContaPaciente {
	private static CriarContaPacientePage page;
	private static WebDriver driver;
	
	@Before
	public void acesso() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Juliana\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://portal-terapeutico-paciente.netlify.app/");
	page = new CriarContaPacientePage(driver);
	
	}
	@Test
	public void criarContaExistente() {	
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Ana Fernandes");
		page.preencherRg("352379521");
		page.preencherEmail("ana.fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/03/1971");
		page.preencherCpf("20583162070");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
	    wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='Toastify__toast Toastify__toast--error']")));
	
	}
	@Test
	public void criarContaSucesso() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
	    wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='Toastify__toast-container Toastify__toast-container--top-right']")));
	
	}
	@Test
	public void criarContaNOKSemDataNascimento() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("João Silva Amorim");
		page.preencherRg("462379521");
		page.preencherEmail("joao_silva@gmail.com");
		page.preencherSenha("123456");
		page.preencherCpf("94556149010");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("253");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("Data de nascimento é obrigatorio", driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div/div/form/div[3]/span")).getText());

	    
	}
	@Test
	public void criarContaSucessoSemTelefone() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("João Ferreira");
		page.preencherRg("462379521");
		page.preencherEmail("joao_ferreira@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("02/01/1982");
		page.preencherCpf("95507046026");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("253");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
	    wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='Toastify__toast-container Toastify__toast-container--top-right']")));
	}
	@Test
	public void criarContaNOKSemNome() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
	    Assert.assertEquals("O nome é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[1]/span[1]")).getText());
	}
	@Test
	public void criarContaNOKSemRg() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O rg é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[1]/span")).getText());
	}
	@Test
	public void criarContaNOKSemEmail() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O e-mail é obrigatório", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[2]/span")).getText());

	}
	@Test
	public void criarContaNOKSemSenha() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("A senha é obrigatoria", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[2]/span")).getText());

	}
	@Test
	public void criarContaNOKNomeResponsavel() {//validação menor de idade
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/2008");
		page.preencherCpfResponsável("71239883021");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div[2]/div/div[1]/div[1]")));
		Assert.assertEquals("Cpf e nome do responsável são obrigatorios", driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[1]/div[1]")).getText());

	}
	@Test
	public void criarContaNOKCpfResponsavel() {//validação menor de idade
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/2008");
		page.preencherNomeResponsável("Ricardo Almeida");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div[2]/div/div[1]/div[1]")));
		Assert.assertEquals("Cpf e nome do responsável são obrigatorios", driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[1]/div[1]")).getText());

	}
	@Test
	public void criarContaNOKCPF() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O cpf é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[5]/span")).getText());

	}
	@Test
	public void criarContaNOKCelular() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O Celular é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[6]/span[1]")).getText());

	}
	@Test
	public void criarContaNOKCEP() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O cep é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[6]/span")).getText());

	}
	@Test
	public void criarContaNOKRua() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("A rua é obrigatoria", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[7]/span")).getText());

	}
	@Test
	public void criarContaNOKNumero() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O numero é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[7]/span")).getText());

	}
	@Test
	public void criarContaNOKBairro() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O bairro é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[8]/span")).getText());

	}
	@Test
	public void criarContaNOKEstado() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherCidade("São Paulo");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("O estado é obrigatorio", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[9]/span[1]")).getText());

	}
	@Test
	public void criarContaNOKCidade() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.clicarCriarContaCadastro();
		Assert.assertEquals("A cidade é obrigatoria", driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/div[9]/span")).getText());
	}
	@Test
	public void jaTenhoLogin() {
		WebElement criarConta = driver.findElement(By.linkText("Criar conta gratuita"));
		criarConta.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		page.preencherNome("Ana Fernandes Amorim");
		page.preencherRg("352379521");
		page.preencherEmail("ana_fernandes@gmail.com");
		page.preencherSenha("123456");
		page.preencherDataNascimento("19/04/1979");
		page.preencherCpf("75998746074");
		page.clicarTelefone();
		page.preencherTelefone("1132420491");
		page.clicarCelular();
		page.preencherCelular("1167543210");
		page.clicarCep();
		page.preencherCep("02526900");
		page.preencherRua("Rua das Azaléias");
		page.preencherNumero("204");
		page.preencherComplemento("casa 2");
		page.preencherBairro("Casa Verde");
		page.preencherEstado("SP");
		page.preencherCidade("São Paulo");
		page.clicarJaTenhoLogin();
	    wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	
	}
	@After
	public void finalizando(){
	driver.quit();
	}
}
