package br.com.alura.forum.service;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.alura.forum.dao.UsuarioDao;

import br.com.alura.forum.service.*;

public class UsuarioServiceTest {

	@Ignore
	@Test(expected = UsernameNotFoundException.class)
	public void deve_lancar_excecao_ao_buscar_usuario_por_email_que_nao_existe_no_banco() {
		UsuarioDao dao = Mockito.mock(UsuarioDao.class);
		UsuarioService service = new UsuarioService(dao);

		service.loadUserByUsername("newton@caelum.com.br");
	}

}
