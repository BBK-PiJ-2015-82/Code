public class ArrayCopier {

	public static void copy(int[] src, int[] dst) {
		
		
		//arrays of same length
		if (src.length == dst.length) {
		
			for (int i = 0; i < src.length; i++) {
				dst[i] = src[i];
				
			}
			
		} 

		//src shorter than dst

		else if (src.length < dst.length) {
			for (int i = 0; i < src.length; i++ ) {
				//dst[i] = src[i] == null ? : 0, src[i]; //look up ternary operator (no fucking internet)
				dst[i] = src[i];

			}

			for (int i = src.length; i < dst.length ; i++) {
				dst[i] = 0;
			}

		}


		// dst shorter than src

		else if (dst.length < src.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		}
			

	}

}