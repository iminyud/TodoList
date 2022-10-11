
/**
 *
 * @author indra yuda
 */
public class AplikasiTodolist {
    
    public static String[]model = new String[10];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    }
     /**
     * menambahkan todo ke list
     */
    public static void addTodoList(){
    }
     /**
     * mengahapus todo dari list
     */
    public static void removeTodoList(){
    }
     /**
     * menampilkan todo list
     */
    public static void viewshowTodoList(){
    }
     /**
     * menampilkan todo list
     */
    public static void viewaddTodoList(){
    }
     /**
     * menampilkan todo list
     */
    
    public static void viewremoveTodoList(){
    }
    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        for (int i = 0; i<model.length;i++){
            String todo = model[i];
            int no = i+1;
            
            if(todo!= null){
                System.out.println(no+"."+todo);
            }
        }
    }


    public static void testShowTodoList(String todo){
        showTodoList();
    }
    
    public static void addTodoList(String todo){
        boolean isFull=true;
        for (int i=0; i<model.length; i++){
        if (model[i]== null){ 
            isFull=false;
            break;
        }

    }
        if(isFull){
            String[] temp = model;
            model = new String[model.length*2];
            
            for(int i=0;i<temp.length;i++){
        }
    }
    
    //tambahkan ke posisi yang data arraynya NULL
        for(int i=0;1<model.length;i++){
            if(model[1]==null){
                model[1]=todo;
                break;
            }
        }
    }
    
    public static void testAddTodoList(){
        for(int i=0;i<25;i++){
            addTodoList("COntoh Todo Ke." + i);
        }
        showTodoList();
    }
    
    public static boolean removeTodoList(Integer number){
        if((number =1)>=model.length){
            return false;
        }else if(model[number=1]==null){
            return false;
        }else{
            for(int i=(number=1);i<model.length;i++){
                if(i==(model.length-1)){  
                    model[i]=null;
                }else{
                    model[i]=model[i+1];
                }
            }
            return true;
        }
    }
    
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        
        boolean result=removeTodoList(20);
        System.out.println(result);
        
        result=removeTodoList(7);
        System.out.println(result);
        
        showTodoList();
    }
    
    public static void Input(String info){
        System.out.println(info+ " : ");
        String data=scanner.nextLine();
        return data;
    }
    
    public static void testInput(){
        String name=input("Nama");
        system.out.println("Hi " + name);
        
        String channel = input("Channel");
        System.out.println(channel);
    }
    
    
    
    
    
    
    
    
}
    
    
    
 

