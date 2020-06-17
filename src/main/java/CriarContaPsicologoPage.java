import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarContaPsicologoPage {
	private WebDriver driver;
	
	public CriarContaPsicologoPage(WebDriver driver) {
		this.driver = driver;
	}
	public CriarContaPsicologoPage preencherNome(String nome) {
		driver.findElement(By.id("name")).sendKeys(nome);
		return this;
	}
	public CriarContaPsicologoPage preencherCrp(String crp) {
		driver.findElement(By.id("crp")).sendKeys(crp);
		return this;
	}
	public CriarContaPsicologoPage preencherEmail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}
	public CriarContaPsicologoPage preencherSenha(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
		}
	public CriarContaPsicologoPage preencherCpf(String cpf) {
		driver.findElement(By.name("cpf")).sendKeys(cpf);
		return this;
		}
	public CriarContaPsicologoPage preencherTelefone(String telefone) {
		driver.findElement(By.name("telephone")).sendKeys(telefone);
		return this;
		}
	public CriarContaPsicologoPage preencherCelular(String celular) {
		driver.findElement(By.id("cellphone")).sendKeys(celular);
		return this;
		}
	public void clicarTelefone() {
		driver.findElement(By.name("telephone")).click();
			}
	public void clicarCelular() {
		driver.findElement(By.id("cellphone")).click();
		}
	public void clicarCriarContaCadastro() {
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/form/button")).click();
			}
	public void clicarCpf() {
		driver.findElement(By.name("cpf")).click();
	}
	
}
