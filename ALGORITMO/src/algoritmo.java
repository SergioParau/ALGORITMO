

public class algoritmo {

	public static void main(String args[]) {

		char base[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z' };
		char textcod[] = { 'E', 'S', 'B', 'D', 'V', 'M', 'B' };

		int k = 1;
		int j, i;
		
		for (i = 0; i <textcod.length; i++) {
			for (j = 0; j <base.length; j++) {
				
				if(textcod[i] == base[j]){
	
				if ((j - k) < 0) {
					System.out.print(base[base.length - k]);
				} else {
					System.out.print(base[j - k]);

				}

			}
		}

	}

  }
}
