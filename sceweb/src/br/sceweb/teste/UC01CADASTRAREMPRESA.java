package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CADASTRAREMPRESA {
	static Empresa empresa;
	static EmpresaDAO empresaDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}

	@Before
	public static void excluiCXNPJ() {
		empresaDAO.exclui("89424232000180");
	}

	// estabelece as pré condiçoes de teste
	// testar se inseriu com sucesso

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// verificar o comportamento do sistema na inclusão
		// de uma empresa com sucesso

	}

	@Test
	public void testValido() {
		fail("Not yet implemented");
		assertEquals(1, empresaDAO.adiciona(empresa));

	}
	
	@Test
	public void testInvalido() {
		fail("Not yet implemented");
		assertEquals(1, empresaDAO.adiciona(empresa));

	}

}
