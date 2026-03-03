import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IRepository<Product> {

    private ArrayList<Product> productList = new ArrayList<>();
    private HashMap<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || productMap.containsKey(item.getId())) {
            return false;
        }

        productList.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null) return false;

        Product p = productMap.get(id);
        if (p == null) return false;

        productList.remove(p);
        productMap.remove(id);
        return true;
    }

    @Override
    public Product findById(String id) {
        if (id == null) return null;
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }


    public Map<String, Integer> statisticByType() {
        Map<String, Integer> result = new HashMap<>();

        for (Product p : productList) {

            if (p == null) {
                continue;
            }

            String type;

            if (p instanceof ElectronicProduct) {
                // instanceof : là một cách kiểm tra đối tượng có thuộc lớp đó k
                type = "Electronic";
            } else if (p instanceof FoodProduct) {
                type = "Food";
            } else {
                type = "Other";
            }

            result.put(type, result.getOrDefault(type, 0) + 1);
        }

        return result;
    }
}