import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> shopcar = new ArrayList<>();
        String[] list = {"Java book","pencil","pencil2","shoes","pencil3","pencil4"};
        
        for (int i = 0; i < list.length; i++) {
            shopcar.add(list[i]);
        }
        
        for (int i = 0 ; i < shopcar.size() ; i++){
            if (shopcar.get(i).contains("pencil")){
                shopcar.remove(i);
                i--;
            }
        }
        System.out.println(shopcar);
    }
}
