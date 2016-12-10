/**
 * 
 */
package br.com.projeto.monitor.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.monitor.Monitor;

/**
 * @author java03
 *
 */
public class MonitorTest {

	Monitor monitor;
	
	@Test
	public void testaCriacaoMonitor(){
		monitor = new Monitor("1223", "Preto", 20,false,50);
		monitor.cor = "Preta";
		monitor.numerSerie = "3123718";
		monitor.polegadas = 20;
		Assert.assertNotNull(monitor);
	}
}
