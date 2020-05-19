package Mem;

import java.util.ArrayList;

public class CaretakerChess {
	private ArrayList<MementoChess> memlist=new ArrayList<MementoChess>();
	public void Addmem(MementoChess mem) {
		memlist.add(mem);
	}
	
	public MementoChess getMem(int i) {
		return memlist.get(i);
	}
}
