package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogin {

	@Test
	void test01ContraseniaNoValida_LargoMenoralMinimo() {
		//Arrange
		String passNoValida01 = "123456789";
		String passNoValida02 = "12345678";
		String passNoValida03 = "1234567";
		String passNoValida04 = "123456";
		String passNoValida05 = "12345";
		String passNoValida06 = "1234";
		String passNoValida07 = "123";
		String passNoValida08 = "12";
		String passNoValida09= "1";
		String passNoValida10= "";
		String passNoValida11 = null;
		
		//Act
		boolean actual01  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual02  = ValidarContrasenia.esLargoValido(passNoValido02);
		boolean actual03  = ValidarContrasenia.esLargoValido(passNoValido03);
		boolean actual04  = ValidarContrasenia.esLargoValido(passNoValido04);
		boolean actual05  = ValidarContrasenia.esLargoValido(passNoValido05);
		boolean actual06  = ValidarContrasenia.esLargoValido(passNoValido06);
		boolean actual07  = ValidarContrasenia.esLargoValido(passNoValido07);
		boolean actual08  = ValidarContrasenia.esLargoValido(passNoValido08);
		boolean actual09  = ValidarContrasenia.esLargoValido(passNoValido09);
		boolean actual10  = ValidarContrasenia.esLargoValido(passNoValido10);
		boolean actual11  = ValidarContrasenia.esLargoValido(passNoValido011);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		assertEquals(false, actual10);
		assertEquals(false, actual11);
	}
	@Test
	void test02ContraseniaValida_LargoPermitido() {
		//Arrange
		String passNoValida01 = "1234567890";
		String passNoValida02 = "12345678901";
		String passNoValida03 = "123456789012";
		String passNoValida04 = "1234567890123";
		String passNoValida05 = "12345678901234";
		String passNoValida06 = "123456789012345";
		String passNoValida07 = "1234567890123456";
		String passNoValida08 = "12345678901234567";
		String passNoValida09= "123456789012345678";
		
		//Act
		boolean actual01  = ValidarContrasenia.esLargoValido(passValida01);		
		boolean actual02  = ValidarContrasenia.esLargoValido(passValida02);
		boolean actual03  = ValidarContrasenia.esLargoValido(passValida03);
		boolean actual04  = ValidarContrasenia.esLargoValido(passValida04);
		boolean actual05  = ValidarContrasenia.esLargoValido(passValida05);
		boolean actual06  = ValidarContrasenia.esLargoValido(passValida06);
		boolean actual07  = ValidarContrasenia.esLargoValido(passValida07);
		boolean actual08  = ValidarContrasenia.esLargoValido(passValida08);
		boolean actual09  = ValidarContrasenia.esLargoValido(passValida09);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);

	}
	@Test
	void test03ContraseniaNoValida_ContieneMenosDeDosMinusculas() {
		//Arrange
		String passNoValida01 = "ESTAPASSWORDNOESVALIDA";
		String passNoValida02 = "ESTAPASSWORDNOESVALIDa";
		String passNoValida03 = "ESTAPASSWORDNOESVALIdA";
		String passNoValida04 = "ESTAPASSWORDNOESVALiDA";
		String passNoValida05 = "ESTAPASSWORDNOESVAlIDA";
		String passNoValida06 = "ESTAPASSWORDNOESVaLIDA";
		String passNoValida07 = "ESTAPASSWORDNOESvALIDA";
		String passNoValida08 = "ESTAPASSWORDNOEsVALIDA";
		String passNoValida09 = "ESTAPASSWORDNOeSVALIDA";
		String passNoValida10 = "ESTAPASSWORDNoESVALIDA";
		String passNoValida11 = "ESTAPASSWORDnOESVALIDA";
		String passNoValida12 = "ESTAPASSWORdNOESVALIDA";
		String passNoValida13 = "ESTAPASSWOrDNOESVALIDA";
		String passNoValida14 = "ESTAPASSWoRDNOESVALIDA";
		String passNoValida15 = "ESTAPASSwORDNOESVALIDA";
		String passNoValida16 = "ESTAPASsWORDNOESVALIDA";
		String passNoValida17 = "ESTAPAsSWORDNOESVALIDA";
		String passNoValida18 = "ESTAPaSSWORDNOESVALIDA";
		String passNoValida19 = "ESTApASSWORDNOESVALIDA";
		String passNoValida20 = "ESTaPASSWORDNOESVALIDA";
		String passNoValida21 = "EStAPASSWORDNOESVALIDA";
		String passNoValida22 = "EsTAPASSWORDNOESVALIDA";
		String passNoValida223 = "eSTAPASSWORDNOESVALIDA";
		//Act
		boolean actual01  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida01);
		boolean actual02  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida02);
		boolean actual03  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida03);
		boolean actual04  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida04);
		boolean actual05  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida05);
		boolean actual06  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida06);
		boolean actual07  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida07);
		boolean actual08  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida08);
		boolean actual09  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida09);
		boolean actual10  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida10);
		boolean actual11  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida11);
		boolean actual12  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida12);
		boolean actual13  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida13);
		boolean actual14  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida14);
		boolean actual15  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida15);
		boolean actual16  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida16);
		boolean actual17  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida17);
		boolean actual18  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida18);
		boolean actual19  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida19);
		boolean actual20  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida20);
		boolean actual21  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida21);
		boolean actual22  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida22);
		boolean actual23  = ValidarContrasenia.contieneMenosDeDosMinusculas(passNoValida23);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		assertEquals(false, actual12);
		assertEquals(false, actual13);
		assertEquals(false, actual14);
		assertEquals(false, actual15);
		assertEquals(false, actual16);
		assertEquals(false, actual17);
		assertEquals(false, actual18);
		assertEquals(false, actual19);
		assertEquals(false, actual20);
		assertEquals(false, actual21);
		assertEquals(false, actual22);
		assertEquals(false, actual23);
		
	}
	@Test
	void test04ContraseniaValida_ContieneAlMenosDosMinusculas() {
		//Arrange
		String passValida01 = "ESTAPASSWORDESVALIda";
		String passValida02 = "ESTAPASSWORDESVAliDA";
		String passValida03 = "ESTAPASSWORDESvaLIDA";
		String passValida04 = "ESTAPASSWORDesVALiDA";
		String passValida05 = "ESTAPASSWOrdESVAlIDA";
		String passValida06 = "ESTAPASSwoRDESVaLIDA";
		String passValida07 = "ESTAPAssWORDESvALIDA";
		String passValida08 = "ESTApaSSWORDEsVALIDA";
		String passValida09 = "EStaPASSWORDESVALIDA";
		String passValida10 = "esTAPASSWORDESVALIDA";
		
		//Act
		boolean actual01  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida01);
		boolean actual02  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida02);
		boolean actual03  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida03);
		boolean actual04  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida04);
		boolean actual05  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida05);
		boolean actual06  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida06);
		boolean actual07  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida07);
		boolean actual08  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida08);
		boolean actual09  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida09);
		boolean actual10  = ValidarContrasenia.contieneAlMenosDosMinusculas(passValida10);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		assertEquals(true, actual10);
				
	}
	@Test
	void test05ContraseniaNoValida_ContieneMenosDeDosMayusculas() {
		//Arrange
		String passNoValida01 = "estapasswordnoesvalida";
		String passNoValida02 = "estapasswordnoesvaliDa";
		String passNoValida03 = "estapasswordnoesvalIda";
		String passNoValida04 = "estapasswordnoesvaLida";
		String passNoValida05 = "estapasswordnoesvAlida";
		String passNoValida06 = "estapasswordnoesValida";
		String passNoValida07 = "estapasswordnoeSvalida";
		String passNoValida08 = "estapasswordnoEsvalida";
		String passNoValida09 = "estapasswordnOesvalida";
		String passNoValida10 = "estapasswordNoesvalida";
		String passNoValida11 = "estapassworDnoesvalida";
		String passNoValida12 = "estapasswoRdnoesvalida";
		String passNoValida13 = "estapasswOrdnoesvalida";
		String passNoValida14 = "estapassWordnoesvalida";
		String passNoValida15 = "estapasSwordnoesvalida";
		String passNoValida16 = "estapaSswordnoesvalida";
		String passNoValida17 = "estapAsswordnoesvalida";
		String passNoValida18 = "estaPasswordnoesvalida";
		String passNoValida19 = "estApasswordnoesvalida";
		String passNoValida20 = "esTapasswordnoesvalida";
		String passNoValida21 = "eStapasswordnoesvalida";
		String passNoValida22 = "Estapasswordnoesvalida";
		
		//Act
		boolean actual01  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida01);
		boolean actual02  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida02);
		boolean actual03  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida03);
		boolean actual04  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida04);
		boolean actual05  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida05);
		boolean actual06  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida06);
		boolean actual07  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida07);
		boolean actual08  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida08);
		boolean actual09  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida09);
		boolean actual10  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida10);
		boolean actual11  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida11);
		boolean actual12  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida12);
		boolean actual13  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida13);
		boolean actual14  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida14);
		boolean actual15  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida15);
		boolean actual16  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida16);
		boolean actual17  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida17);
		boolean actual18  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida18);
		boolean actual19  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida19);
		boolean actual20  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida20);
		boolean actual21  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida21);
		boolean actual22  = ValidarContrasenia.contieneMenosDeDosMayusculas(passNoValida22);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		assertEquals(false, actual12);
		assertEquals(false, actual13);
		assertEquals(false, actual14);
		assertEquals(false, actual15);
		assertEquals(false, actual16);
		assertEquals(false, actual17);
		assertEquals(false, actual18);
		assertEquals(false, actual19);
		assertEquals(false, actual20);
		assertEquals(false, actual21);
		assertEquals(false, actual22);
				
	}
	@Test
	void test06ContraseniaValida_ContieneAlMenosDosMayusculas() {
		//Arrange
		String passValida01 = "estapasswordesvaliDA";
		String passValida02 = "estapasswordesvaLIda";
		String passValida03 = "estapasswordesVAlida";
		String passValida04 = "estapasswordESvalida";
		String passValida05 = "estapasswoRDesvalida";
		String passValida06 = "estapassWOrdesvalida";
		String passValida07 = "estapaSSwordesvalida";
		String passValida08 = "estaPAsswordesvalida";
		String passValida09 = "esTApasswordesvalida";
		String passValida10 = "EStapasswordesvalida";
		
		//Act
		boolean actual01  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida01);
		boolean actual02  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida02);
		boolean actual03  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida03);
		boolean actual04  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida04);
		boolean actual05  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida05);
		boolean actual06  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida06);
		boolean actual07  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida07);
		boolean actual08  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida08);
		boolean actual09  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida09);
		boolean actual10  = ValidarContrasenia.contieneAlMenosDosMayusculas(passValida10);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		assertEquals(true, actual10);
				
	}
	void test07ContraseniaNoValida_ContieneMenosDeDosCaracEspeciales() {
		//Arrange
		String passNoValida01 = "sonso";
		String passNoValida02 = "$oquete";
		String passNoValida03 = "bo&udo";
		String passNoValida04 = "b%leano";
		String passNoValida05 = "s#rete";
		
		//Act
		boolean actual01  = ValidarContrasenia.contieneMenosDeDosCaracEspeciales(passNoValida01);
		boolean actual02  = ValidarContrasenia.contieneMenosDeDosCaracEspeciales(passNoValida02);
		boolean actual03  = ValidarContrasenia.contieneMenosDeDosCaracEspeciales(passNoValida03);
		boolean actual04  = ValidarContrasenia.contieneMenosDeDosCaracEspeciales(passNoValida04);
		boolean actual05  = ValidarContrasenia.contieneMenosDeDosCaracEspeciales(passNoValida05);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
					
	}
	@Test
	void test08ContraseniaValida_ContieneAlMenosDosCaracEspeciales() {
		//Arrange
		String passValida01 = "&ntr#vert&do";
		String passValida02 = "b%lean#";
		String passValida03 = "$aband&ja";
		String passValida04 = "pa&a$o";
		String passValida05 = "#torr&nonar&ng#l#";
		
		//Act
		boolean actual01  = ValidarContrasenia.contieneAlMenosDosCaracEspeciales(passValida01);
		boolean actual02  = ValidarContrasenia.contieneAlMenosDosCaracEspeciales(passValida02);
		boolean actual03  = ValidarContrasenia.contieneAlMenosDosCaracEspeciales(passValida03);
		boolean actual04  = ValidarContrasenia.contieneAlMenosDosCaracEspeciales(passValida04);
		boolean actual05  = ValidarContrasenia.contieneAlMenosDosCaracEspeciales(passValida05);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
				
	}
}
