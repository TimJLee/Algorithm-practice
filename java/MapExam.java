import java.util.*;

public class MapExam{
  public Map<String, Integer> makeMap(){
    Map<String, Integer> products = new HashMap<>();
    //상품의 이름과 값을 products에 추가해 보세요.
    products.put("가위",2500);
    products.put("크래파스",5000);

    return products;
  }

  public static void main(String[] args){
      MapExam e=new MapExam();
      Map<String,Integer> contents = e.makeMap();
      Set<String> keys=contents.keySet();
      Iterator<String> it=keys.iterator();
      while(it.hasNext()){
          String key=it.next();
          int value=contents.get(key);
          System.out.println(key+":"+value);
      }

  }
}
