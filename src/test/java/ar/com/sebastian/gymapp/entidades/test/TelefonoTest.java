/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.sebastian.gymapp.entidades.test;

import ar.com.sebastian.gymapp.entidades.Telefono;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class TelefonoTest {

    @Test
	public void testTelefonoConstructor(){
		Telefono instance = new Telefono("1540765462","celular");
		String expResultNumero = "1540765462";
		String expResultTipo = "celular";
		assertTrue(	(expResultNumero.equals(instance.getNumero())) &&
					(expResultTipo.equals(instance.getTipoTelefono())));
	}
	
	@Test
	public void testTelefonoConstructorDefoult(){
		Telefono instance = new Telefono();
		assertTrue(	(instance.getNumero().isEmpty()) &&
					(instance.getTipoTelefono.isEmpty()));
	}
	
	/**
     * Test of setNumero method, of class Telefono.
     */
	@Test
	public void testSetNumero(){
		System.out.println("setNumero");
		String numero = "1540775462";
		Telefono instance = new Telefono();
		instance.setNumero(numero);
		assertEquals(numero,instance.getNumero());
	}
	
	/**
     * Test of setTipoTelefono method, of class Telefono.
     */
	@Test
	public void testSetTipoTelefnono(){
		System.out.println("setTipoTelefono");	
		String tipoTelefono = "personal";
		Telefono instance = new Telefono();
		instance.setTipoTelefono(tipoTelefono);
		assertEquals(tipoTelefono,instance.getTipoTelefono());
	}
	
	/**
     * Test of getNumero method, of class Telefono.
     */
	@Test
	public void testGetNumero(){
		System.out.println("getNumero");
		Telefono instance = new Telefono("1540765462","celular");
		String expResultNumero = "1540765462";
		assertEquals(expResultNumero,instance.getNumero());
	}
	
	/**
     * Test of getTipoTelefono method, of class Telefono.
     */
	@Test
	public void testGetTipoTelefono(){
		System.out.println("getTipoTelefono");
		Telefono instance = new Telefono("1540765462","celular");
		String expResultTipo = "celular";
		assertEquals(expResultTipo,instance.getTipoTelefono())
	}
}
