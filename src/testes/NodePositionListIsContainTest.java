package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import source.InvalidPositionException;
import source.NodePositionList;
import source.NodePositionListIsContain;
import source.Position;
import source.PositionList;

public class NodePositionListIsContainTest {
		
	@Test
	public void test() {
		
		// lista 0 
		NodePositionListIsContain<Integer> lista0 = new NodePositionListIsContain<Integer>();
		assertEquals("[]", lista0.toString(), "[]");
	
		lista0.addFirst(1);
		lista0.addFirst(2);
		lista0.addFirst(3);
		lista0.addFirst(4);
		lista0.addFirst(5);
		lista0.addFirst(6);
	
		assertEquals("[6, 5, 4, 3, 2, 1]", lista0.toString(), "[6, 5, 4, 3, 2, 1]");
		
		
		// lista 1
		NodePositionListIsContain<Integer> lista1 = new NodePositionListIsContain<Integer>();
		assertEquals("[]", lista1.toString(), "[]");
	
		lista1.addFirst(6);
		lista1.addFirst(5);
		lista1.addFirst(4);
		lista1.addFirst(3);
		lista1.addFirst(2);
		lista1.addFirst(1);
	
		assertEquals("[1, 2, 3, 4, 5, 6]", lista1.toString(), "[1, 2, 3, 4, 5, 6]");
		
		
		// Teste pegando elemento 6 da lista 0 e verificando se esta na lista 1 
		Position p0 =  lista0.first();
		assertFalse(lista1.isContain(p0)," Deve retornar falso, já que p1 e uma posição de outra lista");
		assertThrows(InvalidPositionException.class, () -> { lista1.addBefore(p0, 9); });
		
				
		// Teste pegando elemento 1 da lista 1 e verificando se esta na lista 0 
		Position p1 =  lista1.first();
		assertFalse(lista0.isContain(p1)," Deve retornar falso, já que p1 e uma posição de outra lista");
		assertThrows(InvalidPositionException.class, () -> { lista0.addBefore(p1, 9); });
		
		
	}
	
}
