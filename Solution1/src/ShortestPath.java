public class ShortestPath {

		
		
		static float[][] firstSloution(int n,int s,float[][] mat) {

			for (int k = 0;k < n;k++)
			{
					for (int j = 0;j < n;j++)
					{
						mat[s][j] = Math.min(mat[s][j], mat[s][k] + mat[k][j]);

					}
				
			}
			return mat;
		}

		public static void main(String[] args) {
			
			float[][] graph = {{0, 3, 999999999, 7},
			                        {8, 0, 2, 99999999},
			                        {5, 99999999, 0, 1},
			                        {2, 999999999, 999999999, 0}};
			graph=firstSloution(4,0,graph);
			System.out.println("le plus court chemin entre "+ 0+ " et "+ 0 +" est: "+graph[0][0]);
			System.out.println("le plus court chemin entre "+ 0+ " et "+ 1 +" est: "+graph[0][1]);
			System.out.println("le plus court chemin entre "+ 0+ " et "+ 2 +" est: "+graph[0][2]);
			System.out.println("le plus court chemin entre "+ 0+ " et "+ 3 +" est: "+graph[0][3]);

		
		}
		
	


}
