package Problem1;
import java.math.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution1 {

	public int temperaturaZero(int[] data) {
		int result = 0;
		
		for (int i = 0; i < data.length - 1; i++) {
			if(Math.abs(data[i]) -  Math.abs(data[i+1]) < 0) {
				int aux = data[i];
				data[i] = data[i+1];
				data[i+1] = aux;
			} else if (Math.abs(data[i]) -  Math.abs(data[i+1]) == 0) {
				if(data[i] > 0) {
					int aux = data[i];
					data[i] = data[i+1];
					data[i+1] = aux;
				}
			}
		}
		
		if (data.length != 0) {
			result = data[data.length -1];
		} else {
			result = 1;
		}
		
		return result;
	}
	
	public String encode(String clave) {
		String result = "";
		
		int acum = 0;
		char x = ' ';
		
		for (int j = 0; j < clave.length(); j++) {
			
			if(j == 0) {
				x = clave.charAt(j);
				acum = 1;
				if (j == clave.length() - 1) {
					result += String.valueOf(acum) + x;
				}

			} else {
					if(x == clave.charAt(j)) {
						acum++;
						if (j == clave.length() - 1) {
							result += String.valueOf(acum) + x;
						}
					} else {
						result += String.valueOf(acum) + x;

						if (j == clave.length() - 1) {
							result += "1" + clave.charAt(j);

						} else {
							x = clave.charAt(j);
							acum = 1;
						}
						
					}
	
			}
		}
				
		return result;
	}
	
	public String encodeAV(String clave) {
		String result = "";
		
		for (int i = 0; i < clave.length(); i++) {
			
			if(esVocal(clave.charAt(i))) {
				if(i != 0) {
					if(esVocal(clave.charAt(i - 1))) {
						result += clave.charAt(i);
					} else {
						result += "av" + clave.charAt(i);
					}
				} else {
					result += "av" + clave.charAt(i);
				}
			} else {
				result += clave.charAt(i);
			}
		}
		
		
		return result;
	}
	
	public boolean esVocal(char x) {
		
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			return true;
		} else {
			return false;
		}
	}
	
	public int[] eliminarDuplicados(int[] data) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> med = new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			med.add(new Integer(data[i]));
		}
		
		
		int tam = med.size();
		int j = 0;

		while(j < tam) {
			Integer a = med.get(j); 
			result.add(a);
			
			int i = 0;
			
			while(i < tam) {
				
				if (a.intValue() == med.get(i).intValue()) {
					med.remove(i);
					tam--;
				} else {
					i++;
				}	

			}

		}
		
		int[] resp = new int[result.size()];
	
		for (int i = 0; i < result.size(); i++) {
			resp[i] = result.get(i);
		}
		
		return resp;
	}
	
	public boolean esDuodigito(int data) {
		boolean result = true;
		
		String x = String.valueOf(data);
		int[] res = new int[x.length()];
		
		for (int i = 0; i < x.length(); i++) {
			res[i] = Integer.parseInt(x.charAt(i)+ "");
		}
		
		res = eliminarDuplicados(res);
		
		if (res.length > 2) {
			result = false;
		}
		
		return result;
	}
	
	public int cantidadDigitDiferentes(List<Integer> data) {
		 
		if (data.size() == 0 || data.size() > 100000) {
			return 0;
		} else {
			Map<Integer, Integer> unicos = new HashMap<>();
			
			for (Integer integer : data) {
				unicos.put(integer, integer);
			}
			return unicos.size();
		}
		
	}
}
