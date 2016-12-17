/**
 * 
 */
package br.com.projeto.usuario.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.usuario.Usuario;

/**
 * @author java03
 *
 */
public class UsuarioTest {

	private static final String senhavalida = "gfhr6473";

	@Test
	public void testarComSenhaInvalidaFaltandoLetra() {
		Usuario usuario = new Usuario();
		usuario.setNome("fdkajbdf");
		usuario.setEmail("fdka@jbdf.com");
		usuario.setSenha(senhavalida);
		String senhainvalida= "13243524";
		usuario.setSenha(senhainvalida);
		Assert.assertEquals(senhavalida, usuario.getSenha());
	}

	@Test
	public void testarComSenhaInvalidaFaltandoNumero() {
		Usuario usuario = new Usuario();
		usuario.setNome("fdkajbdf");
		usuario.setEmail("fdka@jbdf.com");
		usuario.setSenha(senhavalida);
		String senhainvalida= "jdhfyrte";
		usuario.setSenha(senhainvalida);
		Assert.assertEquals(senhavalida, usuario.getSenha());
	}

	@Test
	public void testarComSenhaInvalidaFaltandoCaractere() {
		Usuario usuario = new Usuario();
		usuario.setNome("fdkajbdf");
		usuario.setEmail("fdka@jbdf.com");
		usuario.setSenha(senhavalida);
		String senhainvalida= "1324";
		usuario.setSenha(senhainvalida);
		Assert.assertEquals(senhavalida, usuario.getSenha());
	}

	@Test
	public void testarComSenhaValida() {
		Usuario usuario = new Usuario();
		usuario.setNome("fdkajbdf");
		usuario.setEmail("fdka@jbdf.com");
		usuario.setSenha(senhavalida);

		Assert.assertEquals(senhavalida, usuario.getSenha());
	}

}
