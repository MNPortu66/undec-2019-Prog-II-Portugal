package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogin {

	@Test
	void test01ContraseniaNoValida_LargoMenoralMinimo() {
		//Arrange
		String passNoValida02 = "123456789";
		String passNoValida03 = "12345678";
		String passNoValida04 = "1234567";
		String passNoValida05 = "123456";
		String passNoValida06 = "12345";
		String passNoValida07 = "1234";
		String passNoValida08 = "123";
		String passNoValida09 = "12";
		String passNoValida10= "1";
		String passNoValida10= "";
		String passNoValida11 = null;
		
		//Act
		boolean actual01  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual02  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual03  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual04  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual05  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual06  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual07  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual08  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual09  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual10  = ValidarContrasenia.esLargoValido(passNoValido01);
		boolean actual11  = ValidarContrasenia.esLargoValido(passNoValido01);
		
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
	void test0ContraseniaValida_LargoPermitido() {
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
		boolean actual05  = ValidarContrasenia.esLargoValido(passValida04);
		boolean actual06  = ValidarContrasenia.esLargoValido(passValida05);
		boolean actual07  = ValidarContrasenia.esLargoValido(passValida06);
		boolean actual08  = ValidarContrasenia.esLargoValido(passValida07);
		boolean actual09  = ValidarContrasenia.esLargoValido(passValida08);
		
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

}
