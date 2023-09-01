import java.util.*;
class kruskal
{
	int parent[]=new int[10];
	int a=0,b=0,u=0,v=0,i,j,ne=1,min,mincost=0;
	void kruskal_algo(int mat[][],int n)
	{
		for(i=1;i<=n;i++)
		{
			parent[i]=0;
		}
		while(ne<n)
		{
			min=999;
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
					if(mat[i][j]<min&& i!=j)
					{
						min=mat[i][j];
						u=i;
						v=j;
					}
			
			a=find(u);
			b=find(v);
			if(union(a,b))
			{
				System.out.println("Edge:("+u+","+v+")"+"="+min);
				mincost=mincost+min;
				ne++;
			}
			mat[u][v]=mat[v][u]=999;
		}
		System.out.println("The cost of spanning tree is:"+mincost);
	}
	int find(int i)
	{
		int j=i;
		while(parent[j]>0)
			j=parent[i];
		return j;
	}
	boolean union(int m,int n)
	{
		if(m!=n)
		{
			parent[n]=m;
			return true;
		}
		return false;
	}
}
class LAB8
{
	public static void main(String args[])
	{
	  	kruskal k=new kruskal();
		Scanner SC=new Scanner(System.in);
		int n,i,j;
		int mat[][]=new int[10][10];
		System.out.println("How many vertices?");
		n=SC.nextInt();
		System.out.println("Enter weight matrix");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				mat[i][j]=SC.nextInt();
			}
		}
		System.out.println("weight matrix is");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("");
		}
		k.kruskal_algo(mat,n);
	}
}   	
