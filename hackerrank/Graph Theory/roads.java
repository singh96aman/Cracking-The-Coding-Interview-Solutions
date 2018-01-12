import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static ArrayList<Integer>[] adjCities;
    private static int connectedComponents;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); // number of queries
        for(int a0 = 0; a0 < q; a0++){
            long cities = in.nextLong(); // number of cities
            //System.out.println("Total number of cities: "+cities);
            long roads = in.nextLong(); // number of roads
            //System.out.println("Total number of bidirectional roads: "+roads);
            long libCost = in.nextLong(); // cost of building a library
            //System.out.println("Cost of building library: "+libCost);
            long roadCost = in.nextLong(); // cost of repairing a road
            //System.out.println("Cost of repairing road: "+roadCost);


            if (roadCost >= libCost || roads == 0){
                // optimal scenario/edge (corner) case + a for loop to get correct nextInts
                System.out.println(libCost * cities);
                for (int i = 0; i < (roads*2); i++){
                    in.nextInt();
                }
                continue;
            }


            else{
                //Now we must try to get all the connected components
                int index=(int)cities+1;
                adjCities = (ArrayList<Integer>[]) new ArrayList[index];
                for (int c = 0; c <= cities; c++) {
                    adjCities[c] = new ArrayList<Integer>();
                }

                visited = new boolean[index];

                //initializing adjCities
                for (int i = 0; i < roads; i++){
                    int c1 = in.nextInt();
                    int c2 = in.nextInt();

                    adjCities[c1].add(c2);
                    adjCities[c2].add(c1);
                }

                //System.out.println(adjCities.length);

                //Checking our adjCities
                /*for (int i = 0; i < roads; i++){
                    System.out.println(adjCities[i]);
                    //for (int index = 0; index < adjCities[i].size(); index++)
                        //System.out.println(adjCities[i].get(index));
                }*/

                //System.out.println(adjCities[1].size());
                //System.out.println(adjCities[1].get(1));


                //Boolean arrays are initialized to false in Java automatically
                /*for (int i = 0; i <= cities; i++){
                    visited[i] = false;
                }*/

                for(int c = 1; c <= cities; c++) {
                    if(!visited[c]) {
                        dfs(c);
                        connectedComponents++;
                    }
                }

                //System.out.println(connectedComponents);
                System.out.println(roadCost * (cities - connectedComponents) + libCost * connectedComponents);
                connectedComponents = 0;
                visited = new boolean[10000];
                adjCities = (ArrayList<Integer>[]) new ArrayList[10000+1];
            }
        }
    }

    private static void dfs(int city){
        visited[city] = true;
        //System.out.println("visited[city] = true: "+city);
        //System.out.println("adjCities[city].size(): "+adjCities[city].size());
        //System.out.println(adjCities[2].get(0));
        //System.out.println(adjCities[2].get(1));
        for (int c = 0; c < adjCities[city].size(); c++){
            if(!visited[adjCities[city].get(c)]){
                //System.out.println("visiting adjCities[city.get(c)]: "+ adjCities[city].get(c));
                dfs(adjCities[city].get(c));
            }
        }
    }

}
