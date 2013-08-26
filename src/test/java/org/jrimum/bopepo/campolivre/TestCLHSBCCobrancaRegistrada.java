package org.jrimum.bopepo.campolivre;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.jrimum.bopepo.BancosSuportados;
import org.jrimum.domkee.financeiro.banco.ParametrosBancariosMap;
import org.jrimum.domkee.financeiro.banco.febraban.Agencia;
import org.jrimum.domkee.financeiro.banco.febraban.Carteira;
import org.jrimum.domkee.financeiro.banco.febraban.NumeroDaConta;
import org.jrimum.domkee.financeiro.banco.febraban.TipoDeCobranca;
import org.jrimum.domkee.financeiro.banco.hsbc.TipoIdentificadorCNR;
import org.junit.Before;

/**
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author <a href="mailto:fernandobgi@gmail.com">Fernando Dias</a>
 */
public class TestCLHSBCCobrancaRegistrada  extends AbstractCampoLivreBaseTest<CLHSBCCobrancaNaoRegistrada> {

	@Before
	public void setUp(){
		
		//TODO FAZER TESTE REAL

		titulo.getContaBancaria().setBanco(BancosSuportados.HSBC.create());
		titulo.getContaBancaria().setAgencia(new Agencia(1234, "1"));
		titulo.getContaBancaria().setNumeroDaConta(new NumeroDaConta(8351202,"2"));
		titulo.getContaBancaria().setCarteira(new Carteira(1, TipoDeCobranca.SEM_REGISTRO));
		titulo.setNossoNumero("0000239104761");
		titulo.setDataDoVencimento(new GregorianCalendar(2008, Calendar.JULY, 4).getTime());
		titulo.setParametrosBancarios(new ParametrosBancariosMap(TipoIdentificadorCNR.class.getName(), TipoIdentificadorCNR.COM_VENCIMENTO));

		createCampoLivreToTest();

		setCampoLivreEsperadoComoString("8351202000023910476118682");
	}
	

}
