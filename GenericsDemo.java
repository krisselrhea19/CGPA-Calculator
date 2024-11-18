class GenData<T>
{
  T obj;
  GenData(T o)
  {
   obj=o;
   }
   T getob()
   
   {
   return obj;
   }
   void showTypes()
   {
   System.out.println("Type:"+obj.getClass());
   }
   }
   class GenericsDemo
   {
     public static void main(String[] args)
     {
             GenData<Integer>iob;
             iob=new GenData<Integer>(88);
             iob.showTypes();
             
             int v=iob.getob();
             System.out.println("The value of v is "+v);
             System.out.println();
             
             GenData<String>sob;
             sob=new GenData<String>("Generics-Demo");
             sob.showTypes();
             String str=sob.getob();
             System.out.println("the string value is :"+str);
             }
             }
             
              
