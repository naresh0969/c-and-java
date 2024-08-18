/*3. Write a Program using Threads to simulate a traffic light. The Signal lights should glow
after each 10 second, one by one. For example: Firstly Red, then after 10 seconds, red
will be put to off and yellow will start glowing and then accordingly green.
 */
package B201013.Lab9B;
class TrafficT extends Thread{
    private String arr[]={"RED","YELLOW","GREEN"};
    private int index=0;
    public void run(){
        while(true){
            try{
                System.out.println(arr[index]);
                sleep(10000);
                index=(index+1)%arr.length;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
}
public class Traffic {
    public static void main(String args[]){
        TrafficT t1=new TrafficT();
        t1.start();
    }
    
}

