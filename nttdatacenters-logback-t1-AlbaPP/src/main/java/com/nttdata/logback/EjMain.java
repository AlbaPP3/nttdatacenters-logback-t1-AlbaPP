package com.nttdata.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J + Logback 
 * 
 * Clase principal 
 * 
 * @author Alba
 *
 */

public class EjMain {
	
	/**LOGGER */
	 private static final Logger LOG = LoggerFactory.getLogger(EjMain.class);
	
	 /**
	  * Método principal.
	  * 
	  * @param args
	  */
	 public static void main(String[] args) {
		 LOG.info("Método: main() | TRAZA INICIO"); 
		int sumaPar=0;
		int sumaImpar=0;
		for(int i=0;i<=50000;i++) {
			if(i%2==0) {
				sumaPar=sumaPar+i;
			}
			else {
				sumaImpar=sumaImpar+i;
			}
			LOG.debug("Número: {}",i);
		}
		
		System.out.println("La suma de los números pares hasta 50000 es :" +sumaPar);
		System.out.println("La suma de los numeros impares hasta 50000 es :"+sumaImpar);
		LOG.info("Método: main() | TRAZA FIN");
		
	 }
	}