package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakecamelTest {

	@Test
	public void snakeToCamelcaseでくのあかね(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "KunoAkane";
		String actual = scu.snakeToCamelcase("kuno_akane");
		assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでさかもとあや(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SakamotoAya";
		String actual = scu.snakeToCamelcase("sakamoto_aya");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでさかもとあや(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "sakamoto_aya";
		String actual = scu.camelToSnakecase("SakamotoAya");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでてごしゆうや(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "tegoshi_yuya";
		String actual = scu.camelToSnakecase("TegoshiYuya");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeでにしはら(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Nishihara";
		String actual = scu.capitalize("nishihara");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeでいけぶくろ(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Ikebukuro";
		String actual = scu.capitalize("ikebukuro");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでのぐち(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "noguchi";
		String actual = scu.uncapitalize("Noguchi");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeはらじゅく(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "harajuku";
		String actual = scu.uncapitalize("Harajuku");
		assertThat(actual, is(expected));
	}
}
