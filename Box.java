public class Box{
int hight;
int width;
int depth;

   public Box(int hight,int width,int depth)
   {
   this.hight=hight;
   this.width=width;
   this.depth=depth;
   }
   int volume(){
        return hight*width*depth;
   }
   public static void main(String args[]){
	   Box b=new Box(1,2,3);
	   System.out.println("Volume = "+b.volume());
   }
}