package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Divisibilidad;

class TestDivisibilidad {
//este es un comentario para github
	@Test
	void test01DivisiblePorDos_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDos(3);
		boolean actual02 = Divisibilidad.esDivisiblePorDos(5);
		boolean actual03 = Divisibilidad.esDivisiblePorDos(7);
		boolean actual04 = Divisibilidad.esDivisiblePorDos(9);
		boolean actual05 = Divisibilidad.esDivisiblePorDos(11);
		boolean actual06 = Divisibilidad.esDivisiblePorDos(457);
		boolean actual07 = Divisibilidad.esDivisiblePorDos(895);
		boolean actual08 = Divisibilidad.esDivisiblePorDos(983);
		boolean actual09 = Divisibilidad.esDivisiblePorDos(1297);
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
			
	}
	@Test
	void test02DivisiblePorDos_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDos(6);
		boolean actual02 = Divisibilidad.esDivisiblePorDos(80);
		boolean actual03 = Divisibilidad.esDivisiblePorDos(100);
		boolean actual04 = Divisibilidad.esDivisiblePorDos(360);
		boolean actual05 = Divisibilidad.esDivisiblePorDos(3888);
		boolean actual06 = Divisibilidad.esDivisiblePorDos(4006);
		boolean actual07 = Divisibilidad.esDivisiblePorDos(7666);
		boolean actual08 = Divisibilidad.esDivisiblePorDos(78480);
		boolean actual09 = Divisibilidad.esDivisiblePorDos(100034);
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
	void test03DivisiblePorTres_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorTres(11);
		boolean actual02 = Divisibilidad.esDivisiblePorTres(22);
		boolean actual03 = Divisibilidad.esDivisiblePorTres(31);
		boolean actual04 = Divisibilidad.esDivisiblePorTres(413);
		boolean actual05 = Divisibilidad.esDivisiblePorTres(520);
		boolean actual06 = Divisibilidad.esDivisiblePorTres(6112);
		boolean actual07 = Divisibilidad.esDivisiblePorTres(7102);
		boolean actual08 = Divisibilidad.esDivisiblePorTres(8215);
		boolean actual09 = Divisibilidad.esDivisiblePorTres(91681);
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
	}
	@Test
	void test04DivisiblePorTres_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorTres(9);
		boolean actual02 = Divisibilidad.esDivisiblePorTres(21);
		boolean actual03 = Divisibilidad.esDivisiblePorTres(333);
		boolean actual04 = Divisibilidad.esDivisiblePorTres(489);
		boolean actual05 = Divisibilidad.esDivisiblePorTres(5103);
		boolean actual06 = Divisibilidad.esDivisiblePorTres(60375);
		boolean actual07 = Divisibilidad.esDivisiblePorTres(72111);
		boolean actual08 = Divisibilidad.esDivisiblePorTres(81003);
		boolean actual09 = Divisibilidad.esDivisiblePorTres(900651);
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
	void test05DivisiblePorCuatro_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorCuatro(81);
		boolean actual02 = Divisibilidad.esDivisiblePorCuatro(161);
		boolean actual03 = Divisibilidad.esDivisiblePorCuatro(925);
		boolean actual04 = Divisibilidad.esDivisiblePorCuatro(14903);
		boolean actual05 = Divisibilidad.esDivisiblePorCuatro(24897);
		boolean actual06 = Divisibilidad.esDivisiblePorCuatro(9631);
		boolean actual07 = Divisibilidad.esDivisiblePorCuatro(1598);
		boolean actual08 = Divisibilidad.esDivisiblePorCuatro(6987);
		boolean actual09 = Divisibilidad.esDivisiblePorCuatro(5635);
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
	}
	@Test
	void test06DivisiblePorCuatro_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorCuatro(80);
		boolean actual02 = Divisibilidad.esDivisiblePorCuatro(160);
		boolean actual03 = Divisibilidad.esDivisiblePorCuatro(924);
		boolean actual04 = Divisibilidad.esDivisiblePorCuatro(14900);
		boolean actual05 = Divisibilidad.esDivisiblePorCuatro(24896);
		boolean actual06 = Divisibilidad.esDivisiblePorCuatro(324824);
		boolean actual07 = Divisibilidad.esDivisiblePorCuatro(5636);
		boolean actual08 = Divisibilidad.esDivisiblePorCuatro(100);
		boolean actual09 = Divisibilidad.esDivisiblePorCuatro(6987204);
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
	void test07DivisiblePorCinco_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorCinco(326);
		boolean actual02 = Divisibilidad.esDivisiblePorCinco(452);
		boolean actual03 = Divisibilidad.esDivisiblePorCinco(871);
		boolean actual04 = Divisibilidad.esDivisiblePorCinco(3504);
		boolean actual05 = Divisibilidad.esDivisiblePorCinco(4861);
		boolean actual06 = Divisibilidad.esDivisiblePorCinco(2357);
		boolean actual07 = Divisibilidad.esDivisiblePorCinco(9873);
		boolean actual08 = Divisibilidad.esDivisiblePorCinco(36481);
		boolean actual09 = Divisibilidad.esDivisiblePorCinco(36977);
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
	}
	@Test
	void test08DivisiblePorCinco_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorCinco(325);
		boolean actual02 = Divisibilidad.esDivisiblePorCinco(450);
		boolean actual03 = Divisibilidad.esDivisiblePorCinco(870);
		boolean actual04 = Divisibilidad.esDivisiblePorCinco(3505);
		boolean actual05 = Divisibilidad.esDivisiblePorCinco(4860);
		boolean actual06 = Divisibilidad.esDivisiblePorCinco(2355);
		boolean actual07 = Divisibilidad.esDivisiblePorCinco(9870);
		boolean actual08 = Divisibilidad.esDivisiblePorCinco(36485);
		boolean actual09 = Divisibilidad.esDivisiblePorCinco(30050);
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
	void test09DivisiblePorSeis_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSeis(573);
		boolean actual02 = Divisibilidad.esDivisiblePorSeis(477);
		boolean actual03 = Divisibilidad.esDivisiblePorSeis(999);
		boolean actual04 = Divisibilidad.esDivisiblePorSeis(1099);
		boolean actual05 = Divisibilidad.esDivisiblePorSeis(17877);
		boolean actual06 = Divisibilidad.esDivisiblePorSeis(2595);
		boolean actual07 = Divisibilidad.esDivisiblePorSeis(7171);
		boolean actual08 = Divisibilidad.esDivisiblePorSeis(8223);
		boolean actual09 = Divisibilidad.esDivisiblePorSeis(9173);
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
	}
	@Test
	void test10DivisiblePorSeis_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSeis(6);
		boolean actual02 = Divisibilidad.esDivisiblePorSeis(4698);
		boolean actual03 = Divisibilidad.esDivisiblePorSeis(30);
		boolean actual04 = Divisibilidad.esDivisiblePorSeis(788790);
		boolean actual05 = Divisibilidad.esDivisiblePorSeis(6543228);
		boolean actual06 = Divisibilidad.esDivisiblePorSeis(60);
		boolean actual07 = Divisibilidad.esDivisiblePorSeis(732486);
		boolean actual08 = Divisibilidad.esDivisiblePorSeis(38142);
		boolean actual09 = Divisibilidad.esDivisiblePorSeis(90);
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
	void test11DivisiblePorSiete_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSiete(39);
		boolean actual02 = Divisibilidad.esDivisiblePorSiete(8);
		boolean actual03 = Divisibilidad.esDivisiblePorSiete(340);
		boolean actual04 = Divisibilidad.esDivisiblePorSiete(101);
		boolean actual05 = Divisibilidad.esDivisiblePorSiete(226);
		boolean actual06 = Divisibilidad.esDivisiblePorSiete(48);
		boolean actual07 = Divisibilidad.esDivisiblePorSiete(293);
		boolean actual08 = Divisibilidad.esDivisiblePorSiete(190);
		boolean actual09 = Divisibilidad.esDivisiblePorSiete(64);
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
	}
	@Test
	void test12DivisiblePorSiete_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSiete(7);
		boolean actual02 = Divisibilidad.esDivisiblePorSiete(49);
		boolean actual03 = Divisibilidad.esDivisiblePorSiete(2261);
		boolean actual04 = Divisibilidad.esDivisiblePorSiete(294);
		boolean actual05 = Divisibilidad.esDivisiblePorSiete(196);
		boolean actual06 = Divisibilidad.esDivisiblePorSiete(63);
		boolean actual07 = Divisibilidad.esDivisiblePorSiete(245);
		boolean actual08 = Divisibilidad.esDivisiblePorSiete(105);
		boolean actual09 = Divisibilidad.esDivisiblePorSiete(42);
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
	void test13DivisiblePorOcho_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOcho(129);
		boolean actual02 = Divisibilidad.esDivisiblePorOcho(3241);
		boolean actual03 = Divisibilidad.esDivisiblePorOcho(24193);
		boolean actual04 = Divisibilidad.esDivisiblePorOcho(476281);
		boolean actual05 = Divisibilidad.esDivisiblePorOcho(13609);
		boolean actual06 = Divisibilidad.esDivisiblePorOcho(1511);
		boolean actual07 = Divisibilidad.esDivisiblePorOcho(20175);
		boolean actual08 = Divisibilidad.esDivisiblePorOcho(754207);
		boolean actual09 = Divisibilidad.esDivisiblePorOcho(7);
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
	}
	@Test
	void test14DivisiblePorOcho_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOcho(128);
		boolean actual02 = Divisibilidad.esDivisiblePorOcho(3240);
		boolean actual03 = Divisibilidad.esDivisiblePorOcho(8);
		boolean actual04 = Divisibilidad.esDivisiblePorOcho(64);
		boolean actual05 = Divisibilidad.esDivisiblePorOcho(1512);
		boolean actual06 = Divisibilidad.esDivisiblePorOcho(20176);
		boolean actual07 = Divisibilidad.esDivisiblePorOcho(13608);
		boolean actual08 = Divisibilidad.esDivisiblePorOcho(20176);
		boolean actual09 = Divisibilidad.esDivisiblePorOcho(80);
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
	void test15DivisiblePorNueve_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorNueve(352);
		boolean actual02 = Divisibilidad.esDivisiblePorNueve(31751);
		boolean actual03 = Divisibilidad.esDivisiblePorNueve(6874);
		boolean actual04 = Divisibilidad.esDivisiblePorNueve(5740);
		boolean actual05 = Divisibilidad.esDivisiblePorNueve(1262);
		boolean actual06 = Divisibilidad.esDivisiblePorNueve(10);
		boolean actual07 = Divisibilidad.esDivisiblePorNueve(987349);
		boolean actual08 = Divisibilidad.esDivisiblePorNueve(412885);
		boolean actual09 = Divisibilidad.esDivisiblePorNueve(91);
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
	}
	@Test
	void test16DivisiblePorNueve_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorNueve(9);
		boolean actual02 = Divisibilidad.esDivisiblePorNueve(90);
		boolean actual03 = Divisibilidad.esDivisiblePorNueve(324);
		boolean actual04 = Divisibilidad.esDivisiblePorNueve(45);
		boolean actual05 = Divisibilidad.esDivisiblePorNueve(6876);
		boolean actual06 = Divisibilidad.esDivisiblePorNueve(5742);
		boolean actual07 = Divisibilidad.esDivisiblePorNueve(5166);
		boolean actual08 = Divisibilidad.esDivisiblePorNueve(6696);
		boolean actual09 = Divisibilidad.esDivisiblePorNueve(1260);
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
	void test17DivisiblePorDiez_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDiez(11);
		boolean actual02 = Divisibilidad.esDivisiblePorDiez(99);
		boolean actual03 = Divisibilidad.esDivisiblePorDiez(302);
		boolean actual04 = Divisibilidad.esDivisiblePorDiez(362);
		boolean actual05 = Divisibilidad.esDivisiblePorDiez(245);
		boolean actual06 = Divisibilidad.esDivisiblePorDiez(304056);
		boolean actual07 = Divisibilidad.esDivisiblePorDiez(4053);
		boolean actual08 = Divisibilidad.esDivisiblePorDiez(123);
		boolean actual09 = Divisibilidad.esDivisiblePorDiez(697849);
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
	}
	@Test
	void test18DivisiblePorDiez_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDiez(10);
		boolean actual02 = Divisibilidad.esDivisiblePorDiez(100);
		boolean actual03 = Divisibilidad.esDivisiblePorDiez(300);
		boolean actual04 = Divisibilidad.esDivisiblePorDiez(45780);
		boolean actual05 = Divisibilidad.esDivisiblePorDiez(240);
		boolean actual06 = Divisibilidad.esDivisiblePorDiez(4050);
		boolean actual07 = Divisibilidad.esDivisiblePorDiez(12000);
		boolean actual08 = Divisibilidad.esDivisiblePorDiez(697840);
		boolean actual09 = Divisibilidad.esDivisiblePorDiez(900);
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
	void test19DivisiblePorOnce_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOnce(333);
		boolean actual02 = Divisibilidad.esDivisiblePorOnce(1250);
		boolean actual03 = Divisibilidad.esDivisiblePorOnce(9);
		boolean actual04 = Divisibilidad.esDivisiblePorOnce(361);
		boolean actual05 = Divisibilidad.esDivisiblePorOnce(526483);
		boolean actual06 = Divisibilidad.esDivisiblePorOnce(11265);
		boolean actual07 = Divisibilidad.esDivisiblePorOnce(859673);
		boolean actual08 = Divisibilidad.esDivisiblePorOnce(12);
		boolean actual09 = Divisibilidad.esDivisiblePorOnce(284620);
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
	}
	@Test
	void test20DivisiblePorOnce_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOnce(143286);
		boolean actual02 = Divisibilidad.esDivisiblePorOnce(110);
		boolean actual03 = Divisibilidad.esDivisiblePorOnce(99);
		boolean actual04 = Divisibilidad.esDivisiblePorOnce(1254);
		boolean actual05 = Divisibilidad.esDivisiblePorOnce(284625);
		boolean actual06 = Divisibilidad.esDivisiblePorOnce(112651);
		boolean actual07 = Divisibilidad.esDivisiblePorOnce(363);
		boolean actual08 = Divisibilidad.esDivisiblePorOnce(526482);
		boolean actual09 = Divisibilidad.esDivisiblePorOnce(123321);
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
