public class BanderaH{
	public static void main(String args[]){
		int bandera[][];
		bandera= new int[7][10];

		for(int i=0;i<3 ;i++)
		{
			for(int j=0;j<bandera[0].length;j++)
			{
				bandera[i][j]= 1;
				//rojo = 1
			}
		}

		for (int i=3; i<5;i++)
		{
			for(int j=0;j<bandera[0].length;j++)
			{
				bandera[i][j]=2;
				// blanco = 2
			}
		}
		for (int i=5;i<7;i++)
		{
			for(int j=0;j<bandera[0].length;j++)
			{
				bandera[i][j]=3;
				//azul=3
			}
		}

		for(int i=0;i<bandera.length; i++)
		{
			for(int j=0;j<bandera[0].length;j++)
			{
				if(bandera[i][j]==1)
				{
					System.out.println(ConsoleColors.RED_BACKGROUND+"*");
				}
				if(bandera[i][j]==2)
				{
					System.out.println(ConsoleColors.WHITE_BACKGROUND+"*");
				}
				if(bandera[i][j]==3)
				{
					System.out.println(ConsoleColors.BLUE_BACKGROUND+"*");
				}
			}
		}



	}
}