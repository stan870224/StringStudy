public class pt{
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11,12,13}));
        
    }

    public static String getArrayData(int[] arr){
        if (arr ==  null){
            return null;
        }

        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0 ; i < arr.length; i++){
            if (i == arr.length -1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}