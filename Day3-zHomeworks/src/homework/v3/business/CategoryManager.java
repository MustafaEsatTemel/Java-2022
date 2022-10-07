package homework.v3.business;

import homework.v3.dataAccess.IBaseDao;
import homework.v3.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    public static List<String> categories = new ArrayList<>();

    public CategoryManager() {

    }
    public void add(Category category) throws Exception {
        if(categories.contains(category.getCategoryName())){
            throw new Exception("Bu adda kategori bulunmakta.");
        }else{
            System.out.println("Category added : "+category.getCategoryName());
            categories.add(category.getCategoryName());

        }
    }


}
