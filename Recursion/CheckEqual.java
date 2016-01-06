class CheckEqual
{
     public static void main(String[] args)
     {

         boolean isEqual = true;
         int tmp = Integer.parseInt(args[0]);
         
          for (int i=0; i<args.length;i++){
                if(tmp!=Integer.parseInt(args[i])) isEqual=false;
                tmp=Integer.parseInt(args[i]);
          }
    
         System.out.print("All the arguments are ");
         System.out.println(isEqual ? " equal!":"not equal!");
    
    }    
}
