package testes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import source.NodePositionList;
import source.Position;

public class ReverseNodePositionListTest {

	@Test
	public void test() {
		NodePositionList<Integer> l = new NodePositionList<Integer>();
		assertEquals("[]", l.toString(), "[]");
	
		l.addFirst(1);
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		l.addFirst(5);
		l.addFirst(6);
	
		assertEquals("[6, 5, 4, 3, 2, 1]", l.toString(), "[6, 5, 4, 3, 2, 1]");
		
		// 1 ° Teste Reverse
		assertEquals("[1, 2, 3, 4, 5, 6]", l.toReverse().toString(), "[1, 2, 3, 4, 5, 6]");
		
	}

}
