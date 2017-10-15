	class Double
		{
			int ram(int []a)
			{
			int m=a[0];
			for(int i=0;i<=a.length;i++)
			{
			if(a[i]>m)
			{
			m=a[i];
			}
			}
			return m;
			}
		public static void main(String args[])
			{
			int []a={1,8,6,5,4,9,25};
			Double obj=new Double();
			int y=obj.ram(a);
			System.out.println(y);
			}
		}

