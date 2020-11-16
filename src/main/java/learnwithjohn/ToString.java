package learnwithjohn;
 class Frog{
     private int id;
     private String name;
     public Frog(int id, String name){
         this.id = id;
         this.name = name;
     }

     public String toString(){
         StringBuilder sb = new StringBuilder();
         sb.append(id).append("++").append(name);
         return sb.toString();

         //return id + "+"+ name;
         //return "Hello";
         //in johns term this are not effecient coding its better;
         // if u use StringBuilder and toString Formula
     }
}

    public class ToString {
        public static void main(String[] args) {
            Frog frog1 = new Frog(7,"Rashed");
            Frog frog2 = new Frog(5,"Rahman");

                System.out.println(frog1);
                System.out.println(frog2);
    }
}
