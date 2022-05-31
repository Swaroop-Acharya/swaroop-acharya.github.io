import java.util.Scanner;
public class BellmanFord{
    private int n=0;
    private int distance[];
    private static final int MAX=999;
    public BellmanFord(int num_vertices){
        this.n=num_vertices;
        distance=new int[num_vertices+1];
    }
    public void bellmanford(int s,int cost[][]){
        for(int node=1;node<=n;node++){
            distance[node]=MAX;
        }
        distance[s]=0;
        for(int node=1;node<=n-1;node++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(cost[i][j]!=MAX){
                        if(distance[j]>distance[i]+cost[i][j])
                        distance[j]=distance[i]+cost[i][j];
                    }
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(cost[i][j]!=MAX){
                    if(distance[j]>distance[i]+cost[i][j])
                   System.out.println("Negative edge");
                }
            }
        }
        for(int vertex=1;vertex<=n;vertex++){
            System.out.println("Distance from"+s+"to"+vertex+"is"+distance[vertex]);
        }
    }
    public static void main(String[] args) {
        int n=0;
        int source;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of vertices:");
        n=in.nextInt();
        int cost[][]=new int[n+1][n+1];
        System.out.println("Enter the adjacenecy matrix:");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                cost[i][j]=in.nextInt();
                if(i==j){
                    cost[i][j]=0;
                    continue;
                }
                if(cost[i][j]==0)
                {
                    cost[i][j]=MAX;
                }
            }
        }
        System.out.println("Enter the source:");
        source=in.nextInt();
        BellmanFord bell=new BellmanFord(n);
        bell.bellmanford(source, cost);
        in.close();

    }
}