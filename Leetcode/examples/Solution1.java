import java.io.*;
import java.util.*;

/*
Linux commands :
cp Solution.java examples/Solution1.java
cd examples
javac Solution1.java
java Solution1
cd ..
*/

class Solution1
{
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream dataInputStream; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead;
        public Reader() 
        { 
            dataInputStream = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
        public Reader(String directory, String file_name) throws IOException 
        { 
            dataInputStream = new DataInputStream(new FileInputStream(directory+"/"+file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        }
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9');if (neg) 
                return -ret; 
            return ret; 
        }
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        }
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read();do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9');if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            }if (neg) 
                return -ret; 
            return ret; 
        }
        private void fillBuffer() throws IOException 
        { 
            bytesRead = dataInputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        }
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        }
        public void close() throws IOException 
        { 
            if (dataInputStream == null) 
                return; 
            dataInputStream.close(); 
        } 
    }

    /* IO Instructions */

    static Reader sc=new Reader();
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static int nextInt()throws IOException{return sc.nextInt();}
    public static long nextLong()throws IOException{return sc.nextLong();}
    public static double nextDouble()throws IOException{return sc.nextDouble();}
    public static String readLine()throws IOException{return sc.readLine();}
    public static void print(Object a)throws IOException{bw.write(a+"");}
    public static void printSpace(Object a)throws IOException{bw.write(a+" ");}
    public static void println(Object a)throws IOException{bw.write(a+"\n"); }
    public static void printArr(Object[] arr) throws IOException{
        for(Object a : arr)
            printSpace(a);
    }

    /* First insert a test case here */

    static void testCase() throws IOException{
        try{
            long startTime, stopTime;
            startTime = System.currentTimeMillis();
            printSpace(logic(0));
            println(0);
            stopTime = System.currentTimeMillis();
            println(stopTime - startTime+" sec");

            startTime = System.currentTimeMillis();
            printSpace(logic(4));
            println(4);
            stopTime = System.currentTimeMillis();
            println(stopTime - startTime+" sec");

            startTime = System.currentTimeMillis();
            printSpace(logic(-321));
            println(-123);
            stopTime = System.currentTimeMillis();
            println(stopTime - startTime+" sec");

            startTime = System.currentTimeMillis();
            printSpace(logic(1534236469));
            println(0);
            stopTime = System.currentTimeMillis();
            println(stopTime - startTime+" sec");

            startTime = System.currentTimeMillis();
            printSpace(logic(-2147483648));
            println(0);
            stopTime = System.currentTimeMillis();
            println(stopTime - startTime+" sec");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    static int input() throws IOException{
        return nextInt();
    }

    static int logic(int num) throws IOException{
        if(num<10 && num >-10)
            return num;
        boolean isNegative=(num<0)?true:false;
        if(isNegative)
            num*=-1;
        // println(num));
        // println(Integer.MIN_VALUE));
        if(num>=Integer.MAX_VALUE | num<=Integer.MIN_VALUE)
            return 0;
        int newNum=0;
        while(num!=0){
            if(Long.valueOf(Integer.MAX_VALUE)<Long.valueOf(Long.valueOf(newNum*10L)+Long.valueOf(num%10)))
                return 0;
            // printSpace(Long.valueOf(Long.valueOf(newNum*10L)+Long.valueOf(num%10))));
            // println((long)(Integer.MAX_VALUE)));
            newNum=newNum*10+num%10;
            num/=10;
        }
        if(isNegative)
            newNum*=-1;
        return newNum;
    }

    public static void main(String args[])throws IOException
    {
        // int n=0;
        try{
        //     n=input();
        // println(logic(n)));
        testCase();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        bw.flush();
        bw.close();
    }
}