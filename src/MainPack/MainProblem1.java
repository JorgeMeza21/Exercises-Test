package MainPack;

import java.util.ArrayList;
import java.util.List;

import Problem1.Solution1;

public class MainProblem1 {

	public int[] ordenamiento(int[] data) {
		
		if(data.length != 0) {
			for (int i = 0; i < data.length; i++) {
				
				for (int j = 0; j < data.length - 1; j++) {
					
					if (data[j] < data[j+1] ) {
						int aux = data[j];
						data[j] = data[j+1];
						data[j+1] = aux;
					}
				}
			}
			
		}
		
		return data;
	}
	
	
	public static void main(String[] args) {
		int[] test = new int[10];
		
		test[0] = 3;
		test[1] = 4;
		test[2] = 5;
		test[3] = 6;

		MainProblem1 m = new MainProblem1();
		
		test = m.ordenamiento(test);
		
		/*for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}*/
		
		Solution1 s = new Solution1();
		
		int[] test2 = {10,28,-3, 5, 3};

		//System.out.println(s.temperaturaZero(test2));

		//System.out.println(s.encode("pppppppl"));
		
		//System.out.println(s.encodeAV("jourge"));
		
		int[] test3 = {1,1,2,2,3,4,3,1,-1};

		test3 = s.eliminarDuplicados(test3);
		
		/*for (int i = 0; i < test3.length; i++) {
		System.out.println(test3[i]);
		}*/
		
		Integer[] intTest = new Integer[3];
		List<Integer> listaTest = new ArrayList<>();
		listaTest.add(new Integer(2));
		listaTest.add(new Integer(3));
		listaTest.add(new Integer(4));
		listaTest.add(new Integer(2));
		listaTest.add(new Integer(2));

		System.out.println(s.cantidadDigitDiferentes(listaTest));

	}

}
