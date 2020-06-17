import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MeuPerfilPage {
	private WebDriver driver;
	
	public MeuPerfilPage(WebDriver driver) {
		this.driver = driver;
	}
	public MeuPerfilPage nome(String nome) {
		driver.findElement(By.id("name"));
		return this;
	}
	public MeuPerfilPage rg(String rg) {
		driver.findElement(By.id("rg"));
		return this;
		}
	public MeuPerfilPage email(String email) {
		driver.findElement(By.id("email"));
		return this;
		}
	public MeuPerfilPage cpf(String cpf) {
		driver.findElement(By.name("cpf"));
		return this;
		}
	public MeuPerfilPage telefone(String telefone) {
		driver.findElement(By.name("telephone"));
		return this;
		}
	public MeuPerfilPage celular(String celular) {
		driver.findElement(By.id("cellphone"));
		return this;
		}
	public MeuPerfilPage senha(String senha) {
		driver.findElement(By.id("oldPassword"));
		return this;
		}
	public MeuPerfilPage senhaNova(String senhaNova) {
		driver.findElement(By.id("password"));
		return this;
		}
	public MeuPerfilPage senhaConfirmacao(String senhaConfirmacao) {
		driver.findElement(By.id("confirmPassword"));
		return this;
		}
	public void clicarAtualizarPerfil() {
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div[2]/form[1]/button")).click();
		}
	public MeuPerfilPage cep(String cep) {
		driver.findElement(By.id("zip_code"));
		return this;
		}
	public MeuPerfilPage rua(String rua) {
		driver.findElement(By.name("street"));
		return this;
		}
	public MeuPerfilPage numero(String numero) {
		driver.findElement(By.name("number")).sendKeys(numero);
		return this;
		}
	public MeuPerfilPage complemento(String complemento) {
		driver.findElement(By.id("complement"));
		return this;
		}
	public MeuPerfilPage bairro(String bairro) {
		driver.findElement(By.id("neighborhood"));
		return this;
		}
	public MeuPerfilPage estado(String estado) {
		driver.findElement(By.id("state"));
		return this;
		}
	public MeuPerfilPage cidade(String cidade) {
		driver.findElement(By.id("city"));
		return this;
		}
	public void clicarAtualizarEndereco() {
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div[2]/form[2]/button[1]")).click();
		}
	public void sair() {
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div[2]/form[2]/button[2]")).click();
		}
	public void nomeClick() {
		driver.findElement(By.id("name")).clear();
	}
	public void senhaClick() {
		driver.findElement(By.id("oldPassword")).click();
		}
	public void senhaNovaClick() {
		driver.findElement(By.id("password")).click();
		}
	public void senhaConfirmacapClick() {
		driver.findElement(By.id("confirmPassword")).click();
		}
	public void nomeClicado() {
		driver.findElement(By.id("name")).click();
		}
}
