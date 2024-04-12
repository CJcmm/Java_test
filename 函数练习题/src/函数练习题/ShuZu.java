package º¯ÊıÁ·Ï°Ìâ;

class ShuZu {
	
	static double[] arr(int a,int b,int c)
    {
		double t = a + b + c;
		double max=a>b ? a : c;
		double min=a<b ? a : c;
        double average=(a + b + c)/3;
        return new double[] { t, max, min, average };
    }
	public static void main(String[] args) 
    {
		double[] Arr=ShuZu.arr(4,5,6);
		
		for(int n=0;n<4;n++) {
			System.out.println(Arr[n]);			
		}

		System.out.println(Arr[03]);
    }
}
